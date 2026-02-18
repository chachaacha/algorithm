package baekjoon.sort;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/**
 * packageName    : ${PACKAGE_NAME}  <br>
 * fileName       : ${NAME}  <br>
 * author         : sseung  <br>
 * date           : 2025-02-11  <br>
 * description    : <br><br> 단어 정렬
 */
public class WordSorting {

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = stoi(in.readLine());

        List<String> list = new ArrayList<>();
        for(int i = 0; i < n; i ++) {
            list.add(in.readLine());
        }

        list.sort(Comparator.comparing(String::length).thenComparing(Comparator.naturalOrder()));
        Set<String> set = new LinkedHashSet<>(list);

        StringBuilder sb = new StringBuilder();
        for(String word : set ) {
            sb.append(word).append("\n");
        }
        System.out.println(sb);
    }

    public static int stoi(String s) {
        return Integer.parseInt(s);
    }

}