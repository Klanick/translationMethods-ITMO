import java.text.ParseException;

public class Main {
    public static void main(String[] args) {
        String inputString = "a or b xor c or d";
        try {
            Tree result = new Parser().parse(inputString);
            result.writeGraphToFile("code/src/graphviz.txt");
            System.out.println("Success parsing");
        } catch (ParseException | AssertionError e) {
            System.out.println("Failure parsing");
            e.printStackTrace();
        }
    }
}