import java.io.InputStream;
import java.text.ParseException;

import static org.junit.Assert.assertSame;

public class Parser {
    LexicalAnalyzer lex;

    Tree E() throws ParseException {
        switch (lex.curToken()) {
            case NOT:
            case LPAREN:
            case N:
                return new Tree("E", C(), E2());
            default:
                throw new AssertionError(lex.curChar + " " + lex.curPos + " " + lex.curToken);
        }
    }

    Tree E2() throws ParseException {
        Tree res = new Tree("E'");
        switch (lex.curToken()) {
            case OR:
                res.add(new Tree("or"));
                lex.nextToken();
                res.add(C());
                res.add(E2());
                return res;
            case XOR:
                res.add(new Tree("xor"));
                lex.nextToken();
                res.add(C());
                res.add(E2());
                return res;
            case RPAREN:
            case END:
                return res.addDefault(new Tree("Ɛ"));
            default:
                throw new AssertionError();
        }
    }

    Tree C() throws ParseException {
        switch (lex.curToken()) {
            case NOT:
            case LPAREN:
            case N:
                Tree res = new Tree("C");
                return new Tree("C", N(), C2());
            default:
                throw new AssertionError();
        }
    }

    Tree C2() throws ParseException {
        Tree res = new Tree("C'");
        switch (lex.curToken()) {
            case AND:
                res.add(new Tree("and"));
                lex.nextToken();
                res.add(N());
                res.add(C2());
            case RPAREN:
            case END:
            case OR:
            case XOR:
                return res.addDefault(new Tree("Ɛ"));
            default:
                throw new AssertionError((char) lex.curChar + " " + lex.curPos + " " + lex.curToken);
        }
    }

    Tree N() throws ParseException {
        Tree res = new Tree("N");
        switch (lex.curToken()) {
            case NOT:
                res.add(new Tree("not"));
                lex.nextToken();
                res.add(N());
                return res;
            case LPAREN:
                res.add(new Tree("("));
                lex.nextToken();
                res.add(E());
                assertSame(lex.curToken(), Token.RPAREN);
                res.add(new Tree(")"));
                lex.nextToken();
                return res;
            case N:
                res.add(new Tree("n"));
                lex.nextToken();
                return res;
            default:
                throw new AssertionError();
        }
    }

    Tree parse(String s) throws ParseException {
        return parse(new LexicalAnalyzer(s));
    }
    Tree parse(InputStream is) throws ParseException {
        return parse(new LexicalAnalyzer(is));
    }
    Tree parse(LexicalAnalyzer lex) throws ParseException {
        this.lex = lex;
        this.lex.nextToken();
        Tree result = E();
        assertSame(this.lex.curToken(), Token.END);
        return result;
    }
}
