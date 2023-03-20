package code.generator;

import code.generator.recognizer.Recognize;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.regex.Pattern;

public abstract class BaseGenerator {
    protected final Recognize recognize;

    protected final String name;
    protected final PathMeta pathMeta;
    protected final String template;

    public BaseGenerator(Recognize recognize, String name, PathMeta pathMeta) throws IOException {
        this.recognize = recognize;
        this.name = name;
        this.pathMeta = pathMeta;
        this.template = loadBaseTemplate(name);
    }

    protected static final String TOKEN_NAME = "Token";
    protected static final String LEXICAL_ANALYZER_NAME = "Lexer";
    protected static final String PARSER_NAME = "Parser";

    protected static String getTemplateName(String name) {
        return name + "Template";
    }

    protected String getGeneratedName(String name) {
        return recognize.id + name;
    }

    protected static final String ENUM = "Enum";
    protected static final String MODE = "Mode";

    protected static String getSubclass(String name, String subName) {
        return name + subName;
    }

    protected String getField(String name, String field) {
        return name + "." + field;
    }

    protected String getFullSubclassName(String name, String subName) {
        return getField(getGeneratedName(name), getSubclass(name, subName));
    }

    protected String getTokenEnum(String name) {
        return getField(getFullSubclassName(TOKEN_NAME, ENUM), name);
    }
    protected String getTokenMode(String name) {
        return getField(getFullSubclassName(TOKEN_NAME, MODE), name);
    }

    protected static final String EOF = "EOF";
    protected static final String Skip = "Skip";

    protected String loadTemplate(String name) throws IOException {
        return Files.readString(
                pathMeta.templatePath.resolve(getTemplateName(name)),
                StandardCharsets.UTF_8
        );
    }

    protected String loadBaseTemplate(String name) throws IOException {
        return loadTemplate(name)
                .replace("$$package$$", pathMeta.packageName)
                .replace("$$name$$", getGeneratedName(name));
    }

    protected static String getDirectoryName(String name) {
        String split = Pattern.compile("([A-Z]+[a-z]*)").matcher(name).replaceAll("_$1");
        return Pattern.compile("^_").matcher(split).replaceAll("").toLowerCase();
    }

    protected String loadSubTemplate(String name, String subName) throws IOException {
        return loadTemplate(getDirectoryName(name) + "/" + subName);
    }

    protected String postHandleTemplate(String template) {
        return cleanUp(template
                .replace("$$Token$$", getGeneratedName(TOKEN_NAME))
                .replace("$$TokenEnum$$", getFullSubclassName(TOKEN_NAME, ENUM))
                .replace("$$TokenMode$$", getFullSubclassName(TOKEN_NAME, MODE))
                .replace("$$Lexer$$", getGeneratedName(LEXICAL_ANALYZER_NAME))
                .replace("$$Parser$$", getGeneratedName(PARSER_NAME)));
    }

    protected static String cleanUp(String template) {
        return template.replaceAll("\\$\\$[\\p{L}_]+\\$\\$", "");
    }

    protected abstract String generate();

    protected Path getFilePath(String name) {
        return pathMeta.generatedPath.resolve(name);
    }

    protected void writeFile(Path path, String text) throws IOException {
        try (BufferedWriter bufferedWriter = Files.newBufferedWriter(path)) {
            bufferedWriter.write(text);
        }
    }

    protected void createGenerated() throws IOException {
        writeFile(getFilePath(getGeneratedName(name) + ".java"), generate());
    }

    protected static String unWrap(String arg) {
        return arg.substring(1, arg.length() - 1);
    }
}
