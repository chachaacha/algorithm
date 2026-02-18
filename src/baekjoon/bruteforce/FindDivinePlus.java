package baekjoon.bruteforce;

import java.io.*;

/**
 * packageName    : ${PACKAGE_NAME}  <br>
 * fileName       : ${NAME}  <br>
 * author         : sseung  <br>
 * date           : 2025-02-11  <br>
 * description    : <br><br> 분해합
 */
public class FindDivinePlus {

    public static void main(String[] args) throws Exception {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String strN = in.readLine();
        int n = stoi(strN);

        int result = 0;
        for(int i = n - (strN.length() * 9); i < n; i++) {
            int sum = 0;
            int temp = i;
            while(temp != 0) {
                sum += temp % 10;
                temp /= 10;
            }
            if(sum + i == n) {
                result = i;
                break;
            }
        }

        System.out.println(result);
    }

    public static int stoi(String s) {
        return Integer.parseInt(s);
    }

}