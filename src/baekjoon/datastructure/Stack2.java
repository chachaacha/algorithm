package baekjoon.datastructure;

import java.io.*;
import java.util.*;

/**
 * packageName    : ${PACKAGE_NAME}  <br>
 * fileName       : ${NAME}  <br>
 * author         : sseung  <br>
 * date           : 2025-02-11  <br>
 * description    : <br><br> 스택 2
 */
public class Stack2 {
    public static Deque<Integer> stack = new ArrayDeque<>();

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = stoi(in.readLine());

        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(in.readLine(), " ");
            String command = st.nextToken();
            if(command.equals("1")) {
                stack.addFirst(stoi(st.nextToken()));
            } else {
                sb.append(useStack(command)).append("\n");
            }
        }

        System.out.println(sb);
        in.close();

    }

    public static int stoi(String s) {
        return Integer.parseInt(s);
    }

    public static int useStack(String command) {
        return switch(command) {
            case "2" -> Optional.ofNullable(stack.pollFirst()).orElse(-1);
            case "3" -> stack.size();
            case "4" -> stack.isEmpty() ? 1 : 0;
            case "5" -> Optional.ofNullable(stack.peekFirst()).orElse(-1);
            default -> 0;
        };
    }



}