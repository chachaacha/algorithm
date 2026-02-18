package baekjoon.bruteforce;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * packageName    : ${PACKAGE_NAME}  <br>
 * fileName       : ${NAME}  <br>
 * author         : sseung  <br>
 * date           : 2025-02-11  <br>
 * description    : <br><br> 체스판 다시 칠하기.
 */
public class PaintChessBoard {


    public static void main(String[] args) throws Exception {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] input = in.readLine().split(" ");
        int n = stoi(input[0]);
        int m = stoi(input[1]);

        int min = 64;

        String[][] board = new String[n][m];
        for(int i = 0; i < n; i ++) {
            board[i] = in.readLine().split("");
        }

        // 4중 for문이 필요하다
        // 큰 체스판에서 움직일 2중첩 for 루프
        for(int row = 0; row < n - 7; row ++) {
            for(int col = 0; col < m - 7; col ++) {
                min = Math.min(min, paint(row, col, board));
            }
        }

        System.out.println(min);


    }

    public static int paint(int row, int col, String[][] board) {
        int count = 0;
        //흰색을 기준으로 흰색이 아니면 더한다
        String targetCol = "W";
        for(int i = row; i < row + 8; i ++) {
            for(int k = col; k < col + 8; k ++) {

                if(!board[i][k].equals(targetCol)) {
                    count++;
                }
                // 매 칸 마다 변경
                targetCol = targetCol.equals("W") ? "B" : "W";
            }
            //줄바뀌면 역전
            targetCol = targetCol.equals("W") ? "B" : "W";
        }

        // 8 * 8 대칭에서 2개의 반복되는 값이니 하나의 변경은 전체에서 그 변경을 뺀 값과 같다
        return Math.min(count, 64 - count);
    }

    public static int stoi(String s) {
        return Integer.parseInt(s);
    }

}