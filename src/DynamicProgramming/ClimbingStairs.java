package DynamicProgramming;

// LeetCode #70 - Climbing Stairs
// You are climbing a staircase. It takes n steps to reach the top.
// Each time you can either climb 1 or 2 steps.
// In how many distinct ways can you climb to the top?
public class ClimbingStairs {
    public static void recursion() {
        int n = 5;
        System.out.println("Ways to climb " + n + " stairs (recursion): " + countWays(n));
    }

    private static int countWays(int n) {
        if (n == 0 || n == 1) return 1;
        return countWays(n - 1) + countWays(n - 2);
    }

    public static void memoization() {
        int n = 5;
        int[] dp = new int[n + 1];
        System.out.println("Ways to climb " + n + " stairs (memoization): " + countWaysMemo(n, dp));
    }

    private static int countWaysMemo(int n, int[] dp) {
        if (n == 0 || n == 1) return 1;
        if (dp[n] != 0) return dp[n];
        dp[n] = countWaysMemo(n - 1, dp) + countWaysMemo(n - 2, dp);
        return dp[n];
    }

    public static void tabulation() {
        int n = 5;
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        System.out.println("Ways to climb " + n + " stairs (tabulation): " + dp[n]);
    }

    public static void optimal() {
        int n = 5;
        if (n <= 1) {
            System.out.println("Ways to climb " + n + " stairs (optimal): 1");
            return;
        }
        int prev2 = 1, prev1 = 1;
        for (int i = 2; i <= n; i++) {
            int cur = prev1 + prev2;
            prev2 = prev1;
            prev1 = cur;
        }
        System.out.println("Ways to climb " + n + " stairs (optimal): " + prev1);
    }
}
