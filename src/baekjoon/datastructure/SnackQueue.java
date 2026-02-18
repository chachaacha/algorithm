package baekjoon.datastructure;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

/**
 * packageName    : ${PACKAGE_NAME}  <br>
 * fileName       : ${NAME}  <br>
 * author         : sseung  <br>
 * date           : 2025-02-11  <br>
 * description    : <br><br> 도키도키 간식문제
 */
public class SnackQueue {
    public static Deque<Integer> line = new ArrayDeque<>();
    public static Deque<Integer> space = new ArrayDeque<>();

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = stoi(in.readLine());
        StringTokenizer st = new StringTokenizer(in.readLine() ," ");

        while(st.hasMoreTokens()) {
            line.add(stoi(st.nextToken()));
        }

        System.out.println(process());

    }


    public static String process() {
        int index = 1;
        while(!line.isEmpty()) {
            Integer num = line.pop();
            if(num == index) {
                index++;
            } else {
                space.push(num);
            }

            while(!space.isEmpty() && space.peekFirst() == index) {
                space.pop();
                index++;
            }
        }
        while (!space.isEmpty()) {
            if (space.peek() != index) return "Sad";
            space.pop();
            index++;
        }

        return "Nice";
    }


    public static int stoi(String s) {
        return Integer.parseInt(s);
    }

}