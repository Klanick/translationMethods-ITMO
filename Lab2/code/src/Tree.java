import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

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

    private static class IdGenerator {
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
    public Double pow(Double x, Double deg) {
        return Math.pow (x, deg);
    }
}
