package DynamicProgramming;

// Classic 0/1 Knapsack Problem
// Given weights and values of n items, put items in a knapsack of capacity W
// to get the maximum total value. Each item can be taken at most once.
public class Knapsack01 {
    public static void recursion() {
        int[] weight = {1, 3, 4, 5};
        int[] value  = {1, 4, 5, 7};
        int W = 7;
        System.out.println("Max knapsack value (recursion): " + knapsack(weight, value, W, weight.length - 1));
    }

    private static int knapsack(int[] weight, int[] value, int W, int i) {
        if (i < 0 || W == 0) return 0;
        if (weight[i] > W) return knapsack(weight, value, W, i - 1);
        int pick = value[i] + knapsack(weight, value, W - weight[i], i - 1);
        int skip = knapsack(weight, value, W, i - 1);
        return Math.max(pick, skip);
    }

    public static void memoization() {
        int[] weight = {1, 3, 4, 5};
        int[] value  = {1, 4, 5, 7};
        int W = 7;
        int n = weight.length;
        int[][] dp = new int[n][W + 1];
        for (int[] row : dp) java.util.Arrays.fill(row, -1);
        System.out.println("Max knapsack value (memoization): " + knapsackMemo(weight, value, W, n - 1, dp));
    }

    private static int knapsackMemo(int[] weight, int[] value, int W, int i, int[][] dp) {
        if (i < 0 || W == 0) return 0;
        if (dp[i][W] != -1) return dp[i][W];
        if (weight[i] > W) {
            dp[i][W] = knapsackMemo(weight, value, W, i - 1, dp);
        } else {
            int pick = value[i] + knapsackMemo(weight, value, W - weight[i], i - 1, dp);
            int skip = knapsackMemo(weight, value, W, i - 1, dp);
            dp[i][W] = Math.max(pick, skip);
        }
        return dp[i][W];
    }

    public static void tabulation() {
        int[] weight = {1, 3, 4, 5};
        int[] value  = {1, 4, 5, 7};
        int n = weight.length;
        int W = 7;
        int[][] dp = new int[n + 1][W + 1];
        for (int i = 1; i <= n; i++) {
            for (int w = 0; w <= W; w++) {
                dp[i][w] = dp[i - 1][w];
                if (weight[i - 1] <= w) {
                    dp[i][w] = Math.max(dp[i][w], value[i - 1] + dp[i - 1][w - weight[i - 1]]);
                }
            }
        }
        System.out.println("Max knapsack value (tabulation): " + dp[n][W]);
    }
}
