package Recursion;


public class FindOccurance {
    public static int firstOccurrence(int[] array, int target, int i) {
        if (i == array.length) {
            return -1;
        }
        if (array[i] == target) {
            return i;
        }
        return firstOccurrence(array, target, i + 1);
    }

    public static int lastOccurrence(int[] array, int target, int i) {
        if (i == -1) {
            return -1;
        }

        if (array[i] == target) {
            return i;
        }
        return lastOccurrence(array, target, i - 1);
    }

    public static void main(String[] args) {
        int[] array = {2, 5, 1, 3, 5, 7};
        System.out.println(lastOccurrence(array, 5, array.length - 1));
    }
}
