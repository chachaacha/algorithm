package baekjoon.datastructure;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/**
 * packageName    : ${PACKAGE_NAME}  <br>
 * fileName       : ${NAME}  <br>
 * author         : sseung  <br>
 * date           : 2025-02-11  <br>
 * description    : <br><br> 회사에 있는 사람
 */
public class CompanyMemeber {

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = stoi(in.readLine());

        Map<String, String> map = new TreeMap<>(Comparator.reverseOrder());

        for(int i = 0; i < n; i++ ) {
            String[] input = in.readLine().split(" ");
            map.put(input[0], input[1]);
        }


        StringBuilder sb = new StringBuilder();
        for(Map.Entry<String, String> data : map.entrySet()) {
            if(data.getValue().equals("enter")) sb.append(data.getKey()).append("\n");
        }

        System.out.println(sb); 


    }

    public static int stoi(String s) {
        return Integer.parseInt(s);
    }

}