package baekjoon.math;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * packageName    : ${PACKAGE_NAME}  <br>
 * fileName       : ${NAME}  <br>
 * author         : sseung  <br>
 * date           : 2025-02-11  <br>
 * description    : <br><br> 골드바흐 파티션
 */
public class GolbachPartitions {

    private static boolean[] primeNum = new boolean[1000001];

    public static void main(String[] args) throws Exception {
        filter();
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int testCase = stoi(in.readLine());
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < testCase; i ++) {
            int n = stoi(in.readLine());
            int count = 0;
            for(int k = 2; k <= n / 2; k ++) {
                if(!primeNum[k] && !primeNum[n - k]) {
                    count ++;
                }
            }
            sb.append(count).append("\n");
        }
        System.out.println(sb);
        in.close();
    }

    public static void filter() {
        primeNum[0] = primeNum[1] = true;
        int length = primeNum.length;
        for(int start = 2; start * start < length; start++) {
            if(!primeNum[start]) {
                for(int i = start * start; i < length; i += start) {
                    primeNum[i] = true;
                }
            }
        }
    }

    public static int stoi(String s) {
        return Integer.parseInt(s);
    }



}