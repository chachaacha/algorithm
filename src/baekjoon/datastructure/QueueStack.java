package baekjoon.datastructure;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/**
 * packageName    : ${PACKAGE_NAME}  <br>
 * fileName       : ${NAME}  <br>
 * author         : sseung  <br>
 * date           : 2025-02-11  <br>
 * description    : <br><br> 큐스텍
 */
public class QueueStack {

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = stoi(in.readLine());
        int[] collections = new int[n];
        StringTokenizer st = new StringTokenizer(in.readLine(), " ");
        for(int i = 0; i < n; i ++) {
            collections[i] = stoi(st.nextToken());
        }

        st = new StringTokenizer(in.readLine(), " ");

        Deque<Integer> queueStack = new ArrayDeque<>();
        for(int i = 0; i < n; i++) {
            int value = stoi(st.nextToken());
            if(collections[i] == 0) {
                queueStack.add(value);
            }
        }

        int m = stoi(in.readLine());
        String[] input = in.readLine().split(" ");
        List<Integer> listInput = new ArrayList<>();
        for(int i = 0; i < m ; i++) {
            listInput.add(stoi(input[i]));
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < m; i++) {
            queueStack.addFirst(listInput.get(i));
            sb.append(queueStack.pollLast()).append(" ");
        }
        System.out.println(sb);

    }

    public static int stoi(String s) {
        return Integer.parseInt(s);
    }

}