package book.code.interview.array;

import java.util.Arrays;

/**
 * packageName    : book.code.interview.array  <br>
 * fileName       : ArrayPartition  <br>
 * author         : sseung  <br>
 * date           : 2026-03-01  <br>
 * description    : <br><br>
 *
 */
public class ArrayPartition {

    public static void main(String[] args) {
        int[] arr = new int[args.length];
        for(int i = 0 ; i < arr.length; i ++) {
            arr[i] = stoi(args[i]);
        }

        Arrays.sort(arr);
        int max = 0;
        for(int i = 0 ; i < arr.length; i += 2) {
            max += arr[i];
        }
        System.out.println(max);
    }

    public static int stoi(String s) {
        return Integer.parseInt(s);
    }


}
