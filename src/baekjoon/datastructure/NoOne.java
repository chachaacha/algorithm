package baekjoon.datastructure;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

/**
 * packageName    : ${PACKAGE_NAME}  <br>
 * fileName       : ${NAME}  <br>
 * author         : sseung  <br>
 * date           : 2025-02-11  <br>
 * description    : <br><br> 듣보잡
 */
public class NoOne {

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(in.readLine());
        int n = stoi(st.nextToken());
        int m = stoi(st.nextToken());

        Set<String> set1 = new TreeSet<>();
        for(int i = 0; i < n; i++) {
            set1.add(in.readLine());
        }

        Set<String> set2 = new TreeSet<>();
        for(int i = 0; i < m; i ++) {
            set2.add(in.readLine());
        }

        set1.retainAll(set2);

        StringBuilder sb = new StringBuilder();
        sb.append(set1.size()).append("\n");
        for(String man : set1) {
            sb.append(man).append("\n");
        }

        System.out.println(sb);

    }

    public static int stoi(String s) {
        return Integer.parseInt(s);
    }

}