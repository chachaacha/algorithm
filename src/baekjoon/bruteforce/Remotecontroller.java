package baekjoon.bruteforce;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * packageName    : ${PACKAGE_NAME}  <br>
 * fileName       : ${NAME}  <br>
 * author         : sseung  <br>
 * date           : 2025-02-11  <br>
 * description    : <br><br> 리모컨
 */
public class Remotecontroller {

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = stoi(in.readLine());
        int m = stoi(in.readLine());

        int min = Math.abs(100 - n);

        if(m == 0) {
            min = Math.min(min, String.valueOf(n).length());
            System.out.println(min);
            return;
        }

        String[] broken = in.readLine().split(" ");
        List<Character> brokenList = new ArrayList<>();
        for(String number : broken) {
            brokenList.add(number.charAt(0));
        }

        for(int i = 0; i <= 999999; i ++){
            boolean isBroken = false;
            String input = String.valueOf(i);
            for(int j = 0; j < input.length(); j++) {
                if(brokenList.contains(input.charAt(j))) {
                    isBroken = true;
                }
            }

            if(!isBroken) {
                min = Math.min(min, input.length() + Math.abs(i - n));
            }
        }

        System.out.println(min);

    }

    public static int stoi(String s) {
        return Integer.parseInt(s);
    }

}