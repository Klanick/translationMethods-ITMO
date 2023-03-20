import java.util.Map;

public enum Token {
    OR,
    XOR,
    AND,
    NOT,
    LPAREN,
    RPAREN,
    N,
    END;

    public static final Map<String, Token> MAP_STRING_TOKEN = Map.of(
            "or", OR,
            "xor", XOR,
            "and", AND,
            "not", NOT
    );
}

