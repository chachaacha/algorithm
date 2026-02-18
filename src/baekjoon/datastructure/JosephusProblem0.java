package baekjoon.datastructure;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/**
 * packageName    : ${PACKAGE_NAME}  <br>
 * fileName       : ${NAME}  <br>
 * author         : sseung  <br>
 * date           : 2025-02-11  <br>
 * description    : <br><br> 요세푸스 문제
 */
public class JosephusProblem0 {

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(in.readLine(), " ");
        int n = stoi(st.nextToken());
        int k = stoi(st.nextToken());
        Queue<Integer> queue = new LinkedList<>();
        List<Integer> result = new ArrayList<>();
        for(int i = 1 ; i <= n; i ++) {
            queue.offer(i);
        }


        while(!queue.isEmpty()) {
            for(int i = 0; i < k - 1; i ++) {
                queue.offer(queue.poll());
            }
            result.add(queue.poll());
        }

        StringBuilder sb = new StringBuilder();
        sb.append("<");
        for(int num : result) {
            sb.append(num).append(", ");
        }
        sb.setLength(sb.length() - 2);
        sb.append(">");

        System.out.println(sb);

    }

    public static int stoi(String s) {
        return Integer.parseInt(s);
    }

}