package Backtracking;

public class GridWays {
    public static int uniquePaths(int m, int n) {
        return find(0, 0, m, n);
    }

    public static int find(int x, int y, int m, int n) {
        if (x == m - 1 && y == n - 1) {
            return 1;
        } else if (x == m || y == n) {
            return 0;
        }
        return find(x + 1, y, m, n) + find(x, y + 1, m, n);
    }
}
