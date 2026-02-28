package book.code.interview.array;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * packageName    : book.code.interview.array  <br>
 * fileName       : TrappingRainWater  <br>
 * author         : sseung  <br>
 * date           : 2026-02-28  <br>
 * description    : <br><br>
 *
 */
public class TrappingRainWater {

    public static void main(String[] args) {
//        twoPointer(args);
        stack(args);
    }

    public static void twoPointer(String[] args) {
        int[] height = new int[args.length];
        for(int i = 0; i <  height.length; i ++) {
            height[i] = stoi(args[i]);

        }
        int left = 0;
        int right = height.length - 1;
        int maxLeftHeight = height[left];
        int maxRightHeight = height[right];
        int waterFall = 0;

        while(left < right) {
            maxLeftHeight = Math.max(height[left], maxLeftHeight);
            maxRightHeight = Math.max(height[right], maxRightHeight);
            if(maxLeftHeight <= maxRightHeight) {
                waterFall += maxLeftHeight - height[left];
                ++left;
            } else {
                waterFall += maxRightHeight - height[right];
                --right;
            }
        }

        System.out.println(waterFall);

    }

    //TODO 이해 부족
    public static void stack(String[] args) {
        int volumes = 0;
        int[] height = new int[args.length];
        for(int i = 0; i <  height.length; i ++) {
            height[i] = stoi(args[i]);

        }

        Deque<Integer> stack = new ArrayDeque<>();

        for(int i = 0 ; i < height.length; i ++) {
            // 현재 벽의 높이가 이전 벽보다 높을 시 물이 고임
            while(!stack.isEmpty() && height[i] > height[stack.peek()]) {

                int valley = stack.pop();
                if(stack.isEmpty()) break;

                int distance = i - stack.peek() - 1;

                int waters = Math.min(height[i], height[stack.peek()]) - height[valley];

                volumes += waters * distance;

            }
            stack.push(i);
        }
        System.out.println(volumes);
    }

    public static int stoi(String s) {
        return Integer.parseInt(s);
    }
}
