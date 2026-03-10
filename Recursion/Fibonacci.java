package Recursion;

public class Fibonacci {
    public static int find(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return find(n - 1) + find(n - 2);
    }

    public static int dp(int[] dp, int n) {
        if (n < 2) {
            return n;
        }
        if (dp[n] != 0) {
            return dp[n];
        }
        dp[n] = dp(dp, n - 1) + dp(dp, n - 2);
        return dp[n];
    }

    public static int optimised(int n) {
        if (n < 2) {
            return n;
        }
        int last = 0;
        int secondLast = 1;
        int curr = 0;
        for (int i = 2; i <= n; i++) {
            curr = last + secondLast;
            last = secondLast;
            secondLast = curr;
        }
        return curr;
    }
}
