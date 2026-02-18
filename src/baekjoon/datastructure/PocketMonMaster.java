package baekjoon.datastructure;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

/**
 * packageName    : ${PACKAGE_NAME}  <br>
 * fileName       : ${NAME}  <br>
 * author         : sseung  <br>
 * date           : 2025-02-11  <br>
 * description    : <br><br> 나는야 포켓몬 마스터
 */
public class PocketMonMaster {

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(in.readLine());

        int n = stoi(st.nextToken());
        int m = stoi(st.nextToken());

        Map<String, String> numMap = new HashMap<>();
        Map<String, String> nameMap = new HashMap<>();

        for(int i = 1; i <= n; i ++) {
            String data = in.readLine();
            numMap.put(String.valueOf(i), data);
            nameMap.put(data, String.valueOf(i));
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 1 ; i <= m; i++) {
            String data = in.readLine();
            if (nameMap.containsKey(data)) {
                sb.append(nameMap.get(data)).append("\n");
            } else {
                sb.append(numMap.get(data)).append("\n");
            }
        }

        System.out.println(sb);


    }

    public static int stoi(String s) {
        return Integer.parseInt(s);
    }

}