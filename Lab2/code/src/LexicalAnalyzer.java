import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.text.ParseException;

public class LexicalAnalyzer {
    InputStream is;
    int curChar;
    int curPos;
    Token curToken;


    public Token curToken() {
        return curToken;
    }

    public int curPos() {
        return curPos;
    }

    public LexicalAnalyzer (InputStream is) throws ParseException {
        this.is = is;
        curPos = 0;
        nextChar();
    }

    public LexicalAnalyzer (String s) throws ParseException {
        this(new ByteArrayInputStream(s.getBytes(StandardCharsets.UTF_8)));
    }

    private boolean isBlank() {
        return Character.isWhitespace(curChar);
    }

    private void skipBlank() throws ParseException {
        while (isBlank()) {
            nextChar();
        }
    }

    private String getWord() throws ParseException {
        final StringBuilder word = new StringBuilder();
        while (Character.isLetter(curChar)) {
            word.append((char) curChar);
            nextChar();
        }
        return word.toString();
    }

    private void nextChar() throws ParseException {
        curPos++;
        try {
            curChar = is.read();
        } catch ( IOException e ) {
            throw new ParseException(e.getMessage(), curPos);
        }
    }

    public void nextToken() throws ParseException {
        skipBlank();
        if (Character.isLetter(curChar)) {
            String word = getWord();
            if (word.length() == 1) {
                curToken = Token.N;
            } else {
                switch (word) {
                    case "or":
                        curToken = Token.OR;
                        break;
                    case "xor":
                        curToken = Token.XOR;
                        break;
                    case "and":
                        curToken = Token.AND;
                        break;
                    case "not":
                        curToken = Token.NOT;
                        break;
                    default:
                        throw new ParseException("Invalid word-token", curPos);
                }
            }
        } else {
            switch (curChar) {
                case '(':
                    curToken = Token.LPAREN;
                    nextChar();
                    break;
                case ')':
                    curToken = Token.RPAREN;
                    nextChar();
                    break;
                case -1:
                    curToken = Token.END;
                    break;
                default:
                    throw new ParseException("Invalid nonLetter-token", curPos);
            }
        }
    }
}
