package baekjoon.bruteforce;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

/**
 * packageName    : ${PACKAGE_NAME}  <br>
 * fileName       : ${NAME}  <br>
 * author         : sseung  <br>
 * date           : 2025-04-18  <br>
 * description    : <br><br> 암호 만들기
 */
public class MakingPassword {

    public static int l, c;
    public static String[] nArr;
    public static StringBuilder sb = new StringBuilder();
    public static List<String> vowelList = List.of("a", "e", "i", "o", "u");

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] lcStr = in.readLine().split(" ");
        l = stoi(lcStr[0]);
        c = stoi(lcStr[1]);

        nArr = in.readLine().split(" ");
        Arrays.sort(nArr);
        backTracking("", 0, 0, 0);

        System.out.println(sb);


    }

    public static void backTracking(String result, int minIndex, int consonant, int vowel) {
        if(result.length() == l && vowel > 0 && consonant > 1 ) {
            sb.append(result).append("\n");
            return;
        }

        for(int i = minIndex; i < c; i++) {
            if(vowelList.contains(nArr[i])) {
                backTracking(result + nArr[i], i + 1, consonant, vowel + 1);
            } else {
                backTracking(result + nArr[i], i + 1, consonant + 1, vowel );
            }
        }
    }

    public static int stoi(String s) {
        return Integer.parseInt(s);
    }

}
