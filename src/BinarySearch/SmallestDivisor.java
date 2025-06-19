package BinarySearch;

public class SmallestDivisor {
    public static void smallestDivisor() {
        int[] nums = {1, 2, 5, 9};
        int threshold = 6;
        int max = 0;
        for (int num : nums) {
            max = Math.max(num, max);
        }
        int low = 1;
        int high = max;
        int mid;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (sum(nums, mid) > threshold) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        System.out.println("Smallest divisor : " + low);

    }

    public static int sum(int[] nums, int val) {
        int add = 0;
        for (int num : nums) {
            add += Math.ceil((double) num / val);
        }
        return add;
    }
}
