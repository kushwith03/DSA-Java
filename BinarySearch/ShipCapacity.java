package BinarySearch;

public class ShipCapacity {
    public static int shipWithinDays() {
        int[] weights = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int days = 5;
        int low = weights[0];
        int high = 0;
        for (int w : weights) {
            high += w;
            low = Math.max(low, w);
        }
        int mid;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (countDays(weights, mid) <= days) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;

    }

    public static int countDays(int[] weights, int val) {
        int count = 1;
        int sum = 0;
        for (int w : weights) {
            if ((sum + w) > val) {
                count++;
                sum = 0;
            }
            sum += w;
        }
        return count;

    }
}
