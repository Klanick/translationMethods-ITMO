package code.generator;

import code.generator.recognizer.GeneratorRecogniseBuilder;
import code.generator.recognizer.Recognize;

import java.io.IOException;
import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TokenGenerator extends BaseGenerator {

    public TokenGenerator(Recognize recognize, PathMeta pathMeta) throws IOException {
        super(recognize, TOKEN_NAME, pathMeta);
    }

    @Override
    public String generate() {
        return postHandleTemplate(
                template.replace("$$TokenEnumValues$$", Stream.concat(
                                recognize.getTokensList().stream().map(token -> {
                                    if (token.tokenMode == GeneratorRecogniseBuilder.TokenDef.TokenMode.Normal) {
                                        return token.id +  "(" + token.regExp + ")";
                                    }
                                    return token.id
                                            +  "("
                                            + token.regExp + ","
                                            + getField(getSubclass(TOKEN_NAME, MODE), token.tokenMode.toString())
                                            + ")";
                                }), Stream.of(EOF))
                                .collect(Collectors.joining(",\n")))
                        .replace("$$TokenModeValues$$", String.join(",\n", Stream.concat(
                                Arrays.stream(GeneratorRecogniseBuilder.TokenDef.TokenMode.values()).map(Objects::toString),
                                Stream.of("Normal", "Skip")
                        ).collect(Collectors.toSet())))
                        .replace("$$TokenEnum$$", getSubclass(TOKEN_NAME, ENUM))
                        .replace("$$TokenMode$$", getSubclass(TOKEN_NAME, MODE))
        );
    }
}
