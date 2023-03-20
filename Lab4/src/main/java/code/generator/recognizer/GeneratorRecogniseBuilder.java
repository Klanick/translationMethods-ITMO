package code.generator.recognizer;

import code.recognizer.GeneratorBaseListener;
import code.recognizer.GeneratorParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.misc.Interval;

import java.util.*;
import java.util.stream.Collectors;

public class GeneratorRecogniseBuilder extends GeneratorBaseListener {
    private String grammarId;

    private String codeInsert = "";
    private final List<String> importList = new ArrayList<>();

    private final Map<String, GeneratorRecogniseBuilder.NonTermDef> nonTermMap = new TreeMap<>();
    private final Map<String, GeneratorRecogniseBuilder.TokenDef> tokensMap = new TreeMap<>();
    private final Map<String, GeneratorRecogniseBuilder.TransDef> transMap = new HashMap<>();

    private final List<GeneratorRecogniseBuilder.NonTermDef> nonTermList = new ArrayList<>();
    private final List<GeneratorRecogniseBuilder.TokenDef> tokensList = new ArrayList<>();

    public Recognize buildRecognize() {
        return new Recognize(grammarId, codeInsert, importList, nonTermMap, tokensMap, transMap, nonTermList, tokensList);
    }

    private void putNonTerm(NonTermDef nonTerm) {
        nonTermMap.put(nonTerm.id, nonTerm);
        nonTermList.add(nonTerm);
    }

    private void putToken(TokenDef token) {
        tokensMap.put(token.id, token);
        tokensList.add(token);
    }

    private void putTrans(TransDef trans) {
        transMap.put(trans.id, trans);
    }

    public static class TransDef {
        public final String id;
        public final List<String> argAliases, resAliases;
        public final String code;

        TransDef (String id, List<String> argAliases, List<String> resAliases, String code) {
            this.id = id;
            this.argAliases = argAliases;
            this.resAliases = resAliases;
            this.code = code;
        }
    }

    public interface RuleElement {}

    public static class TransRuleElement implements RuleElement {
        public final String id;
        public final List<String> argAliases, resAliases;

        TransRuleElement (String id, List<String> argAliases, List<String> resAliases) {
            this.id = id;
            this.argAliases = argAliases;
            this.resAliases = resAliases;
        }
    }

    public static class CodeRuleElement implements RuleElement {
        public final String code;

        CodeRuleElement(String code) {
            this.code = code;
        }
    }

    public static class NonTermRuleElement implements RuleElement {
        public final String id;

        NonTermRuleElement(String id) {
            this.id = id;
        }
    }

    public static class TokenRuleElement implements RuleElement {
        public final String id;

        TokenRuleElement(String id) {
            this.id = id;
        }
    }


    public static class NonTermDef {
        public final String id;
        public final String argType;
        public final String resType;
        public final List<List<RuleElement>> rules;

        NonTermDef(String id, String argType, String resType, List<List<RuleElement>> rules) {
            this.id = id;
            this.argType = argType;
            this.resType = resType;
            this.rules = rules;
        }
    }

    public static class TokenDef {
        public enum TokenMode {
            Normal, Skip
        }

        public final String id;
        public final String regExp;
        public final TokenMode tokenMode;

        TokenDef(String id, String regExp, TokenMode tokenMode) {
            this.id = id;
            this.regExp = regExp;
            this.tokenMode = tokenMode;
        }
    }

    @Override public void exitGrammarLine(GeneratorParser.GrammarLineContext ctx) {
        grammarId = ctx.TokenID().toString();
        if (ctx.CodeInsert() != null) {
            codeInsert = unWrap(ctx.CodeInsert().toString());
        }
    }

    @Override public void exitImportSource(GeneratorParser.ImportSourceContext ctx) {
        importList.add(getText(ctx));
    }

    @Override public void exitTokenDef(GeneratorParser.TokenDefContext ctx) {
        TokenDef.TokenMode tokenMode = TokenDef.TokenMode.Normal;
        if (ctx.tokenMode() != null) {
            if (ctx.tokenMode().command().skipCommand() != null) {
                tokenMode = TokenDef.TokenMode.Skip;
            }
        }
        TokenDef token = new TokenDef(ctx.TokenID().toString(), ctx.Regexp().toString(), tokenMode);
        putToken(token);
    }

    @Override public void exitTransDef(GeneratorParser.TransDefContext ctx) {
        List<String> argIdSeq = new ArrayList<>();
        if (ctx.argIdSeq() != null) {
            argIdSeq =  ctx.argIdSeq()
                    .idSeqInScope().id().stream()
                    .map(idCtx -> idCtx.children.get(0).toString())
                    .collect(Collectors.toList());
        }

        List<String> resIdSeq = new ArrayList<>();
        if (ctx.resIdSeq() != null) {
            resIdSeq =  ctx.resIdSeq()
                    .idSeqInScope().id().stream()
                    .map(idCtx -> idCtx.children.get(0).toString())
                    .collect(Collectors.toList());
        }

        TransDef trans = new TransDef(
                ctx.TransID().toString(),
                argIdSeq,
                resIdSeq,
                ctx.CodeInsert().toString()
        );
        putTrans(trans);
    }

    @Override public void exitNonTermDef(GeneratorParser.NonTermDefContext ctx) {
        String argType;
        if (ctx.argType() == null) {
            argType = null;
        } else {
            argType = unWrap(getText(ctx.argType().anyScope()));
        }

        String resType;
        if (ctx.resType() == null) {
            resType = null;
        } else {
            resType = unWrap(getText(ctx.resType().anyScope()));
        }
        List<List<RuleElement>> rules = ctx.nonTermRules().nonTermRule().stream().map(ruleCtx ->
            ruleCtx.nonTermRuleElement().stream().map(ruleElement -> {
                if (ruleElement.NonTermID() != null) {
                    return new NonTermRuleElement(ruleElement.NonTermID().toString());
                } else if (ruleElement.TokenID() != null) {
                    return new TokenRuleElement(ruleElement.TokenID().toString());
                } else if (ruleElement.CodeInsert() != null) {
                    return new CodeRuleElement(unWrap(ruleElement.CodeInsert().toString()));
                } else if (ruleElement.transCall() != null) {
                    List<String> argAliases = new ArrayList<>();
                    if (ruleElement.transCall().argSeq() != null) {
                        argAliases = ruleElement.transCall().argSeq().seqInScope().elemInScope()
                                .stream()
                                .map(GeneratorRecogniseBuilder::getText)
                                .collect(Collectors.toList());
                    }
                    List<String> resAliases = new ArrayList<>();
                    if (ruleElement.transCall().resSeq() != null) {
                        resAliases = ruleElement.transCall().resSeq().seqInScope().elemInScope()
                                .stream()
                                .map(GeneratorRecogniseBuilder::getText)
                                .collect(Collectors.toList());
                    }

                    return new TransRuleElement(
                            ruleElement.transCall().TransID().toString(),
                            argAliases,
                            resAliases
                    );
                }
                return null;
            }).collect(Collectors.toList())
        ).collect(Collectors.toList());

        NonTermDef nonTerm = new NonTermDef(ctx.NonTermID().toString(), argType, resType, rules);
        putNonTerm(nonTerm);
    }

    private static String unWrap(String arg) {
        return arg.substring(1, arg.length() - 1);
    }

    private static String getText(ParserRuleContext ctx) {
        Interval interval = new Interval(ctx.start.getStartIndex(), ctx.stop.getStopIndex());
        return ctx.start.getInputStream().getText(interval);
    }
}
