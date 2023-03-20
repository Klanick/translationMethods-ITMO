package code.generator;

import code.generator.recognizer.GeneratorRecogniseBuilder;
import code.generator.recognizer.Recognize;

import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class ParserGenerator extends BaseGenerator {
    static String Eps = "$Eps";
    final Map<String, Set<String>> FIRST;
    final Map<String, Set<String>> FOLLOW;

    final private String parserSubTemplate;
    final private String caseRuleSubTemplate;



    public ParserGenerator(Recognize recognize, PathMeta pathMeta) throws IOException {
        super(recognize, PARSER_NAME, pathMeta);
        FIRST = new HashMap<>();
        FOLLOW = new HashMap<>();
        constructFIRST();
        constructFOLLOW();

        parserSubTemplate = loadSubTemplate(PARSER_NAME, "NonTermParser");
        caseRuleSubTemplate = loadSubTemplate(PARSER_NAME, "CaseRule");
    }

    private  Set<String> first(List<GeneratorRecogniseBuilder.RuleElement> rule, int fromIndex) {
        Set<String> first = new HashSet<>();
        int i = fromIndex;
        while (true) {
            if (i >= rule.size()) {
                first.add(Eps);
                break;
            }

            GeneratorRecogniseBuilder.RuleElement ruleElement = rule.get(i);
            if (ruleElement instanceof GeneratorRecogniseBuilder.TokenRuleElement) {
                first.add(((GeneratorRecogniseBuilder.TokenRuleElement) ruleElement).id);
                break;
            } else if (ruleElement instanceof GeneratorRecogniseBuilder.NonTermRuleElement) {
                Set<String> addSet = FIRST.get(((GeneratorRecogniseBuilder.NonTermRuleElement) ruleElement).id);
                addSet.stream().filter(e -> !e.equals(Eps)).forEach(first::add);

                if (!addSet.contains(Eps)) {
                    break;
                }
            }
            i++;
        }
        return first;
    }

    private void constructFIRST() {
        recognize.nonTermMap.keySet().forEach(id -> FIRST.put(id, new HashSet<>()));
        boolean changed = true;
        while (changed) {
            changed = recognize.getNonTermList().stream().anyMatch(nonTermDef -> {
                Set<String> first = FIRST.get(nonTermDef.id);
                int oldSize = first.size();

                nonTermDef.rules.forEach(rule -> first.addAll(first(rule, 0)));

                int newSize = first.size();
                return newSize > oldSize;
            });
        }
    }

    public boolean isLL1() {
        return recognize.getNonTermList().stream().noneMatch(
                A -> {
                    boolean existCommon = false;
                    for (int i = 0; i < A.rules.size(); i++) {
                        for (int j = i + 1; j < A.rules.size(); j++) {
                            List<GeneratorRecogniseBuilder.RuleElement> a = A.rules.get(i);
                            List<GeneratorRecogniseBuilder.RuleElement> b = A.rules.get(j);
                            Set<String> first1a = first1(a, A), first1b = first1(b, A);
                            first1a.retainAll(first1b);
                            existCommon = (existCommon || !first1a.isEmpty());
                        }
                    }
                    return existCommon;
                }
        );
    }

    private void constructFOLLOW() {
        recognize.nonTermMap.keySet().forEach(id -> FOLLOW.put(id, new HashSet<>()));
        boolean changed = true;
        while (changed) {
            changed = recognize.getNonTermList().stream().anyMatch(nonTermDef -> {
                Set<String> followA = FOLLOW.get(nonTermDef.id);
                return nonTermDef.rules.stream().anyMatch(rule -> {
                    boolean localChanged = false;
                    for(int i = 0; i < rule.size(); i++) {
                        if (rule.get(i) instanceof GeneratorRecogniseBuilder.NonTermRuleElement) {
                            Set<String> followB = FOLLOW.get((
                                    (GeneratorRecogniseBuilder.NonTermRuleElement) rule.get(i)).id);
                            int oldSize = followB.size();

                            Set<String> firstUpdate = first(rule, i + 1);
                            if (firstUpdate.remove(Eps)) {
                                followB.addAll(followA);
                            }
                            followB.addAll(firstUpdate);
                            int newSize = followB.size();
                            localChanged = localChanged || newSize > oldSize;
                        }
                    }
                    return localChanged;
                });
            });
        }
    }

    private  Set<String> first1(List<GeneratorRecogniseBuilder.RuleElement> rule,
                                GeneratorRecogniseBuilder.NonTermDef nonTerm) {
        Set<String> first1 = first(rule, 0);
        if (first1.remove(Eps)) {
            first1.addAll(FOLLOW.get(nonTerm.id));
        }
        return first1;
    }

    @Override
    protected String generate() {
        return postHandleTemplate(template
                .replace("$$imports$$", recognize.importList.stream()
                        .map(src -> "import " + src + ";")
                        .collect(Collectors.joining("\n")))
                .replace("$$codeInsert$$", recognize.codeInsert)
                .replace("$$nonTermParsers$$", generateNonTermParsers())
        );
    }

    private String generateNonTermParsers() {
        StringBuilder res = new StringBuilder();
        for (GeneratorRecogniseBuilder.NonTermDef nonTerm : recognize.getNonTermList()) {
            String parser = parserSubTemplate.replace("$$name$$", nonTerm.id);

            if (nonTerm.resType != null) {
                parser = parser
                        .replace("$$resDeclare$$", "$$resType$$ $$res$$ = null;")
                        .replace("$$resReturn$$", "return $$res$$;")
                        .replace("$$res$$", getRes(0))
                        .replace("$$resType$$", nonTerm.resType);
            } else {
                parser = parser
                        .replace("$$resType$$", "void");
            }

            if (nonTerm.argType != null) {
                parser = parser.replace("$$arg$$", getArg(0))
                        .replace("$$argType$$", nonTerm.argType);
            }

            res.append(
                    parser
                            .replaceAll("\\$\\$(arg|res).*\\$\\$", "")
                            .replace("$$caseRules$$", generateCaseRules(nonTerm))
            ).append("\n\n");
        }

        return res.toString();
    }

    private String generateCaseRules(GeneratorRecogniseBuilder.NonTermDef nonTerm) {
        StringBuilder res = new StringBuilder();
        for (List<GeneratorRecogniseBuilder.RuleElement> rule: nonTerm.rules) {
            res.append(
                    caseRuleSubTemplate
                            .replace("$$casesTokens$$", generateCases(rule, nonTerm))
                            .replace("$$declareArgs$$", generateDeclareArgs(rule))
                            .replace("$$parseRuleElements$$", generateParseRuleElements(rule))
            );
            res.append("\n");
        }
        return res.toString();
    }

    private String generateCases(List<GeneratorRecogniseBuilder.RuleElement> rule,
                                 GeneratorRecogniseBuilder.NonTermDef nonTerm) {
        return  first1(rule, nonTerm).stream()
                .map(tokenId -> "case " + tokenId + ":")
                .collect(Collectors.joining("\n"));
    }

    String ARG = "arg";

    private String getArg(int index) {
        return ARG + index;
    }

    String RES = "res";
    private String getRes(int index) {
        return RES + index;
    }



    private String generateDeclareArgs(List<GeneratorRecogniseBuilder.RuleElement> rule) {
        StringBuilder res = new StringBuilder();
        int ind = 0;
        for (GeneratorRecogniseBuilder.RuleElement ruleElement : rule) {
            if (ruleElement instanceof GeneratorRecogniseBuilder.NonTermRuleElement) {
                ind++;
                GeneratorRecogniseBuilder.NonTermDef nonTerm =
                        recognize.nonTermMap.get(((GeneratorRecogniseBuilder.NonTermRuleElement) ruleElement).id);
                if (nonTerm.argType != null) {
                    res.append("$$type$$ $$arg$$ = null;"
                            .replace("$$type$$", nonTerm.argType)
                            .replace("$$arg$$", getArg(ind))
                    ).append("\n");
                }
            } else if (ruleElement instanceof GeneratorRecogniseBuilder.TokenRuleElement) {
                ind++;
            }
        }
        return res.toString();
    }

    private String generateParseRuleElements(List<GeneratorRecogniseBuilder.RuleElement> rule) {
        StringBuilder res = new StringBuilder();
        int ind = 0;
        for (GeneratorRecogniseBuilder.RuleElement ruleElement : rule) {
            if (ruleElement instanceof GeneratorRecogniseBuilder.NonTermRuleElement) {
                ind++;
                GeneratorRecogniseBuilder.NonTermDef nonTerm =
                        recognize.nonTermMap.get(((GeneratorRecogniseBuilder.NonTermRuleElement) ruleElement).id);
                res.append("$$saveRes$$ $$name$$($$arg$$);"
                        .replace("$$saveRes$$", nonTerm.resType == null ? ""
                                : "$$resType$$ $$res$$ ="
                                        .replace("$$resType$$", nonTerm.resType)
                                        .replace("$$res$$", getRes(ind)))

                        .replace("$$arg$$", (nonTerm.argType == null ? "" : getArg(ind)))
                        .replace("$$name$$", nonTerm.id));
            } else if (ruleElement instanceof GeneratorRecogniseBuilder.TokenRuleElement) {
                ind++;
                String localTemplate =
                        "assert lex.curToken.tokenEnum == $$tokenEnum$$;\n" +
                        "String $$res$$ = lex.curToken().text;\n" +
                        "lex.nextToken();";


                res.append(localTemplate
                        .replace("$$tokenEnum$$",
                                getTokenEnum(((GeneratorRecogniseBuilder.TokenRuleElement) ruleElement).id))
                        .replace("$$res$$", getRes(ind)));
            } else if (ruleElement instanceof GeneratorRecogniseBuilder.TransRuleElement) {
                GeneratorRecogniseBuilder.TransDef trans =
                        recognize.transMap.get(((GeneratorRecogniseBuilder.TransRuleElement) ruleElement).id);
                String code = trans.code;

                for (int i = 0; i < trans.argAliases.size(); i++) {
                    code = code.replace(
                            trans.argAliases.get(i),
                            ((GeneratorRecogniseBuilder.TransRuleElement) ruleElement).argAliases.get(i)
                    );
                }

                for (int i = 0; i < trans.resAliases.size(); i++) {
                    code = code.replace(
                            trans.resAliases.get(i),
                            ((GeneratorRecogniseBuilder.TransRuleElement) ruleElement).resAliases.get(i)
                    );
                }

                res.append(code);
            } else if (ruleElement instanceof GeneratorRecogniseBuilder.CodeRuleElement) {
                res.append(((GeneratorRecogniseBuilder.CodeRuleElement) ruleElement).code);
            }
            res.append("\n");
        }
        return res.toString();
    }
}
