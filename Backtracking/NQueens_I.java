package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class NQueens_I {
    public static List<List<String>> nQueens(List<List<String>> list, char[][] board, int row) {
        if (row == board.length) {
            List<String> rowsList = new ArrayList<>();
            for (int i = 0; i < board.length; i++) {
                rowsList.add(new String(board[i]));
            }
            list.add(rowsList);
            return list;
        }
        for (int i = 0; i < board.length; i++) {
            if (isSafe(board, row, i)) {
                board[row][i] = 'Q';
                nQueens(list, board, row + 1);
                board[row][i] = '.';
            }
        }
        return list;

    }

    public static boolean isSafe(char[][] board, int row, int col) {
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        for (int i = row - 1, j = col + 1; i >= 0 && j < board[0].length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int n = 4;
        List<List<String>> list = new ArrayList<>();
        char[][] board = new char[n][n];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                board[i][j] = '.';
            }
        }
        System.out.println(nQueens(list, board, 0));
    }
}
