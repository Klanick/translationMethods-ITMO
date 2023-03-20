package results.calculator;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.text.ParseException;


public class CalculatorMain {
    public static void main(String[] args) throws IOException {
        InputStream is = Files.newInputStream(Path.of("src\\main\\java\\results\\calculator\\Example.txt"));
        try {
            CalculatorLexer lexer = new CalculatorLexer(is);
            CalculatorParser parser = new CalculatorParser(lexer);
            System.out.println(parser.expr());
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}