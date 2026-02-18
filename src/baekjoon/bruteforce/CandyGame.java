package baekjoon.bruteforce;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * packageName    : ${PACKAGE_NAME}  <br>
 * fileName       : ${NAME}  <br>
 * author         : sseung  <br>
 * date           : 2025-02-11  <br>
 * description    : <br><br> 사탕 게임
 */
public class CandyGame {

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = stoi(in.readLine());
        char[][] candies = new char[n][n];

        for(int i = 0; i < n; i++) {
            candies[i] = in.readLine().toCharArray();
        }

        int max = 0;
        for(int x = 0; x < n; x++) {
            for(int y = 0; y < n; y++) {
                if(x < n - 1) { // 아래행과 교환
                    switching(candies, x, y, x + 1, y);
                    max = Math.max(findMaxCandyCounts(candies), max);
                    switching(candies, x, y, x + 1, y);

                }

                if(y < n - 1) { // 오른쪽열과 교환
                    switching(candies, x, y, x, y + 1);
                    max = Math.max(findMaxCandyCounts(candies), max);
                    switching(candies, x, y, x, y + 1);
                }
            }
        }

        System.out.println(max);
        in.close();
    }

    public static void switching(char[][] candies, int x1, int y1, int x2, int y2) {
        char temp = candies[x1][y1];
        candies[x1][y1] = candies[x2][y2];
        candies[x2][y2] = temp;
    }

    public static int findMaxCandyCounts(char[][] candies) {
        int maxResult = 0;
        for(int x = 0; x < candies.length; x ++){
            int candyRowChains = 1;
            int candyColChains = 1;
            for(int y = 1; y < candies.length; y ++) { // 행순회
                if(candies[x][y] == candies[x][y - 1]) {
                    candyRowChains++;
                } else {
                    maxResult = Math.max(maxResult, candyRowChains);
                    candyRowChains = 1;
                }

                if(candies[y][x] == candies[y - 1][x]) { // 열순회
                    candyColChains++;
                } else {
                    maxResult = Math.max(maxResult, candyColChains);
                    candyColChains = 1;
                }
            }
            maxResult = Math.max(maxResult, Math.max(candyRowChains, candyColChains));
        }
        return maxResult;
    }

    public static int stoi(String s) {
        return Integer.parseInt(s);
    }



}