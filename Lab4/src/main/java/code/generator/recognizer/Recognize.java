package code.generator.recognizer;

import java.util.Collection;
import java.util.List;
import java.util.Map;

public class Recognize {
    public final String id;

    public final String codeInsert;
    public final List<String> importList;

    public final Map<String, GeneratorRecogniseBuilder.NonTermDef> nonTermMap;
    public final Map<String, GeneratorRecogniseBuilder.TokenDef> tokensMap;
    public final Map<String, GeneratorRecogniseBuilder.TransDef> transMap;

    private final Collection<GeneratorRecogniseBuilder.NonTermDef> nonTermList;
    private final Collection<GeneratorRecogniseBuilder.TokenDef> tokensList;


    public Recognize(String id,
                     String codeInsert,
                     List<String> importList,
                     Map<String, GeneratorRecogniseBuilder.NonTermDef> nonTermMap,
                     Map<String, GeneratorRecogniseBuilder.TokenDef> tokensMap,
                     Map<String, GeneratorRecogniseBuilder.TransDef> transMap) {
        this(id, codeInsert, importList, nonTermMap, tokensMap, transMap,
                nonTermMap.values(),
                tokensMap.values());
    }

    public Recognize(String id,
                     String codeInsert,
                     List<String> importList,
                     Map<String, GeneratorRecogniseBuilder.NonTermDef> nonTermMap,
                     Map<String, GeneratorRecogniseBuilder.TokenDef> tokensMap,
                     Map<String, GeneratorRecogniseBuilder.TransDef> transMap,
                     Collection<GeneratorRecogniseBuilder.NonTermDef> nonTermList,
                     Collection<GeneratorRecogniseBuilder.TokenDef> tokensList
                     ) {
        this.id = id;

        this.codeInsert = codeInsert;
        this.importList = importList;

        this.nonTermMap = nonTermMap;
        this.tokensMap = tokensMap;
        this.transMap = transMap;

        this.nonTermList = nonTermList;
        this.tokensList = tokensList;
    }

    public Collection<GeneratorRecogniseBuilder.NonTermDef> getNonTermList() {
        return nonTermList;
    }

    public Collection<GeneratorRecogniseBuilder.TokenDef> getTokensList() {
        return tokensList;
    }
}
