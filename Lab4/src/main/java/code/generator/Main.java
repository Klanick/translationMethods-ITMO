package code.generator;

import code.generator.recognizer.GeneratorRecogniseBuilder;
import code.generator.recognizer.Recognize;
import code.recognizer.GeneratorLexer;
import code.recognizer.GeneratorParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.*;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) {
        generate("src/main/java/grammar_sources/LogicPythonGrammar");
        generate("src/main/java/grammar_sources/CalculatorGrammar");
    }

    public static void generate(String fn) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fn))) {
            GeneratorLexer lexer = new GeneratorLexer(CharStreams.fromReader(bufferedReader));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            GeneratorParser parser = new GeneratorParser(tokens);
            ParseTree tree = parser.generator();
            ParseTreeWalker walker = new ParseTreeWalker();
            GeneratorRecogniseBuilder recogniseBuilder = new GeneratorRecogniseBuilder();
            walker.walk(recogniseBuilder, tree);

            Recognize recognize = recogniseBuilder.buildRecognize();
            String outPackageName = "results";
            Generator generator = new Generator(recognize,
                    Path.of("src/main/java/code/generator/template/"),
                    Path.of("src/main/java/"),
                    outPackageName);
            generator.generate();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
