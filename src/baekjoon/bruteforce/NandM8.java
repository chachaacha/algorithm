package baekjoon.bruteforce;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * packageName    : ${PACKAGE_NAME}  <br>
 * fileName       : ${NAME}  <br>
 * author         : sseung  <br>
 * date           : 2025-04-18  <br>
 * description    : <br><br> N과M 8
 */
public class NandM8 {

    public static int n;
    public static int m;
    public static int[] result;
    public static int[] num;
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] mnStr = in.readLine().split(" ");
        String[] numStr = in.readLine().split(" ");
        n = stoi(mnStr[0]);
        m = stoi(mnStr[1]);

        num = new int[n];
        result = new int[m];

        for(int i = 0; i < num.length; i++) {
            num[i] = stoi(numStr[i]);
        }

        Arrays.sort(num);

        backTracking(0, 0);
        System.out.println(sb);

    }

    public static void backTracking(int depth, int minimum) {
        if(depth == m) {
            for(int num : result) {
                sb.append(num).append(" ");
            }
            sb.append("\n");
            return;
        }

        for(int i = minimum; i < n; i ++) {
            result[depth] = num[i];
            backTracking(depth + 1, i);
        }

    }

    public static int stoi(String s) {
        return Integer.parseInt(s);
    }

}