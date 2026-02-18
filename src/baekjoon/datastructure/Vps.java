package baekjoon.datastructure;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

/**
 * packageName    : ${PACKAGE_NAME}  <br>
 * fileName       : ${NAME}  <br>
 * author         : sseung  <br>
 * date           : 2025-02-11  <br>
 * description    : <br><br> 괄호
 */
public class Vps {

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = stoi(in.readLine());

        StringBuilder sb = new StringBuilder();

        while(t-- > 0) {
            sb.append(vpsFinder(in.readLine())).append("\n");
        }

        System.out.println(sb);
        in.close();

    }

    public static String vpsFinder(String vps) {
        Deque<Character> stack = new ArrayDeque<>();
        for(int i = 0; i < vps.length(); i++) {
            char data = vps.charAt(i);

            if(data == '(') {
                stack.addFirst(data);
            } else if(stack.isEmpty()) {
                return "NO";
            } else {
                stack.pollFirst();
            }

        }

        return stack.isEmpty() ? "YES" : "NO";
    }

    public static int stoi(String s) {
        return Integer.parseInt(s);
    }

}