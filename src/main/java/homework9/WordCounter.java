/** @author Giorgi Gogua */
package homework9;

import java.util.HashMap;

public class WordCounter {
    public static void main(String[] args) {
        String sentence = "java git java oop java git python";

        String[] words = sentence.split(" ");

        HashMap<String, Integer> counts = new HashMap<>();

        for (String word : words) {
            if (counts.containsKey(word)) {
                counts.put(word, counts.get(word) + 1);
            } else {
                counts.put(word, 1);
            }
        }

        System.out.println(counts);
    }
}
