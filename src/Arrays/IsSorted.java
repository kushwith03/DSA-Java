package Arrays;

public class IsSorted {
    public static void check() {
        int[] array = {1, 2, 3, 4, 5};
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                System.out.println("Array is not sorted ");
                return;
            }
        }
        System.out.println("Array is sorted");
    }
}