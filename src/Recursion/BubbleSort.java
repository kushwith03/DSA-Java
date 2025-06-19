package Recursion;

import Arrays.ArraysUtils;

public class BubbleSort {
    public static void bubbleSortRecursive(int[] array, int i) {
        if (i == array.length - 1) {
            return;
        }
        bubbleUpLargest(array, i, 0);
        bubbleSortRecursive(array, i + 1);

    }

    public static void bubbleUpLargest(int[] array, int i, int j) {
        if (j == array.length - 1 - i) {
            return;
        }
        if (array[j] > array[j + 1]) {
            ArraysUtils.swap(array, j, j + 1);
        }
        bubbleUpLargest(array, i, j + 1);
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 4, 3, 5, 6};
        bubbleSortRecursive(array, 0);
        ArraysUtils.printArray(array);
    }
}
