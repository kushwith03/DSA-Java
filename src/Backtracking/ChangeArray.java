package Backtracking;

import Arrays.ArraysUtils;

public class ChangeArray {
    public static void updateAndBacktrack(int[] array, int i) {
        if (i == array.length) {
            System.out.println("After recursion array values : ");
            ArraysUtils.printArray(array);
            return;
        }
        array[i] = i + 1;
        updateAndBacktrack(array, i + 1);
        array[i] = array.length - i;
    }

    public static void main(String[] args) {
        int[] array = new int[5];
        System.out.println("Initial array values : ");
        ArraysUtils.printArray(array);
        updateAndBacktrack(array, 0);
        System.out.println("After backtracking array values : ");
        ArraysUtils.printArray(array);
    }
}
