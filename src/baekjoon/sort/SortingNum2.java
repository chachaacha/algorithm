package baekjoon.sort;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * packageName    : ${PACKAGE_NAME}  <br>
 * fileName       : ${NAME}  <br>
 * author         : sseung  <br>
 * date           : 2025-02-11  <br>
 * description    : <br><br> 수 정렬하기 2
 */
public class SortingNum2 {

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = stoi(in.readLine());

        List<Integer> numList = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            numList.add(stoi(in.readLine()));
        }

        Collections.sort(numList);
        StringBuilder sb = new StringBuilder();
        for(int num : numList) {
            sb.append(num).append("\n");
        }

        System.out.println(sb);

    }

    public static int stoi(String s) {
        return Integer.parseInt(s);
    }

}