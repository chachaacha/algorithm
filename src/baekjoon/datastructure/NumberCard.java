package baekjoon.datastructure;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

/**
 * packageName    : ${PACKAGE_NAME}  <br>
 * fileName       : ${NAME}  <br>
 * author         : sseung  <br>
 * date           : 2025-02-11  <br>
 * description    : <br><br> 숫자 카드
 */
public class NumberCard {

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = stoi(in.readLine());
        StringTokenizer st = new StringTokenizer(in.readLine());
        Set<String> set = new HashSet<>();
        while(st.hasMoreTokens()) {
            set.add(st.nextToken());
        }

        int m = stoi(in.readLine());
        String[] array = in.readLine().split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < array.length; i ++) {
            if(set.contains(array[i])) {
                sb.append(1).append(" ");
            } else {
                sb.append(0).append(" ");
            }
        }

        System.out.println(sb);


    }

    public static int stoi(String s) {
        return Integer.parseInt(s);
    }

}