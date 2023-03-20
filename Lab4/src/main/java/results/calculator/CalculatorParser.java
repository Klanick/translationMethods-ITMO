package results.calculator;

import java.text.ParseException;


public class CalculatorParser {
    private final CalculatorLexer lex;

    CalculatorParser(CalculatorLexer lex) {
        this.lex = lex;
    }

    

    Double expr() throws ParseException {
    Double res0 = null;

    switch (lex.curToken().tokenEnum) {
case Number:
case LPAREN:
case Minus:
{

Double res1 = e();
assert lex.curToken.tokenEnum == CalculatorToken.TokenEnum.EOF;
String res2 = lex.curToken().text;
lex.nextToken();
{
    res0 = res1;
}

}
break;

        default:
            throw new AssertionError();
    }
    return res0;
}

Double e() throws ParseException {
    Double res0 = null;

    switch (lex.curToken().tokenEnum) {
case Number:
case LPAREN:
case Minus:
{
Double arg2 = null;

Double res1 = t();
{
    arg2 = res1;
}
Double res2 = e1(arg2);
{
    res0 = res2;
}

}
break;

        default:
            throw new AssertionError();
    }
    return res0;
}

Double e1(Double arg0) throws ParseException {
    Double res0 = null;

    switch (lex.curToken().tokenEnum) {
case Plus:
{
Double arg3 = null;

assert lex.curToken.tokenEnum == CalculatorToken.TokenEnum.Plus;
String res1 = lex.curToken().text;
lex.nextToken();
Double res2 = t();
{
    arg3 = arg0 + res2;
}
Double res3 = e1(arg3);
{
    res0 = res3;
}

}
break;
case Minus:
{
Double arg3 = null;

assert lex.curToken.tokenEnum == CalculatorToken.TokenEnum.Minus;
String res1 = lex.curToken().text;
lex.nextToken();
Double res2 = t();
{
    arg3 = arg0 - res2;
}
Double res3 = e1(arg3);
{
    res0 = res3;
}

}
break;
case RPAREN:
case EOF:
{

{
    res0 = arg0;
}

}
break;

        default:
            throw new AssertionError();
    }
    return res0;
}

Double t() throws ParseException {
    Double res0 = null;

    switch (lex.curToken().tokenEnum) {
case Number:
case LPAREN:
case Minus:
{
Double arg2 = null;

Double res1 = p();
{
    arg2 = res1;
}
Double res2 = t1(arg2);
{
    res0 = res2;
}

}
break;

        default:
            throw new AssertionError();
    }
    return res0;
}

Double t1(Double arg0) throws ParseException {
    Double res0 = null;

    switch (lex.curToken().tokenEnum) {
case Mul:
{
Double arg3 = null;

assert lex.curToken.tokenEnum == CalculatorToken.TokenEnum.Mul;
String res1 = lex.curToken().text;
lex.nextToken();
Double res2 = p();
{
    arg3 = arg0 * res2;
}
Double res3 = t1(arg3);
{
    res0 = res3;
}

}
break;
case Div:
{
Double arg3 = null;

assert lex.curToken.tokenEnum == CalculatorToken.TokenEnum.Div;
String res1 = lex.curToken().text;
lex.nextToken();
Double res2 = p();
{
    arg3 = arg0 / res2;
}
Double res3 = t1(arg3);
{
    res0 = res3;
}

}
break;
case RPAREN:
case Plus:
case EOF:
case Minus:
{

{
    res0 = arg0;
}

}
break;

        default:
            throw new AssertionError();
    }
    return res0;
}

Double p() throws ParseException {
    Double res0 = null;

    switch (lex.curToken().tokenEnum) {
case Number:
case LPAREN:
case Minus:
{
Double arg2 = null;

Double res1 = f();
{
    arg2 = res1;
}
Double res2 = p1(arg2);
{
    res0 = res2;
}

}
break;

        default:
            throw new AssertionError();
    }
    return res0;
}

Double p1(Double arg0) throws ParseException {
    Double res0 = null;

    switch (lex.curToken().tokenEnum) {
case Pow:
{
Double arg3 = null;

assert lex.curToken.tokenEnum == CalculatorToken.TokenEnum.Pow;
String res1 = lex.curToken().text;
lex.nextToken();
Double res2 = f();
{
    arg3 = res2;
}
Double res3 = p1(arg3);
{
    res0 = Math.pow(arg0, res3);;
}

}
break;
case Div:
case Mul:
case RPAREN:
case Plus:
case EOF:
case Minus:
{

{
    res0 = arg0;
}

}
break;

        default:
            throw new AssertionError();
    }
    return res0;
}

Double f() throws ParseException {
    Double res0 = null;

    switch (lex.curToken().tokenEnum) {
case LPAREN:
{

assert lex.curToken.tokenEnum == CalculatorToken.TokenEnum.LPAREN;
String res1 = lex.curToken().text;
lex.nextToken();
Double res2 = e();
assert lex.curToken.tokenEnum == CalculatorToken.TokenEnum.RPAREN;
String res3 = lex.curToken().text;
lex.nextToken();
{
    res0 = res2;
}

}
break;
case Number:
{

Double res1 = nat();
{
    res0 = res1;
}

}
break;
case Minus:
{

assert lex.curToken.tokenEnum == CalculatorToken.TokenEnum.Minus;
String res1 = lex.curToken().text;
lex.nextToken();
Double res2 = nat();
{
    res0 = res2 * -1;
}

}
break;

        default:
            throw new AssertionError();
    }
    return res0;
}

Double nat() throws ParseException {
    Double res0 = null;

    switch (lex.curToken().tokenEnum) {
case Number:
{

assert lex.curToken.tokenEnum == CalculatorToken.TokenEnum.Number;
String res1 = lex.curToken().text;
lex.nextToken();

  res0 = Double.parseDouble(res1);


}
break;

        default:
            throw new AssertionError();
    }
    return res0;
}


}
