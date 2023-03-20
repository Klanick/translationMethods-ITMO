grammar Generator;

generator : importLine* grammarLine (lineRule)* EOF;

importLine : importKeyword importSource';';
    importSource : (NonTermID | TokenID | '.')+;

grammarLine: grammarKeyword TokenID CodeInsert?';' ;

lineRule : (nonTermDef | tokenDef | transDef) ';' ;

nonTermDef : NonTermID argType? resType? nonTermRules;
    argType : '#' anyScope;
    resType : '@' anyScope;

nonTermRules : (':' nonTermRule)*;
nonTermRule : nonTermRuleElement*;
nonTermRuleElement: NonTermID
                  | TokenID
                  | transCall
                  | CodeInsert;
    transCall : TransID argSeq? resSeq?;
        argSeq : '#' seqInScope;
        resSeq : '@' seqInScope;

seqInScope : '(' (elemInScope (',' elemInScope)*)? ')';
elemInScope : (~('(' | ')' | ',') | anyScope)+;

anyScope : '(' (~('(' | ')') | anyScope)* ')';

tokenDef : TokenID ':' Regexp tokenMode?;
tokenMode : '->' command;

transDef : TransID argIdSeq? resIdSeq? ':' CodeInsert;

argIdSeq : '#' idSeqInScope;
resIdSeq : '@' idSeqInScope;
idSeqInScope : '(' (id (',' id)* )? ')';

Regexp : '"' (~('"') | '\\' .)* '"';
CodeInsert : '{' (~('{' | '}') | CodeInsert)* '}';

importKeyword : 'import';
grammarKeyword : 'grammar';

command : skipCommand;
    skipCommand : 'skip';

id : NonTermID | TokenID;

NonTermID : [a-z] [\p{L}0-9_]*;
TokenID : [A-Z] [\p{L}0-9_]*;
TransID : '$' [\p{L}] [\p{L}0-9_]*;

INDEX : [0-9]+;

WS : [ \t\r\n]+ -> skip;
Unknown : .;