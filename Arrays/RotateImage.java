package Arrays;

public class RotateImage {
    public static void bruteForce() {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] ans = new int[matrix.length][matrix[0].length];
        System.out.println("Original matrix :");
        ArraysUtils.print2DArray(matrix);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                ans[j][matrix.length - 1 - i] = matrix[i][j];
            }
        }
        System.out.println("Rotated matrix :");
        ArraysUtils.print2DArray(ans);
    }

    public static void optimal() {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println("Original matrix :");
        ArraysUtils.print2DArray(matrix);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i + 1; j < matrix[0].length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            int start = 0;
            int end = matrix[0].length - 1;
            while (start < end) {
                int temp = matrix[i][start];
                matrix[i][start] = matrix[i][end];
                matrix[i][end] = temp;
                start++;
                end--;
            }
        }
        System.out.println("Rotated matrix :");
        ArraysUtils.print2DArray(matrix);

    }
}
