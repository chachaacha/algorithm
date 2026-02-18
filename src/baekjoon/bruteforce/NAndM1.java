package baekjoon.bruteforce;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * packageName    : ${PACKAGE_NAME}  <br>
 * fileName       : ${NAME}  <br>
 * author         : sseung  <br>
 * date           : 2025-04-18  <br>
 * description    : <br><br> N과M 1
 */
public class NAndM1 {

    public static int m;
    public static int n;
    public static boolean[] visited;
    public static int[] result;
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] mn = in.readLine().split(" ");
        m = stoi(mn[0]);
        n = stoi(mn[1]);


        visited = new boolean[m];
        result = new int[n];
        backTracking(0);
        System.out.println(sb);
        in.close();

    }

    public static void backTracking(int depth) {
        if(depth == n) {
           for(int num : result) {
               sb.append(num).append(" ");
           }
           sb.append("\n");
           return;
        }

        for(int i = 0; i < m; i++) {
            if(!visited[i]) {
                visited[i] = true;
                result[depth] = i + 1;
                backTracking(depth + 1);
                visited[i] = false;
            }
        }

    }

    public static int stoi(String s) {
        return Integer.parseInt(s);
    }

}