package baekjoon.sort;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

/**
 * packageName    : ${PACKAGE_NAME}  <br>
 * fileName       : ${NAME}  <br>
 * author         : sseung  <br>
 * date           : 2025-02-11  <br>
 * description    : <br><br> 좌표 정렬하기
 */
public class SortingCoordinate {

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = stoi(in.readLine());

        int[][] array = new int[n][];
        //2차원 배열 생성
        for(int i = 0; i < array.length; i ++) {
            String[] coordinate = in.readLine().split(" ");
            array[i] = new int[]{stoi(coordinate[0]), stoi(coordinate[1])};
        }

        Arrays.sort(array, Comparator.comparing((int[] a) -> a[0]).thenComparing((int[] a) -> a[1]));

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < array.length; i ++) {
            for(int k = 0; k < array[i].length; k ++) {
                sb.append(array[i][k]).append(" ");
            }
            sb.append("\n");
        }

        System.out.println(sb);

    }


    public static int stoi(String s) {
        return Integer.parseInt(s);
    }

}