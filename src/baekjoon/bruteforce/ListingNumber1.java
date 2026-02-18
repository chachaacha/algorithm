package baekjoon.bruteforce;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * packageName    : ${PACKAGE_NAME}  <br>
 * fileName       : ${NAME}  <br>
 * author         : sseung  <br>
 * date           : 2025-04-15  <br>
 * description    : <br><br> 수 이어 쓰기 1
 */
public class ListingNumber1 {

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = stoi(in.readLine());
        int lengthCount = 1;
        int tenSquare = 10;
        int totalLength = 0;

        for(int i = 1; i <= n; i++) {
            if(i == tenSquare) {
                lengthCount++;
                tenSquare *= 10;
            }
            totalLength += lengthCount;
        }

        System.out.println(totalLength);

    }

    public static int stoi(String s) {
        return Integer.parseInt(s);
    }

}