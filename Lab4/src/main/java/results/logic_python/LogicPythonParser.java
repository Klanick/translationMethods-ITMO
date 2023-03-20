package results.logic_python;

import java.text.ParseException;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class LogicPythonParser {
    private final LogicPythonLexer lex;

    LogicPythonParser(LogicPythonLexer lex) {
        this.lex = lex;
    }

    
    public class Tree {
        String node;

        List<Tree> children;

        public Tree(String node, Tree... children) {
            this.node = node;
            this.children = Arrays.asList(children);
        }

        public Tree (String node) {
            this.node = node;
            this.children = new ArrayList<>();
        }

        public Tree add(Tree child) {
            children.add(child);
            return this;
        }

        public Tree addDefault(Tree child) {
            if (children.isEmpty()) {
                add(child);
            }
            return this;
        }

        public void writeGraphToFile(String fn) {
            try (BufferedWriter out = new BufferedWriter(new FileWriter(fn))) {
                out.write(toGraphString());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        @Override
        public String toString() {
            return toGraphString();
        }

        public String toGraphString() {
            StringBuilder sb = new StringBuilder("digraph {").append(System.lineSeparator());
            addGraph(sb);
            sb.append('}');
            return sb.toString();
        }

        public void addGraph(StringBuilder sb) {
            addGraph(sb, new IdGenerator());
        }

        private class IdGenerator {
            int id;
            IdGenerator () {
                id = 0;
            }

            public int getId() {
                return id;
            }

            public IdGenerator inc() {
                id++;
                return this;
            }
        }

        public void addGraph(StringBuilder sb, IdGenerator idGen) {
            int rootId = idGen.getId();
            sb.append(rootId).append("[label=\"").append(node).append("\"]").append(System.lineSeparator());
            for (Tree child : this.children) {
                int childId = idGen.inc().getId();
                child.addGraph(sb, idGen);
                sb
                        .append(rootId)
                        .append("->")
                        .append(childId)
                        .append(System.lineSeparator());
            }
        }
    }


    Tree expr() throws ParseException {
    Tree res0 = null;

    switch (lex.curToken().tokenEnum) {
case NOT:
case LPAREN:
case N:
{

Tree res1 = e();
assert lex.curToken.tokenEnum == LogicPythonToken.TokenEnum.EOF;
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

Tree e() throws ParseException {
    Tree res0 = null;

    switch (lex.curToken().tokenEnum) {
case NOT:
case LPAREN:
case N:
{

{
    res0 = new Tree("E");
}
Tree res1 = c();
{
    res0.add(res1);
}
Tree res2 = e1();
{
    res0.add(res2);
}

}
break;

        default:
            throw new AssertionError();
    }
    return res0;
}

Tree e1() throws ParseException {
    Tree res0 = null;

    switch (lex.curToken().tokenEnum) {
case OR:
{

{
    res0 = new Tree("E'");
}
assert lex.curToken.tokenEnum == LogicPythonToken.TokenEnum.OR;
String res1 = lex.curToken().text;
lex.nextToken();
{
     res0.add(new Tree(res1));
}
Tree res2 = c();
{
    res0.add(res2);
}
Tree res3 = e1();
{
    res0.add(res3);
}

}
break;
case XOR:
{

{
    res0 = new Tree("E'");
}
assert lex.curToken.tokenEnum == LogicPythonToken.TokenEnum.XOR;
String res1 = lex.curToken().text;
lex.nextToken();
{
     res0.add(new Tree(res1));
}
Tree res2 = c();
{
    res0.add(res2);
}
Tree res3 = e1();
{
    res0.add(res3);
}

}
break;
case RPAREN:
case EOF:
{

{
    res0 = new Tree("E'");
}
{
     res0.add(new Tree("Ɛ"));
}

}
break;

        default:
            throw new AssertionError();
    }
    return res0;
}

Tree c() throws ParseException {
    Tree res0 = null;

    switch (lex.curToken().tokenEnum) {
case NOT:
case LPAREN:
case N:
{

{
    res0 = new Tree("C");
}
Tree res1 = n();
{
    res0.add(res1);
}
Tree res2 = c1();
{
    res0.add(res2);
}

}
break;

        default:
            throw new AssertionError();
    }
    return res0;
}

Tree c1() throws ParseException {
    Tree res0 = null;

    switch (lex.curToken().tokenEnum) {
case AND:
{

{
    res0 = new Tree("C'");
}
assert lex.curToken.tokenEnum == LogicPythonToken.TokenEnum.AND;
String res1 = lex.curToken().text;
lex.nextToken();
{
     res0.add(new Tree(res1));
}
Tree res2 = n();
{
    res0.add(res2);
}
Tree res3 = c1();
{
    res0.add(res3);
}

}
break;
case OR:
case XOR:
case RPAREN:
case EOF:
{

{
    res0 = new Tree("C'");
}
{
     res0.add(new Tree("Ɛ"));
}

}
break;

        default:
            throw new AssertionError();
    }
    return res0;
}

Tree n() throws ParseException {
    Tree res0 = null;

    switch (lex.curToken().tokenEnum) {
case NOT:
{

{
    res0 = new Tree("N");
}
assert lex.curToken.tokenEnum == LogicPythonToken.TokenEnum.NOT;
String res1 = lex.curToken().text;
lex.nextToken();
{
     res0.add(new Tree(res1));
}
Tree res2 = n();
{
    res0.add(res2);
}

}
break;
case LPAREN:
{

{
    res0 = new Tree("N");
}
assert lex.curToken.tokenEnum == LogicPythonToken.TokenEnum.LPAREN;
String res1 = lex.curToken().text;
lex.nextToken();
{
     res0.add(new Tree(res1));
}
Tree res2 = e();
{
    res0.add(res2);
}
assert lex.curToken.tokenEnum == LogicPythonToken.TokenEnum.RPAREN;
String res3 = lex.curToken().text;
lex.nextToken();
{
     res0.add(new Tree(res3));
}

}
break;
case N:
{

{
    res0 = new Tree("N");
}
assert lex.curToken.tokenEnum == LogicPythonToken.TokenEnum.N;
String res1 = lex.curToken().text;
lex.nextToken();
{
     res0.add(new Tree(res1));
}

}
break;

        default:
            throw new AssertionError();
    }
    return res0;
}


}
