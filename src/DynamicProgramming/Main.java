package DynamicProgramming;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Climbing Stairs ===");
        ClimbingStairs.recursion();
        ClimbingStairs.memoization();
        ClimbingStairs.tabulation();
        ClimbingStairs.optimal();

        System.out.println("\n=== House Robber ===");
        HouseRobber.recursion();
        HouseRobber.memoization();
        HouseRobber.tabulation();
        HouseRobber.optimal();

        System.out.println("\n=== Coin Change ===");
        CoinChange.recursion();
        CoinChange.memoization();
        CoinChange.tabulation();

        System.out.println("\n=== Longest Common Subsequence ===");
        LongestCommonSubsequence.recursion();
        LongestCommonSubsequence.memoization();
        LongestCommonSubsequence.tabulation();

        System.out.println("\n=== 0/1 Knapsack ===");
        Knapsack01.recursion();
        Knapsack01.memoization();
        Knapsack01.tabulation();
    }
}
