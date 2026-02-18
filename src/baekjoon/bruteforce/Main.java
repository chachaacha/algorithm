package baekjoon.bruteforce;

import java.io.*;

/**
 * packageName: ${PACKAGE_NAME}  <br>
 * fileName: ${NAME}  <br>
 * author: sseung  <br>
 * date: 2025-05-21  <br>
 * description: <br><br> 외판원 순회2
 */
public class Main {

    public static boolean[] visited;
    public static int[][] arr;
    public static int n;
    public static int[] route;
    public static int min = Integer.MAX_VALUE;

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        n = stoi(in.readLine());
        arr = new int[n][n];
        visited = new boolean[n];
        route = new int[n];
        for(int i = 0; i < n; i++) {
            String[] input = in.readLine().split(" ");
            for(int j = 0; j < n; j++) {
                arr[i][j] = stoi(input[j]);
            }
        }

        backTracking(0);
        System.out.println(min);
        in.close();

    }

    public static void backTracking(int depth) {
        int cost = findMin();
        if(depth == n && arr[route[n-1]][route[0]] != 0) {
            if(cost == 0) return;
            min = Math.min(min, cost + arr[route[n-1]][route[0]]);
            return;
        }

        for(int i = 0; i < n; i++) {
            if(!visited[i]) {
                visited[i] = true;
                route[depth] = i;
                backTracking(depth + 1);
                visited[i] = false;
            }
        }
    }

    public static int findMin() {
        int total = 0;
        for(int i = 1; i < n ; i++) {
            int cost = arr[route[i-1]][route[i]];
            if(cost != 0) {
                total += cost;
            } else {
                return 0;
            }
        }
        return total;
    }

    public static int stoi(String s) {
        return Integer.parseInt(s);
    }

}
