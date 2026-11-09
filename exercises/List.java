import java.util.ArrayList;

public class List {
    public static void main(String[] args) {
        // Create a variable of type ArrayList that stores String values
        ArrayList<String> wordList = new ArrayList<>();

        // Add items to the ArrayList
        wordList.add("first");
        wordList.add("second");

        // Retrieve item from the ArrayList
        String first = wordList.get(0);
        System.out.println(first);

    }
}
