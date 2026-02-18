package baekjoon.bruteforce;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * packageName    : ${PACKAGE_NAME}  <br>
 * fileName       : ${NAME}  <br>
 * author         : sseung  <br>
 * date           : 2025-04-18  <br>
 * description    : <br><br> 링크와 스타트
 */
public class LinkAndStart {

    public static int n;
    public static int[][] board;
    public static boolean[] visited;
    public static int min = Integer.MAX_VALUE;

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        n = stoi(in.readLine());
        board = new int[n][n];
        visited = new boolean[n];
        for(int i = 0; i < board.length; i++) {
            StringTokenizer st = new StringTokenizer(in.readLine(), " ");
            for(int j = 0; j < board[i].length; j++ ) {
                board[i][j] = stoi(st.nextToken());
            }
        }

        for(int i = n / 2; i > 0; i-- ) {
            backTracking(0, 0, i);
        }

        System.out.println(min);

    }

    public static void backTracking(int depth, int startIdx, int maxDepth) {
        if(depth == maxDepth) {
            min = Math.min(min, findMinNum());
            return;
        }

        for(int i = startIdx; i < n; i++) {
            if(!visited[i]) {
                visited[i] = true;
                backTracking(depth + 1, i + 1, maxDepth);
                visited[i] = false;

            }
        }
    }

    public static int findMinNum() {
        int startPoint = 0;
        int linkPoint = 0;

        for(int i = 0; i < n - 1; i ++) {
            for(int j = i + 1; j < n; j ++) {
                if(visited[i] && visited[j]) {
                    startPoint += board[i][j];
                    startPoint += board[j][i];
                }

                if(!visited[i] && !visited[j]) {
                    linkPoint += board[i][j];
                    linkPoint += board[j][i];
                }
            }
        }
        return Math.abs(startPoint - linkPoint);
    }


    public static int stoi(String s) {
        return Integer.parseInt(s);
    }

}
