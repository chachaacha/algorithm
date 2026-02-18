package baekjoon.bruteforce;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * packageName    : ${PACKAGE_NAME}  <br>
 * fileName       : ${NAME}  <br>
 * author         : sseung  <br>
 * date           : 2025-04-18  <br>
 * description    : <br><br> 부등호
 */
public class Inequality {

    public static String maxStr = "";
    public static String minStr = "";
    public static int k;
    public static boolean[] visited = new boolean[10];
    public static int[] result;
    public static String[] operator;
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        k = stoi(in.readLine());
        result = new int[k + 1];
        operator = in.readLine().split(" ");
        backTracking(0);
        System.out.println(maxStr + "\n" + minStr);

    }

    public static void backTracking(int depth) {
        if(depth == k + 1) {
            checkNum();
            return;
        }

        for(int i = 0; i < visited.length; i++) {
            if(!visited[i] && isTrue(i, depth)) {
                visited[i] = true;
                backTracking(depth + 1);
                visited[i] = false;
            }
        }
    }

    public static void checkNum() {

        for(int num : result) {
            sb.append(num);
        }
        String numStr = sb.toString();
        if (minStr.isEmpty() || numStr.compareTo(minStr) < 0) minStr = numStr;
        if (maxStr.isEmpty() || numStr.compareTo(maxStr) > 0) maxStr = numStr;
        sb.setLength(0);
    }

    public static boolean isTrue(int idx, int depth) {
       if(depth == 0 && idx == 0 && operator[idx].equals(">")) return false;
       if(depth == 0) {
           result[depth] = idx;
           return true;
       } else {
            if(operator[depth - 1].equals("<")) {
                if(result[depth - 1] < idx) {
                    result[depth] = idx;
                    return true;
                } else {
                    return false;
                }
            } else {
                if(result[depth - 1] > idx) {
                    result[depth] = idx;
                    return true;
                }
                return false;
            }
       }
    }

    public static int stoi(String s) {
        return Integer.parseInt(s);
    }

}
