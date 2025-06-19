package BinarySearch;

public class SearchIn2D {
    public static void searchMatrix() {
        int[][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        int target = 3;
        int low = 0;
        int high = matrix.length * matrix[0].length - 1;
        int mid;
        int col;
        int row;
        while (low <= high) {
            mid = low + (high - low) / 2;
            row = mid / matrix[0].length;
            col = mid % matrix[0].length;
            if (matrix[row][col] == target) {
                System.out.println("Target found at index : [" + row + "][" + col + "]");
                return;
            } else if (matrix[row][col] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        System.out.println("Target not found");
    }
}
