import java.util.Arrays;
import java.util.HashMap;

public class Driver {

    // Main Driver class for huffman encoding/decoding

    // Function to create a table
    public static HashMap<Character, Integer> createWeightTable(String x) {

        HashMap<Character, Integer> table = new HashMap<>();

        char[] temp = x.toCharArray();
        Arrays.sort(temp);
        String newString = new String(temp);

        for(int i = 0; i < newString.length(); i++) {
            char t = newString.charAt(i);
            if(!table.containsKey(t)) {
                table.put(t, 1);
            } else {
                table.put(t, table.get(t) + 1);
            }
        }

        return table;

    }

    // Given the table of weighted Chars, creates a Huffman tree
    public static Node createHuffmanTree(HashMap table) {
        

        return root;
    }


    public static void main(String[] args) {
        String x = "go go gophers";

        // Need to create a table to define each character's weights
        HashMap<Character, Integer> weightTable = createWeightTable(x);
        // System.out.println("Key Set: " + weightTable.values());

        // Now need to create the actual Huffman tree
    }
}
