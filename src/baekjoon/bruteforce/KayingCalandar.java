package baekjoon.bruteforce;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * packageName    : ${PACKAGE_NAME}  <br>
 * fileName       : ${NAME}  <br>
 * author         : sseung  <br>
 * date           : 2025-04-15  <br>
 * description    : <br><br> 카잉 달력
 */
public class KayingCalandar {

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = stoi(in.readLine());

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(in.readLine());
            int m = stoi(st.nextToken());
            int n = stoi(st.nextToken());
            int x = stoi(st.nextToken());
            int y = stoi(st.nextToken());
            int lcm = (m * n) / gcd(m, n);
            sb.append(dateCalculator(lcm, m, n, x, y)).append("\n");
        }

        System.out.println(sb);
        in.close();
    }

    public static int dateCalculator(int lcm, int m, int n, int x, int y) {
        y = (y == n) ? 0 : y;
        for(int year = x; year <= lcm; year += m) {
            if(year % n == y) {
                return year;
            }
        }
        return -1;
    }

    public static int gcd(int a, int b) {
        while(b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    };

    public static int stoi(String s) {
        return Integer.parseInt(s);
    }

}