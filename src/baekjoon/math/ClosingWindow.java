package baekjoon.math;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * packageName    : ${PACKAGE_NAME}  <br>
 * fileName       : ${NAME}  <br>
 * author         : sseung  <br>
 * date           : 2025-02-11  <br>
 * description    : <br><br> 창문닫기
 */
public class ClosingWindow {

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = stoi(in.readLine());

        System.out.println((int)Math.sqrt(n));

    }



    public static int stoi(String s) {
        return Integer.parseInt(s);
    }



}