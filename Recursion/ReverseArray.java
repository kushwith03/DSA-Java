package Recursion;

import Arrays.ArraysUtils;

public class ReverseArray {
    public static void reverse(int[] array, int low, int high) {
        if (low >= high) {
            ArraysUtils.printArray(array);
            return;
        }
        ArraysUtils.swap(array, low, high);
        reverse(array, low + 1, high - 1);
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        reverse(array, 0, array.length - 1);
    }
}
