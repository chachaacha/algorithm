package book.code.interview.array;

import java.util.HashMap;
import java.util.Map;

/**
 * packageName    : book.code.interview.array  <br>
 * fileName       : TwoSum  <br>
 * author         : sseung  <br>
 * date           : 2026-02-28  <br>
 * description    : <br><br>
 *
 */
public class TwoSum {

    public static void main(String[] args) {
        bruteForce(args);
        enforcedBruteForce(args);
        mapKeyContains(args);


    }

    public static void bruteForce(String[] args) {
        String[] numArray = args[0].split(" ");
        int target = stoi(args[1]);

        for(int i = 0 ; i < numArray.length; i ++) {
            for(int j = i + 1; j < numArray.length; j ++ ) {
                if(stoi(numArray[i]) + stoi(numArray[j]) == target) {
                    System.out.println(i + " " + j);
                    return;
                }
            }
        }
    }

    public static void enforcedBruteForce(String[] args) {
        String[] numArray = args[0].split(" ");
        int target = stoi(args[1]);

        for(int i = 0 ; i < numArray.length; i ++) {
            if(stoi(numArray[i]) >= target) continue;
            for(int j = i + 1; j < numArray.length; j ++ ) {
                if(stoi(numArray[i]) + stoi(numArray[j]) == target) {
                    System.out.println(i + " " + j);
                    return;
                }
            }
        }
    }


    public static void mapKeyContains(String[] args) {
        String[] numArray = args[0].split(" ");
        int target = stoi(args[1]);

        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < numArray.length; i ++) {
            int numInt = stoi(numArray[i]);
            if(map.containsKey(target - numInt) && numInt != map.get(target - numInt)) {
                System.out.println(i + " " + map.get(target - numInt));
                return;
            }
            map.put(stoi(numArray[i]), i);
        }
    }

    public static int stoi(String s) {
        return Integer.parseInt(s);
    }
}
