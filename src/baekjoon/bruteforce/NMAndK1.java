package baekjoon.bruteforce;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * packageName    : ${PACKAGE_NAME}  <br>
 * fileName       : ${NAME}  <br>
 * author         : sseung  <br>
 * date           : 2025-04-18  <br>
 * description    : <br><br> NM과 K1
 */
public class NMAndK1 {

    public static int n, m, k, max = Integer.MIN_VALUE;
    public static boolean[][] visited;
    public static int[][] board;
    public static int[] dr = {-1, 1, 0, 0};
    public static int[] dc = {0, 0, -1, 1};

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] nmk = in.readLine().split(" ");
        n = stoi(nmk[0]);
        m = stoi(nmk[1]);
        k = stoi(nmk[2]);
        visited = new boolean[n][m];
        board = new int[n][m];

        for(int i = 0; i < board.length; i++) {
            StringTokenizer st = new StringTokenizer(in.readLine(), " ");
            for(int j = 0; j < board[i].length; j ++) {
                board[i][j] = stoi(st.nextToken());
            }
        }

        backTracking(0, 0,0,0);

        System.out.println(max);

    }

    public static void backTracking(int depth, int sum, int startRow, int startCol) {
        if(depth == k) {
            max = Math.max(max, sum);
            return;
        }

        for(int i = startRow; i < n ; i++) {
            for(int j = (i == startRow ? startCol : 0) ; j < m; j ++) {
                if(!visited[i][j] && isIsOk(i, j)) {
                    visited[i][j] = true;
                    backTracking(depth + 1, sum + board[i][j], i, j);
                    visited[i][j] = false;
                }
            }
        }
    }

    private static boolean isIsOk(int i, int j) {
        for(int dir = 0; dir < 4; dir++) {
            int nr = i + dr[dir];
            int nc = j + dc[dir];

            if((nr >= 0 && nr < n && nc >= 0 && nc < m) && visited[nr][nc]) {
                return false;
            }
        }
        return true;
    }

    public static int stoi(String s) {
        return Integer.parseInt(s);
    }

}