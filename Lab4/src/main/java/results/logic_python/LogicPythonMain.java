package results.logic_python;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.text.ParseException;


public class LogicPythonMain {
    public static void main(String[] args) throws IOException {
        InputStream is = Files.newInputStream(Path.of("src\\main\\java\\results\\logic_python\\Example.txt"));
        try {
            LogicPythonLexer lexer = new LogicPythonLexer(is);
            LogicPythonParser parser = new LogicPythonParser(lexer);
            System.out.println(parser.expr());
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}