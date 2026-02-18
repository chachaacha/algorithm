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
 * description    : <br><br> 제로
 */
public class Zero {


    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int k = stoi(in.readLine());

        Deque<Integer> queue = new ArrayDeque<>();
        for(int i = 0; i < k; i++) {
            int num = stoi(in.readLine());
            if(num != 0) {
                queue.addLast(num);
            } else {
                queue.pollLast();
            }
        }

        int sum = 0;
        for(int num : queue) {
            sum += num;
        }

        System.out.println(sum);

    }

    public static int stoi(String s) {
        return Integer.parseInt(s);
    }





}