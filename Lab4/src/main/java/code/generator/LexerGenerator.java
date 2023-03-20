package code.generator;

import code.generator.recognizer.Recognize;

import java.io.IOException;
import java.util.stream.Collectors;

public class LexerGenerator extends BaseGenerator {

    public LexerGenerator(Recognize recognize, PathMeta pathMeta) throws IOException {
        super(recognize, LEXICAL_ANALYZER_NAME, pathMeta);
    }

    @Override
    protected String generate() {
        return postHandleTemplate(
                template
                        .replace("$$allTokenRegexp$$",
                                "\"" +
                                        recognize.getTokensList().stream()
                                                .map(tokenDef -> unWrap(tokenDef.regExp)).collect(Collectors.joining("|")) +
                                        "\""
                        )
                        .replace("$$tokenEnumMap$$",
                                recognize.getTokensList().stream()
                                        .map(tokenDef -> getTokenEnum(tokenDef.id) + ", "  + tokenDef.regExp)
                                        .collect(Collectors.joining(",\n"))
                        )
                        .replace("$$tokenEnumEOF$$", getTokenEnum(EOF))
                        .replace("$$tokenModeSkip$$", getTokenMode(Skip))
        );
    }
}
