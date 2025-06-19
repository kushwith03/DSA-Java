package Recursion;

import Arrays.ArraysUtils;

public class InsertionSort {
    public static void insertionSortReccursive(int[] array, int i) {
        if (i == array.length) {
            return;
        }
        int temp = array[i];
        int j = i - 1;
        int pos = correctPosition(array, temp, i - 1);
        array[pos] = temp;
        insertionSortReccursive(array, i + 1);
    }

    public static int correctPosition(int[] array, int temp, int j) {
        if (j < 0 || temp > array[j]) {
            return j + 1;
        }
        array[j + 1] = array[j];
        return correctPosition(array, temp, j - 1);

    }

    public static void main(String[] args) {
        int[] array = {1, 4, 2, 5, 3, 8, 6};
        insertionSortReccursive(array, 1);
        ArraysUtils.printArray(array);
    }
}
