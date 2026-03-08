package book.code.interview.array;

/**
 * packageName    : book.code.interview.array  <br>
 * fileName       : BestTimeToBuyAndSellStock  <br>
 * author         : sseung  <br>
 * date           : 2026-03-08  <br>
 * description    : <br><br>
 *
 */
public class BestTimeToBuyAndSellStock {

    public static void main(String[] args) {
        int[] arr = new int[args.length];
        for(int i = 0 ; i < arr.length; i ++) {
            arr[i] = stoi(args[i]);
        }
        solve(arr);
    }

    public static void solve(int[] price) {
        int maxProfit = 0;
        int minPoint = price[0];

        for(int point : price) {
            minPoint = Math.min(minPoint, point);
            maxProfit = Math.max(maxProfit, point - minPoint);
        }
        System.out.println(maxProfit);
    }

    public static int stoi(String s) {
        return Integer.parseInt(s);
    }


}
