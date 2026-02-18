package baekjoon.bruteforce;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * packageName    : ${PACKAGE_NAME}  <br>
 * fileName       : ${NAME}  <br>
 * author         : sseung  <br>
 * date           : 2025-02-11  <br>
 * description    : <br><br> 날짜 계산
 */
public class CountingYears {

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] input = in.readLine().split(" ");

        int[] years = new int[3];
        for(int i = 0 ; i < input.length; i++) {
            years[i] = stoi(input[i]);
        }

        int count = 0;
        int e = 0;
        int s = 0;
        int m = 0;
        while (e != years[0] || s != years[1] || m != years[2]) {
            e = eCount(e);
            s = sCount(s);
            m = mCount(m);
            count++;
        }

        System.out.println(count);

    }

    public static int eCount(int e) {
        if(e < 15) {
            e++;
        } else {
            e = 1;
        }

        return e;
    }

    public static int sCount(int s) {
        if(s < 28) {
            s++;
        } else {
            s = 1;
        }
        return s;
    }

    public static int mCount(int m) {
        if(m < 19) {
            m++;
        } else {
            m = 1;
        }
        return m;
    }



    public static int stoi(String s) {
        return Integer.parseInt(s);
    }



}