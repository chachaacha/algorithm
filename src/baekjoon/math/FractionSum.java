package baekjoon.math;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * packageName    : ${PACKAGE_NAME}  <br>
 * fileName       : ${NAME}  <br>
 * author         : sseung  <br>
 * date           : 2025-02-11  <br>
 * description    : <br><br> 분수 합
 */
public class FractionSum {

    private static int numerator;

    private static int denominator;

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(in.readLine());
        int a = stoi(st.nextToken());
        int b = stoi(st.nextToken());

        st = new StringTokenizer(in.readLine());
        int c = stoi(st.nextToken());
        int d = stoi(st.nextToken());

        int numerator = FractionSum.numerator = (a * d) + (c * b);
        int denominator = FractionSum.denominator = b * d;
        while (numerator != 0) {
            int temp = numerator;
            numerator = denominator % numerator;
            denominator = temp;
        }

        sb.append(FractionSum.numerator / denominator).append(" ").append(FractionSum.denominator / denominator);

        System.out.println(sb);

    }

    public static int stoi(String s) {
        return Integer.parseInt(s);
    }

}