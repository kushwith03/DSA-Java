package Arrays;

public class BinarySearch {
    public static void search() {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        int key = 7;
        int low = 0;
        int high = array.length - 1;
        int mid;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (array[mid] == key) {
                System.out.println("Found key at index " + mid);
                return;
            } else if (key < array[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        System.out.println("Key not found");
    }
}
