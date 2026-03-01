package book.code.interview.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/**
 * packageName    : book.code.interview.array  <br>
 * fileName       : ThreeSum  <br>
 * author         : sseung  <br>
 * date           : 2026-03-01  <br>
 * description    : <br><br>
 *
 */
public class ThreeSum {

    public static void main(String[] args) {
        int[] numArray = new int[args.length];
        for(int i = 0 ; i < args.length; i ++) {
            numArray[i] = stoi(args[i]);
        }

        int target = 0;

//        bruteForce(numArray, target);
        twoPointer(numArray, target);
    }

    public static void bruteForce(int[] numArray, int target) {
        Arrays.sort(numArray);
        List<int[]> results = new ArrayList<>();
        for(int i = 0 ; i < numArray.length; i ++) {
            if(numArray[i] >= 0 || (i > 0 && numArray[i] == numArray[i - 1]) ) continue;
            for(int j = i + 1; j < numArray.length; j ++) {
                if(numArray[i] + numArray[j] >=0 || (j > i + 1 && numArray[j] == numArray[j - 1])) continue;
                for(int k = j + 1; k < numArray.length; k ++) {
                    if(k > j + 1 && numArray[k] == numArray[k - 1]) continue;
                    if(numArray[i] + numArray[j] + numArray[k] == 0) results.add(new int[]{numArray[i], numArray[j], numArray[k]});
                }
            }
        }

        for(int[] arr : results) {
            System.out.println(Arrays.toString(arr));
        }
    }

//    /**
//     * bad code
//     *
//     * @param numArray
//     * @param target
//     */
//    public static void twoPointer(int[] numArray, int target) {
//        Arrays.sort(numArray);
//        List<int[]> results = new ArrayList<>();
//        for(int i = 0; i < numArray.length -2 ; i ++) {
//            int left = i + 1;
//            int right = numArray.length - 1;
//            while(left < right) {
//                if(numArray[i] + numArray[left] + numArray[right] == 0) results.add(new int[]{numArray[i], numArray[left], numArray[right]});
//                left ++;
//                -- right;
//            }
//        }
//
//        for(int[] arr : results) {
//            System.out.println(Arrays.toString(arr));
//        }
//
//    }

    public static void twoPointer(int[] numArray, int target) {
        Arrays.sort(numArray);
        List<List<Integer>> results = new ArrayList<>();

        for(int i = 0 ; i < numArray.length - 2; i ++) {
            if(i > 0 && numArray[i] == numArray[i - 1]) continue;
            int left = i + 1;
            int right = numArray.length -1;

            while(left < right) {
                int sum = numArray[i] + numArray[left] + numArray[right];
                if(sum == 0) {
                    results.add(List.of(numArray[i],numArray[left],numArray[right]));

                    while(left < right && numArray[left] == numArray[left + 1]) left ++;
                    while(left < right && numArray[right] == numArray[right - 1]) right --;
                    ++left;
                    --right;
                } else if(sum < 0) {
                    ++left;
                } else {
                    --right;
                }
            }
        }

        for(List<Integer> arr : results) {
            System.out.println(arr.toString());
        }



    }


    public static int stoi(String s) {
        return Integer.parseInt(s);
    }
}
