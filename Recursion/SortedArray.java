package Recursion;

public class SortedArray {
    public static boolean isSorted(int[] array, int i) {
        if (i == array.length - 1) {
            return true;
        }
        if (array[i] > array[i + 1]) {
            return false;
        }

        return isSorted(array, i + 1);
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 7, 6};
        System.out.println(isSorted(array, 0));
    }
}
