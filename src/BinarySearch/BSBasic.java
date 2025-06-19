package BinarySearch;

public class BSBasic {
    public static void iterativeSearch() {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        int key = 6;
        int low = 0;
        int high = array.length - 1;
        int mid;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (array[mid] == key) {
                System.out.println("Found key at index : " + mid);
                return;
            } else if (array[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        System.out.println("Key not found");
    }

    public static void recursiveSearch(int[] array, int key, int low, int high) {
        if (low > high) {
            System.out.println("Key not found");
            return;
        }
        int mid = low + (high - low) / 2;
        if (array[mid] == key) {
            System.out.println("Found key at index : " + mid);
            return;
        } else if (array[mid] < key) {
            recursiveSearch(array, key, mid + 1, high);
        } else {
            recursiveSearch(array, key, low, mid - 1);
        }
    }

    public static int lowerBound(int[] array, int x) {
        int ans = array.length;
        int low = 0;
        int high = ans - 1;
        int mid;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (array[mid] >= x) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    public static int highBound(int[] array, int x) {
        int low = 0;
        int high = array.length - 1;
        int mid;
        int ans = high + 1;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (array[mid] > x) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }

        }
        return ans;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        int key = 6;

    }
}
