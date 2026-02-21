package book.code.interview.string;

/**
 * packageName    : book.code.interview.string  <br>
 * fileName       : LongestPalindromeSubString  <br>
 * author         : sseung  <br>
 * date           : 2026-02-22  <br>
 * description    : <br><br>
 *
 */
public class LongestPalindromeSubString {

    public static int maxLen;

    public static int movingPoint;

    /**
     * @param args
     * 두개씩, 3개씩 검사하면 모든 경우의 수를 검사 할 수 있다.
     * 팰린드롬은 결국 n + 1로 확장 되거나 n + 2 형태로 확장되거나 둘 중 하나다.
     * 특정 윈도우로 순회하면 놓치는 경우의 수가 없다는 것을 파악할 필요가 있다.
     */
    public static void main(String[] args) {

        String input = args[0];
        if(input.length() < 2) System.out.println(input);

        for(int i = 0; i < input.length() - 1; i ++) {
            expandPalindrome(i, i + 1, input);
            expandPalindrome(i, i + 2, input);
        }

        System.out.println(input.substring(movingPoint, movingPoint + maxLen));

    }

    public static void expandPalindrome(int left, int right, String input) {
        while(left >= 0 && right < input.length() && input.charAt(left) == input.charAt(right)) {
            --left;
            ++right;
        }

        if(maxLen < right - left -1) {
            maxLen = right - left -1;
            movingPoint = left + 1;
        }
    }

}
