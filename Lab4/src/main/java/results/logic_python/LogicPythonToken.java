package results.logic_python;


public class LogicPythonToken {
   public final TokenEnum tokenEnum;
   public final String text;

   LogicPythonToken(TokenEnum tokenEnum) {
       this(tokenEnum, null);
   }
   LogicPythonToken(TokenEnum tokenEnum, String text) {
       this.tokenEnum = tokenEnum;
       this.text = text;
   }

    public enum TokenEnum {
        OR("or"),
XOR("xor"),
AND("and"),
NOT("not"),
LPAREN("\\("),
RPAREN("\\)"),
N("\\p{L}"),
Word("\\p{L}+",TokenMode.Skip),
WS("[ \\t\\r\\n]+",TokenMode.Skip),
EOF;
        public final TokenMode tokenMode;
        public final String regexp;

        TokenEnum() {
            this(null);
        }

        TokenEnum(String regexp) {
            this(regexp, TokenMode.Normal);
        }

        TokenEnum(String regexp, TokenMode tokenMode) {
            this.regexp = regexp;
            this.tokenMode = tokenMode;
        }
    }

    public enum TokenMode {
        Skip,
Normal;
    }
}