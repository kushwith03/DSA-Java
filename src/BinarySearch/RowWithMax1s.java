package BinarySearch;

public class RowWithMax1s {
    public static void find() {
        int[][] matrix = {{1, 1, 1}, {0, 0, 1}, {0, 0, 0}};
        int rowIndex = matrix[0].length;
        int index = -1;
        for (int i = 0; i < matrix.length; i++) {
            int count0s = rows(matrix[i]);
            if (count0s < rowIndex) {
                rowIndex = count0s;
                index = i;
            }
        }
        System.out.println("Row [" + index + "] is row with most number of 1's");
    }

    public static int rows(int[] row) {
        int low = 0;
        int high = row.length - 1;
        int mid;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (row[mid] == 1) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
}
