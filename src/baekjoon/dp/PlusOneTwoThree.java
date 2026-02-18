package baekjoon.dp;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * packageName    : ${PACKAGE_NAME}  <br>
 * fileName       : ${NAME}  <br>
 * author         : sseung  <br>
 * date           : 2025-04-18  <br>
 * description    : <br><br> 1, 2, 3 더하기
 */
public class PlusOneTwoThree {

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = stoi(in.readLine());

        int[] dp = new int[11];
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < t; i++) {
            int num = stoi(in.readLine());

            for(int j = 4; j <= num; j++) {
                dp[j] = dp[j - 1] + dp[j - 2] + dp[j - 3];
            }

            sb.append(dp[num]).append("\n");
        }

        System.out.println(sb);

    }

    public static int stoi(String s) {
        return Integer.parseInt(s);
    }

}