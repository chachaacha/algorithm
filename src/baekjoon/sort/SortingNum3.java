package baekjoon.sort;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * packageName    : ${PACKAGE_NAME}  <br>
 * fileName       : ${NAME}  <br>
 * author         : sseung  <br>
 * date           : 2025-02-11  <br>
 * description    : <br><br> 수 정렬하기 3
 */
public class SortingNum3 {

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = stoi(in.readLine());

        int[] array = new int[n];
        int[] result = new int[n];

        int max = 0;
        for(int i = 0; i < n; i++) {
            array[i] = stoi(in.readLine());
            if(max < array[i]) {
                max = array[i];
            }
        }


        int[] counting = new int[max+1];
        // 정렬할 배열의 등장 횟수
        for(int i = 0; i < n; i++) {
            counting[array[i]]++;
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < counting.length ; i ++) {
            while(counting[i]-- > 0) {
                sb.append(i).append("\n");
            }
        }

        System.out.println(sb);
    }


    public static int stoi(String s) {
        return Integer.parseInt(s);
    }

}