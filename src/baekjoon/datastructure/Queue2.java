package baekjoon.datastructure;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Optional;
import java.util.StringTokenizer;

/**
 * packageName    : ${PACKAGE_NAME}  <br>
 * fileName       : ${NAME}  <br>
 * author         : sseung  <br>
 * date           : 2025-02-11  <br>
 * description    : <br><br> 큐2
 */
public class Queue2 {
    public static Deque<Integer> deque = new ArrayDeque<>();

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = stoi(in.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n ; i++) {
            StringTokenizer st = new StringTokenizer(in.readLine(), " ");
            if(st.countTokens() > 1) {
                st.nextToken();
                deque.addLast((stoi(st.nextToken())))   ;
            } else {
                sb.append(processor(st.nextToken())).append("\n");
            }
        }

        System.out.println(sb);



    }

    public static int processor(String command) {
        return switch (command) {
            case "pop" -> Optional.ofNullable(deque.pollFirst()).orElse(-1);
            case "size" -> deque.size();
            case "empty" -> deque.isEmpty() ? 1 : 0;
            case "front" -> Optional.ofNullable(deque.peekFirst()).orElse(-1);
            case "back" -> Optional.ofNullable(deque.peekLast()).orElse(-1);
            default -> throw new IllegalStateException("Unexpected value: " + command);
        };

    }

    public static int stoi(String s) {
        return Integer.parseInt(s);
    }

}