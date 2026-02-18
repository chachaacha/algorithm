package baekjoon.math;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * packageName    : ${PACKAGE_NAME}  <br>
 * fileName       : ${NAME}  <br>
 * author         : sseung  <br>
 * date           : 2025-02-11  <br>
 * description    : <br><br> 소수 구하기
 */
public class FindPrimeNum {

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(in.readLine());
        int n = stoi(st.nextToken());
        int m = stoi(st.nextToken());

        StringBuilder sb = new StringBuilder();
        for(int i = n ; i <= m ; i ++) {
            if(i > 1 && find(i)) sb.append(i).append("\n");
        }

        System.out.println(sb);
    }

    public static boolean find(int num) {
        if(num == 2) return true;
        if(num % 2 == 0) return false; // 짝수면 바로 패스
        for(int i = 3; i * i <= num; i += 2) { // 짝수로 떨궈지면 소수 아니니 3 부터 홀수만
            if(num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int stoi(String s) {
        return Integer.parseInt(s);
    }

    public static long stol(String s) {
        return Long.parseLong(s);
    }

}