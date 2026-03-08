package book.code.interview.array;

import java.util.Arrays;

/**
 * packageName    : book.code.interview.array  <br>
 * fileName       : ProductOfArrayExceptSelf  <br>
 * author         : sseung  <br>
 * date           : 2026-03-07  <br>
 * description    : <br><br>
 *
 */
public class ProductOfArrayExceptSelf {

    public static void main(String[] args) {
        int[] arr = new int[args.length];

        for(int i = 0 ; i < args.length; i ++) {
            arr[i] = stoi(args[i]);
        }

        bruteForce(arr);
    }

    public static void bruteForce(int[] arr) {
        int[] result = new int[arr.length];
        int init = 1;
        for(int i = 0; i < arr.length; i ++) {
            result[i] = init;
            init *= arr[i];
        }

        init = 1;
        for(int i = arr.length - 1; i >= 0; i--) {
            result[i] *= init;
            init *= arr[i];
        }

        System.out.println(Arrays.toString(result));

    }

    public static int stoi(String s) {
        return Integer.parseInt(s);
    }
    
}
