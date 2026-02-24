package Backtracking;

public class ValidSudoku {
    public static boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                char digit = board[i][j];
                if (board[i][j] != '.') {
                    board[i][j] = '.';
                    if (!isSafe(board, i, j, digit)) {
                        return false;
                    }
                    board[i][j] = digit;
                }
            }
        }
        return true;
    }

    public static boolean isSafe(char[][] board, int row, int col, char digit) {
        for (int j = 0; j < board[0].length; j++) {
            if (board[row][j] == digit) {
                return false;
            }
        }
        for (int i = 0; i < board.length; i++) {
            if (board[i][col] == digit) {
                return false;
            }
        }
        int sRow = (row / 3) * 3;
        int sCol = (col / 3) * 3;
        for (int i = sRow; i < sRow + 3; i++) {
            for (int j = sCol; j < sCol + 3; j++) {
                if (board[i][j] == digit) {
                    return false;
                }
            }
        }
        return true;
    }
}
