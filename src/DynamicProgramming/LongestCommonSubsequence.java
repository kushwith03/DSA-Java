package DynamicProgramming;

// LeetCode #1143 - Longest Common Subsequence
// Given two strings, return the length of their longest common subsequence.
// A subsequence is a sequence derived from another by deleting some characters
// without changing the relative order of the remaining characters.
public class LongestCommonSubsequence {
    public static void recursion() {
        String s1 = "abcde";
        String s2 = "ace";
        System.out.println("LCS length (recursion): " + lcs(s1, s2, s1.length(), s2.length()));
    }

    private static int lcs(String s1, String s2, int m, int n) {
        if (m == 0 || n == 0) return 0;
        if (s1.charAt(m - 1) == s2.charAt(n - 1)) {
            return 1 + lcs(s1, s2, m - 1, n - 1);
        }
        return Math.max(lcs(s1, s2, m - 1, n), lcs(s1, s2, m, n - 1));
    }

    public static void memoization() {
        String s1 = "abcde";
        String s2 = "ace";
        int m = s1.length(), n = s2.length();
        int[][] dp = new int[m + 1][n + 1];
        for (int[] row : dp) java.util.Arrays.fill(row, -1);
        System.out.println("LCS length (memoization): " + lcsMemo(s1, s2, m, n, dp));
    }

    private static int lcsMemo(String s1, String s2, int m, int n, int[][] dp) {
        if (m == 0 || n == 0) return 0;
        if (dp[m][n] != -1) return dp[m][n];
        if (s1.charAt(m - 1) == s2.charAt(n - 1)) {
            dp[m][n] = 1 + lcsMemo(s1, s2, m - 1, n - 1, dp);
        } else {
            dp[m][n] = Math.max(lcsMemo(s1, s2, m - 1, n, dp), lcsMemo(s1, s2, m, n - 1, dp));
        }
        return dp[m][n];
    }

    public static void tabulation() {
        String s1 = "abcde";
        String s2 = "ace";
        int m = s1.length(), n = s2.length();
        int[][] dp = new int[m + 1][n + 1];
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        System.out.println("LCS length (tabulation): " + dp[m][n]);
    }
}
