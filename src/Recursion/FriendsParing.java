package Recursion;

public class FriendsParing {
    public static int find(int n) {
        if (n < 3) {
            return n;
        }
        return find(n - 1) + (n - 1) * find(n - 2);

    }

    public static int optimised(int[] dp, int n) {
        if (n < 3) {
            return n;
        }
        if (dp[n] != 0) {
            return dp[n];
        }
        dp[n] = optimised(dp, n - 1) + (n - 1) * optimised(dp, n - 2);
        return dp[n];

    }

    public static void main(String[] args) {
//      Given n friends, each one can remain single or can be paired up with some other
//      friend. Each friend can be paired only once. Find out the total number of ways in
//      which friends can remain single or can be paired up.
        int n = 3;
        int[] dp = new int[n + 1];
        System.out.println(optimised(dp, n));

    }
}
