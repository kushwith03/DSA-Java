package Recursion;

import Arrays.ArraysUtils;

public class SelectionSort {
    public static void selectionSortRecursive(int[] array, int i) {
        if (i == array.length - 1) {
            return;
        }
        int min = minIndex(array, i, i);
        ArraysUtils.swap(array, i, min);
        selectionSortRecursive(array, i + 1);
    }

    public static int minIndex(int[] array, int j, int min) {
        if (j == array.length) {
            return min;
        }
        if (array[j] < array[min]) {
            min = j;
        }
        return minIndex(array, j + 1, min);
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 4, 3, 5, 6};
        selectionSortRecursive(array, 0);
        ArraysUtils.printArray(array);
    }
}
