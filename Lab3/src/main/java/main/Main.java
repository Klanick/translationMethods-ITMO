package main;

import gen.*;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) throws Exception {
        CharStream is = CharStreams.fromPath(Path.of("src\\main\\java\\main\\Example.txt"));

        JavaProgramLexer lexer = new JavaProgramLexer(is);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JavaProgramParser parser = new JavaProgramParser(tokens);
        ParseTree tree = parser.program();
        ParseTreeWalker walker = new ParseTreeWalker();
        JavaProgramFormatListener formatListener = new JavaProgramFormatListener();
        walker.walk(formatListener, tree);
        System.out.println(formatListener.tree.result);
    }
}