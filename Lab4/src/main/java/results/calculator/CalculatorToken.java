package results.calculator;


public class CalculatorToken {
   public final TokenEnum tokenEnum;
   public final String text;

   CalculatorToken(TokenEnum tokenEnum) {
       this(tokenEnum, null);
   }
   CalculatorToken(TokenEnum tokenEnum, String text) {
       this.tokenEnum = tokenEnum;
       this.text = text;
   }

    public enum TokenEnum {
        Number("[0-9]+"),
Plus("\\+"),
Minus("-"),
Mul("\\*"),
Div("\\/"),
Pow("\\*\\*"),
LPAREN("\\("),
RPAREN("\\)"),
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