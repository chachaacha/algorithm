package baekjoon.math;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * packageName    : ${PACKAGE_NAME}  <br>
 * fileName       : ${NAME}  <br>
 * author         : sseung  <br>
 * date           : 2025-02-11  <br>
 * description    : <br><br> 가로수
 */
public class Tree {

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = stoi(in.readLine());

        int[] tree = new int[n];
        for(int i = 0; i < n; i ++) {
            tree[i] = stoi(in.readLine());
        }

        int gcdValue = tree[1] - tree[0];

        for (int i = 2; i < n; i++) {
            gcdValue = gcd(gcdValue, tree[i] - tree[i - 1]);
        }
        int count = (tree[n-1] - tree[0]) / gcdValue + 1;


        System.out.println(count - tree.length);

    }

    public static int gcd(int a, int b) {
        while(b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int stoi(String s) {
        return Integer.parseInt(s);
    }

}