package Stack;

import Arrays.ArraysUtils;

import java.util.Stack;

public class NextGreater_II {
    public static void nextGreaterElements() {
        int[] nums = {1, 2, 3, 4, 3};
        int n = nums.length;
        int[] ans = new int[nums.length];
        Stack<Integer> stack = new Stack<>();
        ArraysUtils.printArray(nums);
        System.out.println();
        for (int i = 2 * n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() <= nums[i % n]) {
                stack.pop();
            }
            if (i < n) {
                if (stack.isEmpty()) {
                    ans[i] = -1;
                } else {
                    ans[i] = stack.peek();
                }
            }
            stack.push(nums[i % n]);
        }
        ArraysUtils.printArray(ans);
    }
}
