package baekjoon.bruteforce;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class BlackJack {

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = in.readLine().split(" ");
        int n = stoi(inputs[0]);
        int m = stoi(inputs[1]);
        String[] stringCards = in.readLine().split(" ");
        int[] cards = new int[n];

        for(int g = 0; g < n; g++) {
            cards[g] = stoi(stringCards[g]);
        }

        Integer result = search(n, cards, m);

        System.out.println(result);

    }

    private static Integer search(int n, int[] cards, int m) {
        int result = 0;
        for(int i = 0; i < n-2; i ++) {
            if(cards[i] >= m) continue;
            for(int j = i + 1; j < n-1; j++) {
                if(cards[i] + cards[j] >= m) continue;
                for(int k = j + 1; k < n; k ++) {
                    int temp = cards[i] + cards[j] + cards[k];

                    if(m == temp) {
                        return temp;
                    }

                    // 이전 합보다 크면서 넘지 말아야할 m보다 작을 때 갱신
                    if(result < temp && temp < m) {
                        result = temp;
                    }
                }
            }
        }
        return result;
    }

    public static int stoi(String s) {
        return Integer.parseInt(s);
    }

//    public static long stol(String s) {
//        return Long.parseLong(s);
//    }
}