package code.generator;

import code.generator.recognizer.Recognize;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Generator {
    private final Recognize recognize;
    private final PathMeta pathMeta;
    public boolean log = true;

    Generator(Recognize recognize, Path templatePath, Path outputPath) {
        this.recognize = recognize;
        this.pathMeta = new PathMeta(templatePath, recognize.id, outputPath);
    }

    Generator(Recognize recognize, Path templatePath, Path outputPath, String outPackageName) {
        this.recognize = recognize;
        this.pathMeta = new PathMeta(templatePath, outPackageName, recognize.id, outputPath);
    }

    public void generate() throws IOException {
        TokenGenerator tokenGenerator = new TokenGenerator(recognize, pathMeta);
        LexerGenerator lexerGenerator  = new LexerGenerator(recognize, pathMeta);
        ParserGenerator parserGenerator = new ParserGenerator(recognize, pathMeta);
        MainGenerator mainGenerator = new MainGenerator(recognize, pathMeta);

        if (parserGenerator.isLL1()) {
            Files.createDirectories(pathMeta.generatedPath);
            tokenGenerator.createGenerated();
            lexerGenerator.createGenerated();
            parserGenerator.createGenerated();
            mainGenerator.createGenerated();

            log("Translator successfully created at path: " + pathMeta.generatedPath);
        } else {
            log("Translator can't be created. Grammar is not LL(1)");
        }
    }

    private void log(String message) {
        if (log) {
            System.out.println(message);
        }
    }
}

class PathMeta {
    public final String packageName;
    public final Path templatePath;
    public final Path generatedPath;

    PathMeta(Path templatePath, String grammarId, Path outputPath) {
        this.packageName = BaseGenerator.getDirectoryName(grammarId);
        this.templatePath = templatePath;
        this.generatedPath = outputPath.resolve(packageName.replace(".", "/"));
    }

    PathMeta(Path templatePath, String outPackageName, String grammarId, Path outputPath) {
        this.packageName = outPackageName + "." + BaseGenerator.getDirectoryName(grammarId);
        this.templatePath = templatePath;
        this.generatedPath = outputPath.resolve(packageName.replace(".", "/"));
    }
}
