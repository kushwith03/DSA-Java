package BinarySearch;

public class SearchIn2d_II {
    public static void searchMatrix() {
        int[][] matrix = {{1, 4, 7, 11, 15}, {2, 5, 8, 12, 19}, {3, 6, 9, 16, 22}, {10, 13, 14, 17, 24}, {18, 21, 23, 26, 30}};
        int target = 5;
        int row = matrix.length - 1;
        int col = 0;
        while (row >= 0 && col < matrix[0].length) {
            if (matrix[row][col] == target) {
                System.out.println("Target found at index : [" + row + "][" + col + "]");
                return;
            } else if (matrix[row][col] < target) {
                col++;
            } else {
                row--;
            }
        }
        System.out.println("Target not found ");

    }
}
