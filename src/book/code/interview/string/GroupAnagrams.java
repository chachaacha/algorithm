package book.code.interview.string;

import java.util.*;

/**
 * packageName    : book.code.interview.string  <br>
 * fileName       : GroupAnagrams  <br>
 * author         : sseung  <br>
 * date           : 2026-02-22  <br>
 * description    : <br><br>
 *
 */
public class GroupAnagrams {

    public static void main(String[] args) {
        Map<String, List<String>> keyMap = new HashMap<>();

        for(String word : args) {
            char[] charArray = word.toCharArray();
            Arrays.sort(charArray);
            String key = String.valueOf(charArray);
            keyMap.computeIfAbsent(key, k -> new ArrayList<>()).add(word);
        }

        StringBuilder sb = new StringBuilder();
        for(Map.Entry<String, List<String>> entry : keyMap.entrySet()) {
            sb.append(entry.getValue()).append("\n");
        }

        System.out.println(sb);
    }

}
