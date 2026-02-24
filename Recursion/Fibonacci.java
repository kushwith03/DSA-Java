package Recursion;

public class Fibonacci {
    public static int find(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return find(n - 1) + find(n - 2);
    }

    public static int optimised(int[] dp, int n) {
        if (n < 2) {
            return n;
        }
        if (dp[n] != 0) {
            return dp[n];
        }
        dp[n] = optimised(dp, n - 1) + optimised(dp, n - 2);
        return dp[n];
    }

    public static void main(String[] args) {
        int n = 5;
        int[] dp = new int[n + 1];
        System.out.println(optimised(dp, n));
    }
}
