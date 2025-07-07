package Backtracking;

import Arrays.ArraysUtils;

public class Sudoku {
    public static boolean solve(int[][] sudoku, int row, int col) {
        if (row == 9) {
            System.out.println("Sudoku solution : ");
            ArraysUtils.print2DArray(sudoku);
            return true;
        }
        int nextRow = row;
        int nextCol = col + 1;
        if (nextCol == 9) {
            nextRow = row + 1;
            nextCol = 0;
        }
        if (sudoku[row][col] != 0) {
            return solve(sudoku, nextRow, nextCol);
        }
        for (int digit = 1; digit <= 9; digit++) {
            if (isSafe(sudoku, row, col, digit)) {
                sudoku[row][col] = digit;
                if (solve(sudoku, nextRow, nextCol)) {
                    return true;
                }
                sudoku[row][col] = 0;

            }
        }


        return false;
    }

    public static boolean isSafe(int[][] board, int row, int col, int digit) {
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

    public static void main(String[] args) {
        int[][] sudoku = {
                {0, 0, 8, 0, 0, 0, 0, 0, 0},
                {4, 9, 0, 1, 5, 7, 0, 0, 2},
                {0, 0, 3, 0, 0, 4, 1, 9, 0},
                {1, 8, 5, 0, 6, 0, 0, 2, 0},
                {0, 0, 0, 0, 2, 0, 0, 6, 0},
                {9, 6, 0, 4, 0, 5, 3, 0, 0},
                {0, 3, 0, 0, 7, 2, 0, 0, 4},
                {0, 4, 9, 0, 3, 0, 0, 5, 7},
                {8, 2, 7, 0, 0, 9, 0, 1, 3}
        };
        solve(sudoku, 0, 0);
    }
}
