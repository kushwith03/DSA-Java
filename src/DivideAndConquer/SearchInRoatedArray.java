package DivideAndConquer;

public class SearchInRoatedArray {
    public static int search(int[] array, int low, int high, int target) {
        if (low > high) {
            return -1;
        }
        int mid = low + (high - low) / 2;
        if (array[mid] == target) {
            return mid;
        } else if (array[low] <= array[mid]) {
            if (array[low] <= target && target < array[mid]) {
                return search(array, low, mid - 1, target);
            } else {
                return search(array, mid + 1, high, target);
            }
        } else {
            if (array[mid] <= target && target < array[high]) {
                return search(array, mid + 1, high, target);
            } else {
                return search(array, low, mid - 1, target);
            }
        }
    }

    public static int iterative(int[] array, int low, int high, int target) {
        int mid;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (array[mid] == target) {
                return mid;
            }
            if (array[low] <= array[mid]) {
                if (array[low] <= target && target < array[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                if (array[mid] < target && target <= array[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {4, 5, 6, 7, 0, 1, 2, 3};
        System.out.println(iterative(array, 0, array.length - 1, 0));
    }
}
