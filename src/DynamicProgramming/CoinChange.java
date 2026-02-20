package DynamicProgramming;

import java.util.Arrays;

// LeetCode #322 - Coin Change
// Given an array of coin denominations and a total amount,
// return the fewest number of coins needed to make up that amount.
// Return -1 if the amount cannot be made up.
public class CoinChange {
    public static void recursion() {
        int[] coins = {1, 5, 6, 9};
        int amount = 11;
        int result = minCoins(coins, amount);
        System.out.println("Min coins (recursion): " + (result == Integer.MAX_VALUE ? -1 : result));
    }

    private static int minCoins(int[] coins, int amount) {
        if (amount == 0) return 0;
        if (amount < 0) return Integer.MAX_VALUE;
        int min = Integer.MAX_VALUE;
        for (int coin : coins) {
            int sub = minCoins(coins, amount - coin);
            if (sub != Integer.MAX_VALUE) {
                min = Math.min(min, sub + 1);
            }
        }
        return min;
    }

    public static void memoization() {
        int[] coins = {1, 5, 6, 9};
        int amount = 11;
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, -1);
        int result = minCoinsMemo(coins, amount, dp);
        System.out.println("Min coins (memoization): " + (result == Integer.MAX_VALUE ? -1 : result));
    }

    private static int minCoinsMemo(int[] coins, int amount, int[] dp) {
        if (amount == 0) return 0;
        if (amount < 0) return Integer.MAX_VALUE;
        if (dp[amount] != -1) return dp[amount];
        int min = Integer.MAX_VALUE;
        for (int coin : coins) {
            int sub = minCoinsMemo(coins, amount - coin, dp);
            if (sub != Integer.MAX_VALUE) {
                min = Math.min(min, sub + 1);
            }
        }
        dp[amount] = min;
        return dp[amount];
    }

    public static void tabulation() {
        int[] coins = {1, 5, 6, 9};
        int amount = 11;
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1);
        dp[0] = 0;
        for (int i = 1; i <= amount; i++) {
            for (int coin : coins) {
                if (coin <= i) {
                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
                }
            }
        }
        int result = dp[amount] > amount ? -1 : dp[amount];
        System.out.println("Min coins (tabulation): " + result);
    }
}
