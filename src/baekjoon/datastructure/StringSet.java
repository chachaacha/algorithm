package baekjoon.datastructure;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

/**
 * packageName    : ${PACKAGE_NAME}  <br>
 * fileName       : ${NAME}  <br>
 * author         : sseung  <br>
 * date           : 2025-02-11  <br>
 * description    : <br><br> 문자열 집합
 */
public class StringSet {

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(in.readLine());

        int n = stoi(st.nextToken());
        int m = stoi(st.nextToken());

        Set<String> mainSet = new HashSet<>();
        for(int i = 0; i < n; i ++) {
            mainSet.add(in.readLine());
        }

        int count = 0;
        for (int i = 0; i < m; i++) {
            String test = in.readLine();
            if (mainSet.contains(test)) {
                count++;
            }
        }
        System.out.println(count);

    }

    public static int stoi(String s) {
        return Integer.parseInt(s);
    }

}