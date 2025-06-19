package DivideAndConquer;

public class MergeSort {
    public static void mergeSort(int[] array, int low, int high) {
        if (low >= high) {
            return;
        }
        int mid = low + (high - low) / 2;
        mergeSort(array, low, mid);
        mergeSort(array, mid + 1, high);
        mergeArrays(array, low, mid, high);
    }

    public static void mergeArrays(int[] array, int low, int mid, int high) {
        int[] temp = new int[high - low + 1];
        int i = low;
        int j = mid + 1;
        int k = 0;
        while (i <= mid && j <= high) {
            if (array[i] < array[j]) {
                temp[k++] = array[i++];
            } else {
                temp[k++] = array[j++];
            }
        }
        while (i <= mid) {
            temp[k++] = array[i++];
        }
        while (j <= high) {
            temp[k++] = array[j++];
        }
        for (int index = 0, idx = low; index < temp.length; index++) {
            array[idx++] = temp[index];
        }
    }


    public static void mergeSortStringArray(String[] array, int low, int high) {
        if (low >= high) {
            return;
        }
        int mid = low + (high - low) / 2;
        mergeSortStringArray(array, low, mid);
        mergeSortStringArray(array, mid + 1, high);
        mergeStrings(array, low, mid, high);
    }

    public static void mergeStrings(String[] array, int low, int mid, int high) {
        String[] temp = new String[high - low + 1];
        int left = low;
        int right = mid + 1;
        int k = 0;
        while (left <= mid && right <= high) {
            if ((array[left].compareTo(array[right])) < 0) {
                temp[k++] = array[left++];
            } else {
                temp[k++] = array[right++];
            }
        }
        while (left <= mid) {
            temp[k++] = array[left++];
        }
        while (right <= high) {
            temp[k++] = array[right++];
        }
        for (int i = 0, index = low; i < temp.length; i++) {
            array[index++] = temp[i];
        }
    }

    public static void main(String[] args) {
//        int[] array = {1, 2, 4, 2, 5, 7, 3};
//        System.out.println("Original array : ");
//        ArraysUtils.printArray(array);
//        mergeSort(array, 0, array.length - 1);
//        System.out.println("Sorted array : ");
//        ArraysUtils.printArray(array);
        String[] array = {"sun", "earth", "mars", "mercury"};
        mergeSortStringArray(array, 0, array.length - 1);
        System.out.println("Sorted String Array : ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

    }
}
