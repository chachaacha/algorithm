package baekjoon.sort;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * packageName    : ${PACKAGE_NAME}  <br>
 * fileName       : ${NAME}  <br>
 * author         : sseung  <br>
 * date           : 2025-02-11  <br>
 * description    : <br><br> 커트라인
 */
public class Cutline {

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] input = in.readLine().split(" ");
        int n = stoi(input[0]);
        int k = stoi(input[1]);

        String[] numInput = in.readLine().split(" ");
        int[] numArray = new int[n];
        for(int i = 0; i < n; i++) {
            numArray[i] = stoi(numInput[i]);
        }

        for(int i = 1; i < n; i++) {
            int targetNum = numArray[i];
            int compareIndex = i - 1;
            while(compareIndex >= 0 && targetNum > numArray[compareIndex]) {
                numArray[compareIndex + 1] = numArray[compareIndex];
                compareIndex--;
            }
            numArray[compareIndex + 1] = targetNum;
        }

        System.out.println(numArray[k-1]);

    }

    public static int stoi(String s) {
        return Integer.parseInt(s);
    }

}