grammar JavaProgram;

program : package? imports? innerStructureSeq EOF;
    package : KEYWORD_package typeToken ';';
    imports : imprt+;
        imprt : KEYWORD_import typeToken ('.' '*')? ';';

innerStructureSeq : innerStructure+;

innerStructure : innerDeclare innerBody;
    innerDeclare : declareBegin declareEnd?;
        declareBegin: declarePrefix ('(' declareInScopeBody ')')?;
            declarePrefix : (keyWord | typeToken | generic)+;
            declareInScopeBody : funcDeclareArgs;
        declareEnd : keyWordAndTokens+;
    innerBody : '{' innerCode? '}';
        innerCode : innerStructureSeq | (line | keyStructure | switchStructure)+;

line : (keyWord | valueDeclare)? ';';
keyStructure : keyDeclare innerBody (keyContinueDeclare innerBody)* keyLineEnd?;
    keyDeclare : KEYWORD_STRUCTURE+ keyDeclareScope?;
    keyContinueDeclare : KEYWORD_STRUCTURE_CONTINUE KEYWORD_STRUCTURE* keyDeclareScope?;
        keyDeclareScope : ('(' keyDeclareInScope ')');
            keyDeclareInScope : valueDeclare (';' valueDeclare)*;
    keyLineEnd : 'while' ';';

switchStructure : KEYWORD_switch switchDeclare switchBody;
    switchDeclare : '(' value ')';
    switchBody : '{' switchCode '}';
        switchCode : case* default? case*;
            case: KEYWORD_case value ':' innerCode;
            default : KEYWORD_default ':' innerCode;

funcDeclareArgs : (funcDeclareArg (Comma funcDeclareArg)*)?;
    funcDeclareArg : keyWord* argTypeToken varToken;
        argTypeToken : typeToken ('...')?;

valueDeclare : value (value (Comma value)*)?;

value : operator* valueUnary (operator+ valueUnary)* operator*;
valueUnary : unaryOperator* valueUnaryKeyWord unaryOperator*;
valueUnaryKeyWord : keyWord* valueUnaryGet;
valueUnaryGet : valueUnaryMain('['value']')* ('.' valueUnary)*;
valueUnaryMain : '(' value ')'
               | NUMBER
               | STRING
               | funcToken
               ;

funcToken : typeToken funcCallArgs?;
funcCallArgs : '(' (value (Comma value)*)? ')';

typeToken : varToken generic? ('['']')*;
varToken : ID ('.' ID)*;
generic : '<' (genericIn (Comma genericIn)*)? '>';
    genericIn : typeToken | '?' keyWordAndTokens*;

keyWordAndTokens: keyWord typeTokensComma;
    typeTokensComma : typeToken (Comma typeToken)*;

keyWord : KEYWORD;
KEYWORD_package: 'package';
KEYWORD_import: 'import';

KEYWORD_switch: 'switch';
KEYWORD_case: 'case';
KEYWORD_default: 'default';

KEYWORD_STRUCTURE : 'do'
                  | 'for'
                  | 'if'
                  | 'try'
                  | 'while'
                  ;

KEYWORD_STRUCTURE_CONTINUE : 'catch'
                           | 'else'
                           | 'finally'
                           ;

KEYWORD : 'abstract'
        | 'assert'
        | 'break'
        | 'class'
        | 'const'
        | 'continue'
        | 'enum'
        | 'extends'
        | 'final'
        | 'goto'
        | 'implements'
        | 'instanceof'
        | 'interface'
        | 'native'
        | 'new'
        | 'private'
        | 'protected'
        | 'public'
        | 'return'
        | 'static'
        | 'strictfp'
        | 'super'
        | 'synchronized'
        | 'throw'
        | 'throws'
        | 'transient'
        | 'volatile'
        ;

STRING : ["] (~["\\] | '\\'. )* ["]
       | ['] (~['\\] | '\\'.) ['];

NUMBER : '-'?DIGIT+;
ID : (LETTER | '$' | '_') (LETTER | '$' | DIGIT | '_')*;

unaryOperator: UNARY_OPERATOR;
operator : OPERATOR | AngleL | AngleR | Question | Colon | Star;

AngleL   : '<';
AngleR   : '>';
Question : '?';
Colon    : ':';
Star     : '*';
UNARY_OPERATOR : '!' | '++' | '--';
OPERATOR : [&|?:+\-*/%!<=>^~]
         | [&|?:+\-*/%!<=>^~]? [&|:+\-*/%=^~]+ [&|?:+\-*/%!<=>^~]?;

Comma: ',';

fragment LETTER : [\p{L}];
fragment DIGIT : [0-9];
WS : [ \t\r\n]+ -> skip;

