package Arrays;

import java.util.ArrayList;

public class SpiralOrder {
    public static void print() {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println("Original Matrix : ");
        ArraysUtils.print2DArray(matrix);
        ArrayList<Integer> ans = new ArrayList<>();
        int srow = 0;
        int scol = 0;
        int erow = matrix.length - 1;
        int ecol = matrix[0].length - 1;
        while (srow <= erow && scol <= ecol) {
            for (int i = scol; i <= ecol; i++) {
                ans.add(matrix[srow][i]);
            }
            srow++;
            for (int j = srow; j <= erow; j++) {
                ans.add(matrix[j][ecol]);
            }
            ecol--;
            if (srow <= erow) {
                for (int i = ecol; i >= scol; i--) {
                    ans.add(matrix[erow][i]);
                }
                erow--;
            }
            if (scol <= ecol) {
                for (int i = erow; i >= srow; i--) {
                    ans.add(matrix[i][scol]);
                }
                scol++;
            }
        }
        System.out.println("Spiral order : ");
        System.out.println(ans);
    }
}
