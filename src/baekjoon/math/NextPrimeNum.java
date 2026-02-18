package baekjoon.math;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * packageName    : ${PACKAGE_NAME}  <br>
 * fileName       : ${NAME}  <br>
 * author         : sseung  <br>
 * date           : 2025-02-11  <br>
 * description    : <br><br> 다음 소수
 */
public class NextPrimeNum {

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        long n = stol(in.readLine());
        StringBuilder sb = new StringBuilder();
        for(long i =0; i < n; i++) {
            sb.append(find(stol(in.readLine()))).append("\n");
        }

        System.out.println(sb);


    }

    public static long find(long num) {
        if (num <= 2) return 2; // 2는 유일한 짝수 소수

        if (num % 2 == 0) num++; // 짝수면 홀수로 변경

        while (true) {
            boolean isPrime = true;
            for (long i = 3; i * i <= num; i += 2) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) return num;
            num += 2;
        }
    }

    public static long stol(String s) {
        return Long.parseLong(s);
    }

}