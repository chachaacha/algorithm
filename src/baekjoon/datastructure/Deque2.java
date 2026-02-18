package baekjoon.datastructure;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

/**
 * packageName    : ${PACKAGE_NAME}  <br>
 * fileName       : ${NAME}  <br>
 * author         : sseung  <br>
 * date           : 2025-02-11  <br>
 * description    : <br><br> 덱 2
 */
public class Deque2 {

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = stoi(in.readLine());
        Deque<Integer> deque = new ArrayDeque<>();
        List<Integer> result = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(in.readLine(), " ");
            switch(st.nextToken()) {
                case "1" -> deque.addFirst(stoi(st.nextToken()));
                case "2" -> deque.addLast(stoi(st.nextToken()));
                case "3" -> result.add(Optional.ofNullable(deque.pollFirst()).orElse(-1));
                case "4" -> result.add(Optional.ofNullable(deque.pollLast()).orElse(-1));
                case "5" -> result.add(deque.size());
                case "6" -> result.add(deque.isEmpty() ? 1 : 0);
                case "7" -> result.add(deque.isEmpty() ? -1 : deque.peekFirst());
                case "8" -> result.add(deque.isEmpty() ? -1 : deque.peekLast());
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int num : result) {
            sb.append(num).append("\n");
        }

        out.write(sb.toString());
        out.flush();
        in.close();
        out.close();

    }

    public static int stoi(String s) {
        return Integer.parseInt(s);
    }

}