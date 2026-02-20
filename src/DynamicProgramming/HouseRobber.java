package DynamicProgramming;

// LeetCode #198 - House Robber
// You are a robber planning to rob houses along a street.
// Adjacent houses have security systems connected, so you cannot rob two adjacent houses.
// Given an array of non-negative integers representing the amount of money in each house,
// return the maximum amount of money you can rob tonight without alerting the police.
public class HouseRobber {
    public static void recursion() {
        int[] nums = {2, 7, 9, 3, 1};
        System.out.println("Max rob amount (recursion): " + rob(nums, nums.length - 1));
    }

    private static int rob(int[] nums, int i) {
        if (i < 0) return 0;
        if (i == 0) return nums[0];
        int pick = nums[i] + rob(nums, i - 2);
        int skip = rob(nums, i - 1);
        return Math.max(pick, skip);
    }

    public static void memoization() {
        int[] nums = {2, 7, 9, 3, 1};
        int[] dp = new int[nums.length];
        java.util.Arrays.fill(dp, -1);
        System.out.println("Max rob amount (memoization): " + robMemo(nums, nums.length - 1, dp));
    }

    private static int robMemo(int[] nums, int i, int[] dp) {
        if (i < 0) return 0;
        if (i == 0) return nums[0];
        if (dp[i] != -1) return dp[i];
        int pick = nums[i] + robMemo(nums, i - 2, dp);
        int skip = robMemo(nums, i - 1, dp);
        dp[i] = Math.max(pick, skip);
        return dp[i];
    }

    public static void tabulation() {
        int[] nums = {2, 7, 9, 3, 1};
        int n = nums.length;
        int[] dp = new int[n];
        dp[0] = nums[0];
        for (int i = 1; i < n; i++) {
            int pick = nums[i] + (i >= 2 ? dp[i - 2] : 0);
            int skip = dp[i - 1];
            dp[i] = Math.max(pick, skip);
        }
        System.out.println("Max rob amount (tabulation): " + dp[n - 1]);
    }

    public static void optimal() {
        int[] nums = {2, 7, 9, 3, 1};
        int prev2 = 0, prev1 = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int pick = nums[i] + prev2;
            int skip = prev1;
            int cur = Math.max(pick, skip);
            prev2 = prev1;
            prev1 = cur;
        }
        System.out.println("Max rob amount (optimal): " + prev1);
    }
}
