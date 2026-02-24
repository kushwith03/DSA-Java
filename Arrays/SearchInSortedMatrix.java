package Arrays;

public class SearchInSortedMatrix {
    public static void bruteForce() {
        int[][] matrix = {{10, 20, 30, 40}, {15, 25, 35, 45}, {27, 29, 37, 48}, {32, 33, 39, 50}};
        int key = 33;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == key) {
                    System.out.println("Found Key ");
                    return;
                }
            }
        }
        System.out.println("Key not found");
    }

    public static void better() {
        int[][] matrix = {{10, 20, 30, 40}, {15, 25, 35, 45}, {27, 29, 37, 48}, {32, 33, 39, 50}};
        int key = 33;
        for (int i = 0; i < matrix.length; i++) {
            if (bs(matrix[i], key)) {
                System.out.println("Found Key ");
                return;
            }
        }
        System.out.println("Key not found ");
    }

    public static boolean bs(int[] row, int key) {
        int low = 0;
        int high = row.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (row[mid] == key) {
                return true;
            } else if (row[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return false;
    }

    public static void optimal() {
        int[][] matrix = {{10, 20, 30, 40}, {15, 25, 35, 45}, {27, 29, 37, 48}, {32, 33, 39, 50}};
        int key = 33;
        int i = matrix.length - 1;
        int j = 0;
        while (i >= 0 && j < matrix[0].length) {
            if (matrix[i][j] == key) {
                System.out.println("Found Key ");
                return;
            } else if (matrix[i][j] < key) {
                j++;
            } else {
                i--;
            }
        }
        System.out.println("Key not found");

    }
}
