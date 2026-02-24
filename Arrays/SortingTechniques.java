package Arrays;

public class SortingTechniques {
    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    ArraysUtils.swap(array, j, j + 1);
                }
            }
        }
        ArraysUtils.printArray(array);
    }

    public static void selectionSort(int[] array) {
        int min;
        for (int i = 0; i < array.length - 1; i++) {
            min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            ArraysUtils.swap(array, i, min);
        }
        ArraysUtils.printArray(array);
    }

    public static void insertionSort(int[] array) {
        int temp;
        int j;
        for (int i = 1; i < array.length; i++) {
            temp = array[i];
            j = i;
            while (j > 0 && array[j - 1] > temp) {
                array[j] = array[j - 1];
                j--;
            }
            array[j] = temp;
        }
        ArraysUtils.printArray(array);
    }

    public static void countingSort(int[] array) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            max = Math.max(max, array[i]);
            min = Math.min(min, array[i]);
        }
        int[] count = new int[max - min + 1];
        for (int i = 0; i < array.length; i++) {
            count[array[i] - min]++;
        }
        int k = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                array[k++] = i + min;
                count[i]--;
            }
        }
        ArraysUtils.printArray(array);
    }

    public static void mergeSort(int[] array, int low, int high) {
        if (low >= high) {
            return;
        }
        int mid = low + (high - low) / 2;
        mergeSort(array, low, mid);
        mergeSort(array, mid + 1, high);
        merge(array, low, mid, high);
    }

    public static void merge(int[] array, int low, int mid, int high) {
        int[] temp = new int[high - low + 1];
        int left = low;
        int right = mid + 1;
        int k = 0;
        while (left <= mid && right <= high) {
            if (array[left] < array[right]) {
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

    public static void quickSort(int[] array, int low, int high) {
        if (low >= high) {
            return;
        }
        int pivot = partition(array, low, high);
        quickSort(array, low, pivot - 1);
        quickSort(array, pivot + 1, high);

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
