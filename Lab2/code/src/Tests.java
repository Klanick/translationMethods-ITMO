import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(Suite.class)
@Suite.SuiteClasses({Tests.SyntaxAnalyzerTests.class, Tests.LexicalAnalyzerTests.class})
public class Tests {
    public static class LexicalAnalyzerTests {
        private static List<Token> getTokens(LexicalAnalyzer lex) throws ParseException {
            List<Token> list = new ArrayList<>();
            lex.nextToken();
            while (!Token.END.equals(lex.curToken)) {
                list.add(lex.curToken);
                lex.nextToken();
            }
            ;
            return list;
        }

        private static List<Token> getTokens(LexicalAnalyzer lex, int n) throws ParseException {
            List<Token> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                lex.nextToken();
                list.add(lex.curToken);
            }
            return list;
        }

        @Test
        public void EmptyEnd() throws ParseException {
            LexicalAnalyzer lex = new LexicalAnalyzer("");
            assertTrue(getTokens(lex, 10).stream().allMatch(Token.END::equals));
        }


        @Test
        public void TokensWithoutSpace() throws ParseException {
            LexicalAnalyzer lex = new LexicalAnalyzer("(x(or(xor(and(not()");
            assertEquals(getTokens(lex),
                    List.of(Token.LPAREN, Token.N,
                            Token.LPAREN, Token.OR,
                            Token.LPAREN, Token.XOR,
                            Token.LPAREN, Token.AND,
                            Token.LPAREN, Token.NOT,
                            Token.LPAREN, Token.RPAREN)
            );
        }

        @Test
        public void WhitSpace() throws ParseException {
            LexicalAnalyzer lex = new LexicalAnalyzer("   \t \n \r    x     \t  \n \r ");
            assertEquals(getTokens(lex), List.of(Token.N));
        }

        @Test(expected = ParseException.class)
        public void InvalidWordToken() throws ParseException {
            getTokens(new LexicalAnalyzer("xorx"));
        }

        @Test(expected = ParseException.class)
        public void InvalidNonLetterToken() throws ParseException {
            getTokens(new LexicalAnalyzer("-"));
        }

        @Test
        public void WordTokensWithSpace() throws ParseException {
            LexicalAnalyzer lex = new LexicalAnalyzer(" x or\txor\nand\rnot  ");
            assertEquals(getTokens(lex),
                    List.of(Token.N,
                            Token.OR,
                            Token.XOR,
                            Token.AND,
                            Token.NOT)
            );
        }
    }

    public static class SyntaxAnalyzerTests {
        Parser parser = new Parser();

        private List<Token> getListFromTree(Tree tree) {
            List<Token> list = new ArrayList<>();
            addListFromTree(tree, list);
            return list;
        }

        private void addListFromTree(Tree tree, List<Token> list) {
            if (tree.children.isEmpty()) {
                switch (tree.node) {
                    case "(":
                    case ")":
                    case "n":
                    case "or":
                    case "xor":
                    case "and":
                    case "not":
                        list.add(stringToToken(tree.node));
                    case "Ɛ":
                        break;
                    default:
                        throw new AssertionError();
                }
            } else {
                for (Tree child : tree.children) {
                    addListFromTree(child, list);
                }
            }
        }

        private Token stringToToken(String s) {
            switch (s) {
                case "(":
                    return Token.LPAREN;
                case ")":
                    return Token.RPAREN;
                case "n":
                    return Token.N;
                case "or":
                    return Token.OR;
                case "xor":
                    return Token.XOR;
                case "and":
                    return Token.AND;
                case "not":
                    return Token.NOT;
                default:
                    return null;
            }
        }

        private void testSample(String sample) {
            try {
                assertEquals(
                        getListFromTree(parser.parse(sample)),
                        LexicalAnalyzerTests.getTokens(new LexicalAnalyzer(sample))
                );
            } catch (ParseException ignored) {
                throw new AssertionError();
            }
        }

        private void testInvalidSample(String sample) {
            try {
                getListFromTree(parser.parse(sample));
            } catch (ParseException | AssertionError e) {
                return;
            }
            throw new AssertionError();
        }

        @Test
        public void TestSamples() {
            List<String> samples = List.of(
                    "a",
                    "(( not (((a))) ))",
                    "not not a",
                    "(a) or not (b)",
                    "(a) xor not (b)",
                    "(a) and not (b)",
                    "a and a and a xor a xor a or a and a or a",
                    "(a and b) or not (c xor (a or not b))"
            );
            samples.forEach(this::testSample);
        }

        @Test
        public void TestInvalidSamples() throws ParseException {
            List<String> samples = List.of(
                    "not b)",
                    "a a",
                    "()",
                    "x or",
                    "x xor",
                    "x and",
                    "x not",
                    "(x",
                    "( (((a))) ))",
                    "(a and b) or not c xor (a or not b))"
            );
            samples.forEach(this::testInvalidSample);
        }
    }
}
