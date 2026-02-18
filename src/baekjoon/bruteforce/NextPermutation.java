package baekjoon.bruteforce;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * packageName: ${PACKAGE_NAME}  <br>
 * fileName: ${NAME}  <br>
 * author: sseung  <br>
 * date: 2025-04-18  <br>
 * description: <br><br> 다음 순열
 */
public class NextPermutation {

    public static int[] arr;

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = stoi(in.readLine());
        String[] input = in.readLine().split(" ");
        arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = stoi(input[i]);
        }

        int i = n - 2;
        while(i >= 0 && arr[i] > arr[i + 1]) {
            i -- ;
        }

        if(i < 0) {
            System.out.println(-1);
            return;
        }

        int j = n - 1;
        while(arr[i] > arr[j]) {
            j--;
        }

        swap(i, j);

        reverse(i + 1, n - 1);

        StringBuilder sb = new StringBuilder();
        for(int num : arr) {
            sb.append(num).append(" ");
        }

        System.out.println(sb);


    }

    public static void swap(int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void reverse(int start, int end) {
        while(start < end) {
            swap(start++, end--);
        }
    }


    public static int stoi(String s) {
        return Integer.parseInt(s);
    }

}
