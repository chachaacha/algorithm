package book.code.interview.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * packageName    : book.code.interview.string  <br>
 * fileName       : ReorderingLogFile  <br>
 * author         : sseung  <br>
 * date           : 2026-02-18  <br>
 * description    : <br><br> 로그 파일 재정렬
 *
 */
public class ReorderingLogFile {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        String[] input = br.readLine().split(",");

        List<String> numLogList = new ArrayList<>();
        List<String> charLogList = new ArrayList<>();

        for(String log : input) {
            if(Character.isDigit(log.split(" ")[1].charAt(0))) {
                numLogList.add(log);
            } else {
                charLogList.add(log);
            }
        }


        charLogList.sort((l1, l2) ->{
                    String[] split1 = l1.split(" ", 2);
                    String[] split2 = l2.split(" ", 2);

                    int compared = split1[1].compareTo(split2[1]);
                    if(compared == 0) {
                        return split1[0].compareTo(split2[0]);
                    }
                    return compared;

                }
        );
        charLogList.addAll(numLogList);
        for(String log : charLogList) {
            System.out.println(log);
        }





        

    }

}
