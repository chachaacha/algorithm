package baekjoon.sort;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * packageName    : ${PACKAGE_NAME}  <br>
 * fileName       : ${NAME}  <br>
 * author         : sseung  <br>
 * date           : 2025-02-11  <br>
 * description    : <br><br> 소트인사이드
 */
public class SortInside {

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] n = in.readLine().split("");

        int[] counting = new int[10];
        for(int i = 0; i < n.length; i++) {
            counting[stoi(n[i])]++;
        }

        StringBuilder sb = new StringBuilder();
        for(int i = counting.length - 1; i >= 0 ; i --) {
            while(counting[i]-- > 0) {
                sb.append(i);
            }
        }

        System.out.println(sb);
    }


    public static int stoi(String s) {
        return Integer.parseInt(s);
    }

}