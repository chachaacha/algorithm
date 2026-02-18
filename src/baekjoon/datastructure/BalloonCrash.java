package baekjoon.datastructure;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/**
 * packageName    : ${PACKAGE_NAME}  <br>
 * fileName       : ${NAME}  <br>
 * author         : sseung  <br>
 * date           : 2025-02-11  <br>
 * description    : <br><br> 풍선 터뜨리기
 */
public class BalloonCrash {

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = stoi(in.readLine());
        Deque<Integer> balloon = new ArrayDeque<>();
        Deque<Integer> paper = new ArrayDeque<>();
        List<Integer> result = new ArrayList<>();
        for(int i = 1 ; i <= n; i++) {
            balloon.addLast(i);
        }

        StringTokenizer st = new StringTokenizer(in.readLine(), " ");
        for(int i = 0; i < n ; i ++) {
            paper.addLast(stoi(st.nextToken()));
        }

        Integer move = paper.pollFirst();
        while(!balloon.isEmpty()) {
            if(balloon.peekFirst() == 1) {
                result.add(balloon.pollFirst());
            }

            if(move > 0) {
                for(int i = 0 ; i < move - 1; i++) {
                    balloon.addLast(balloon.pollFirst());
                    paper.addLast(paper.pollFirst());
                }
                result.add(balloon.pollFirst());
                move = paper.pollFirst();

            } else {
                for(int i = 0 ; i < Math.abs(move) - 1; i++) {
                    balloon.addFirst(balloon.pollLast());
                    paper.addFirst(paper.pollLast());
                }
                result.add(balloon.pollLast());
                move = paper.pollLast();

            }

        }

        StringBuilder sb = new StringBuilder();
        for(int num : result) {
            sb.append(num).append(" ");
        }

        System.out.println(sb);

    }

    public static int stoi(String s) {
        return Integer.parseInt(s);
    }

}