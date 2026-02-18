package baekjoon.bruteforce;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * packageName    : ${PACKAGE_NAME}  <br>
 * fileName       : ${NAME}  <br>
 * author         : sseung  <br>
 * date           : 2025-02-11  <br>
 * description    : <br><br> 영화감독 숌
 */
public class MovieDirectorShoem {

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = stoi(in.readLine());

        int count = 1;
        int index = 666;
        while(count != n) {
            index++;
            if (String.valueOf(index).contains("666")) {
                count++;
            }
        }
        System.out.println(index);

    }

    public static int stoi(String s) {
        return Integer.parseInt(s);
    }

}