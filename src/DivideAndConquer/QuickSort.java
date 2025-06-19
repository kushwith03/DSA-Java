package DivideAndConquer;

import Arrays.ArraysUtils;

public class QuickSort {
    public static void quickSort(int[] array, int low, int high) {
        if (low >= high) {
            return;
        }
        int pivotIndex = partition(array, low, high);
        quickSort(array, low, pivotIndex - 1);
        quickSort(array, pivotIndex + 1, high);
    }

    public static int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (array[j] < pivot) {
                i++;
                ArraysUtils.swap(array, i, j);
            }
        }
        ArraysUtils.swap(array, i + 1, high);
        return i + 1;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 4, 2, 5, 7, 3};
        System.out.println("Original array : ");
        ArraysUtils.printArray(array);
        quickSort(array, 0, array.length - 1);
        System.out.println("Sorted array : ");
        ArraysUtils.printArray(array);

    }
}
