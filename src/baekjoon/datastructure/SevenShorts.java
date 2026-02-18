package baekjoon.datastructure;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * packageName    : ${PACKAGE_NAME}  <br>
 * fileName       : ${NAME}  <br>
 * author         : sseung  <br>
 * date           : 2025-02-11  <br>
 * description    : <br><br> 일곱 난쟁이
 */
public class SevenShorts {

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int[] shorts = new int[9];
        int sum = 0;
        for (int i = 0; i < 9; i++) {
            shorts[i] = stoi(in.readLine());
            sum += shorts[i];
        }
        Arrays.sort(shorts);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < shorts.length - 1; i++) {
            for(int j = i + 1; j < shorts.length; j ++) {
                if(sum - shorts[i] - shorts[j] == 100) {
                    for(int num : shorts) {
                        if(num != shorts[i] && num != shorts[j]) {
                            sb.append(num).append("\n");
                        }
                    }
                    System.out.println(sb);
                    return;
                }
            }
        }

    }

    public static int stoi(String s) {
        return Integer.parseInt(s);
    }

}