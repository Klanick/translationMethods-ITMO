package results.logic_python;

import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;
import java.util.Arrays;


public class LogicPythonLexer {
    InputStream is;
    int curChar;
    int curPos;
    LogicPythonToken curToken;

    String allTokenRegexp = "or|xor|and|not|\\(|\\)|\\p{L}|\\p{L}+|[ \\t\\r\\n]+";
    LogicPythonToken endToken = new LogicPythonToken(LogicPythonToken.TokenEnum.EOF);

    public LogicPythonToken curToken() {
        return curToken;
    }

    public int curPos() {
        return curPos;
    }

    public LogicPythonLexer (InputStream is) throws ParseException {
        this.is = is;
        curPos = 0;
        nextChar();
        nextToken();
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
        StringBuilder sb = new StringBuilder();
            if (curChar == -1) {
                curToken = endToken;
                return;
            }
            sb.append((char) curChar);
            nextChar();

            while (curChar != -1 && !sb.toString().matches(allTokenRegexp)) {
                sb.append((char) curChar);
                nextChar();
            }

            while (curChar != -1 && (sb.toString() + (char) curChar).matches(allTokenRegexp)) {
                sb.append((char) curChar);
                nextChar();
            }

            final String word = sb.toString();

            if (!word.matches(allTokenRegexp)) {
                curToken = new LogicPythonToken(null, word);
                throw new ParseException("Invalid Token", curPos - word.length());
            }

            curToken =
                new LogicPythonToken(
                    Arrays.stream(LogicPythonToken.TokenEnum.values())
                        .filter(tokenEnum -> tokenEnum.regexp != null
                                && word.matches(tokenEnum.regexp)
                                && tokenEnum.tokenMode != LogicPythonToken.TokenMode.Skip)
                        .findFirst()
                        .orElse(null), word);

        if (curToken.tokenEnum == null) {
            nextToken();
        }
    }
}