package book.code.interview.string;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/**
 * packageName    : book.code.interview.string  <br>
 * fileName       : MostCommonWord  <br>
 * author         : sseung  <br>
 * date           : 2026-02-21  <br>
 * description    : <br><br>
 *
 */
public class MostCommonWord {

    /**
     * @param args
     */
    public static void main(String[] args) {
        String inputSent = args[0];
        String ban = args[1];

        Map<String, Integer> map = new HashMap<>();
        inputSent = inputSent.replaceAll("\\W+", " ").toLowerCase();

        for (String word : inputSent.split(" ")) {
            if (!word.equals(ban)) {
                map.put(word, map.getOrDefault(word, 0) + 1);
            }
        }

        String result = Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();

        System.out.println(result);

    }
}
