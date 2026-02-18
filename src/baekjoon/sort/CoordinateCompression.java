package baekjoon.sort;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * packageName    : ${PACKAGE_NAME}  <br>
 * fileName       : ${NAME}  <br>
 * author         : sseung  <br>
 * date           : 2025-02-11  <br>
 * description    : <br><br> 좌표 압축
 */
public class CoordinateCompression {

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = stoi(in.readLine());
        String[] input = in.readLine().split(" ");
        int[] array = new int[n];

        for(int i = 0; i < array.length; i++) {
            array[i] = stoi(input[i]);
        }

        int[] copyArray = Arrays.copyOf(array, n);
        Arrays.sort(copyArray);

        Map<Integer, Integer> map = new HashMap<>();
        int index = 0;
        for(int num : copyArray) {
            if(map.containsKey(num)) {
                continue;
            }
            map.put(num, index++);
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i ++) {
            sb.append(map.get(array[i])).append(" ");
        }

        System.out.println(sb);

    }

    public static int stoi(String s) {
        return Integer.parseInt(s);
    }

}