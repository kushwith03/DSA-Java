package Backtracking;

public class NQueens_II {
    public static int nQueens(int[][] board, int row) {
        if (row == board.length) {
            return 1;
        }
        int count = 0;
        for (int i = 0; i < board.length; i++) {
            if (isSafe(board, row, i)) {
                board[row][i] = 1;
                count += nQueens(board, row + 1);
                board[row][i] = 0;
            }
        }
        return count;
    }

    public static boolean isSafe(int[][] board, int row, int col) {
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 1) {
                return false;
            }
        }
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 1) {
                return false;
            }
        }
        return true;
    }

    public static void totalNQueens(int n) {
        int[][] board = new int[n][n];
        System.out.println("Total ways : " + nQueens(board, 0));
    }
}
