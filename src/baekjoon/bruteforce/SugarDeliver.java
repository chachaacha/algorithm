package baekjoon.bruteforce;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * packageName    : ${PACKAGE_NAME}  <br>
 * fileName       : ${NAME}  <br>
 * author         : sseung  <br>
 * date           : 2025-02-11  <br>
 * description    : <br><br> 설탕배달
 */
public class SugarDeliver {

    public static void main(String[] args) throws Exception {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = stoi(in.readLine());

        int count = 0;
        while (n >= 0) {
            if (n % 5 == 0) {  // 5kg 봉지로 나누어 떨어지는 경우
                count += n / 5;
                break;
            }
            n -= 3;
            count++;
        }

        System.out.println(n < 0 ? -1 : count);
    }

    public static int stoi(String s) {
        return Integer.parseInt(s);
    }

}