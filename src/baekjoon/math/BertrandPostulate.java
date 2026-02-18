package baekjoon.math;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * packageName    : ${PACKAGE_NAME}  <br>
 * fileName       : ${NAME}  <br>
 * author         : sseung  <br>
 * date           : 2025-02-11  <br>
 * description    : <br><br> 베르트랑 공준
 */
public class BertrandPostulate {

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String input = "";

        while(!(input = in.readLine()).equals("0")) {
            int n = stoi(input);
            int count = 0;
            for(int i = n + 1; i <= 2 * n; i ++) {
                if(find(i)) count++;
            }
            sb.append(count).append("\n");
        }

        System.out.println(sb);


    }

    public static boolean find(int num) {
        if(num == 2) return true;
        if(num % 2 == 0) return false;
        for(int i = 3; i * i <= num; i += 2) {
            if(num % i == 0) {
                return false;
            }
        }
        return true;
    }


    public static int stoi(String s) {
        return Integer.parseInt(s);
    }



}