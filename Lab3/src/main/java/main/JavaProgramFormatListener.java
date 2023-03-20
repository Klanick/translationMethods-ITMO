package main;

import gen.*;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaProgramFormatListener extends JavaProgramBaseListener {
    private static final String TAB = "\t";

    public static class Tree {
        String result;
        List<Tree> children;
        Tree parent;

        Tree() {
            children = new ArrayList<>();
            parent = null;
        }
        Tree(String string) {
            this();
            this.result = string;
        }

        Tree makeChildOf(Tree parent) {
            if (parent != null) {
                this.parent = parent;
                parent.children.add(this);
            } else {
                this.parent = this;
            }
            return this;
        }
    }
    Tree tree = null;
    int structureLevel = 0;

    private String tabOffset() {
        return String.join("", Collections.nCopies(structureLevel, TAB));
    }

    @Override public void exitProgram(JavaProgramParser.ProgramContext ctx) {
        join("\n\n");
    }

    @Override public void exitPackage(JavaProgramParser.PackageContext ctx) {
        addToResult(tree.children.get(0).result + " ");
        join(tree.children.stream().skip(1));
    }

    @Override public void exitImports(JavaProgramParser.ImportsContext ctx) {
        join("\n");
    }

    @Override public void exitImprt(JavaProgramParser.ImprtContext ctx) {
        addToResult(tree.children.get(0).result + " ");
        join(tree.children.stream().skip(1));
    }

    @Override public void exitInnerStructureSeq(JavaProgramParser.InnerStructureSeqContext ctx) {
        join("\n\n" + tabOffset());
    }

    @Override public void exitInnerStructure(JavaProgramParser.InnerStructureContext ctx) {
        join(" ");
    }

    @Override public void exitInnerDeclare(JavaProgramParser.InnerDeclareContext ctx) {
        join(" ");
    }

    @Override public void exitDeclarePrefix(JavaProgramParser.DeclarePrefixContext ctx) {
        join(" ");
    }

    @Override public void exitFuncDeclareArg(JavaProgramParser.FuncDeclareArgContext ctx) {
        join(" ");
    }

    @Override public void enterInnerCode(JavaProgramParser.InnerCodeContext ctx) {
        structureLevel++;
    }

    @Override public void exitInnerCode(JavaProgramParser.InnerCodeContext ctx) {
        String offset = "\n" + tabOffset();
        join(offset, offset);
        structureLevel--;
    }

    @Override public void exitKeyStructure(JavaProgramParser.KeyStructureContext ctx) {
        join(" ");
    }

    @Override public void exitKeyDeclare(JavaProgramParser.KeyDeclareContext ctx) {
        join(" ");
    }

    @Override public void exitKeyContinueDeclare(JavaProgramParser.KeyContinueDeclareContext ctx) {
        join(" ");
    }

    @Override public void exitKeyDeclareInScope(JavaProgramParser.KeyDeclareInScopeContext ctx) {
        for (Tree child : tree.children) {
            addToResult(child.result);
            if (child.result.equals(";")) {
                addToResult(" ");
            }
        }
    }

    @Override public void exitSwitchStructure(JavaProgramParser.SwitchStructureContext ctx) {
        join(" ");
    }

    @Override public void enterSwitchCode(JavaProgramParser.SwitchCodeContext ctx) {
        structureLevel++;
    }

    @Override public void exitSwitchCode(JavaProgramParser.SwitchCodeContext ctx) {
        String offset = "\n" + tabOffset();
        join(offset, offset);
        structureLevel--;
    }

    @Override public void exitCase(JavaProgramParser.CaseContext ctx) {
        addToResult(tree.children.get(0).result + " ");
        join(tree.children.stream().skip(1));
    }



    @Override public void exitValue(JavaProgramParser.ValueContext ctx) {
        join(" ");
    }

    @Override public void exitValueDeclare(JavaProgramParser.ValueDeclareContext ctx) {
        if (ctx.children.size() > 1) {
            addToResult(tree.children.get(0).result + " ");
            join(tree.children.stream().skip(1));
        }
    }

    @Override public void exitValueUnaryKeyWord(JavaProgramParser.ValueUnaryKeyWordContext ctx) {
        join(" ");
    }

    @Override public void exitGenericIn(JavaProgramParser.GenericInContext ctx) {
        join(" ");
    }

    @Override public void exitKeyWordAndTokens(JavaProgramParser.KeyWordAndTokensContext ctx) {
        join(" ");
    }


    @Override public void enterEveryRule(ParserRuleContext ctx) {
        tree = new Tree().makeChildOf(tree);
    }
    @Override public void exitEveryRule(ParserRuleContext ctx) {
        if (tree.result == null) {
            join();
        }
        tree = tree.parent;
    }

    @Override public void visitTerminal(TerminalNode node) {
        switch (node.toString()) {
            case "<EOF>":
                return;
            case ",":
                addTerminal(node.toString() + " ");
                break;
            case "}":
                addTerminal("\n" + tabOffset() + node.toString());
                break;
            default:
                addTerminal(node.toString());
        }
    }

    private void join() {
        join("");
    }
    private void join (String delimiter) {
        join(delimiter, "");
    }
    private void join (String delimiter, String prefix) {
        join(tree.children.stream(), delimiter, prefix);
    }

    private void join(Stream<Tree> stream) {
        join(stream, "", "");
    }

    private void join (Stream<Tree> stream, String delimiter, String prefix) {
        String res = prefix + stream.map(child -> child.result).collect(Collectors.joining(delimiter));
        if (tree.result == null) {
            tree.result = res;
        } else {
            addToResult(res);
        }
    }

    private void addTerminal(String s) {
        new Tree(s).makeChildOf(tree);
    }
    private void addToResult(String s) {
        if (tree.result == null) {
            tree.result = "";
        }
        tree.result = tree.result + s;
    }
}
