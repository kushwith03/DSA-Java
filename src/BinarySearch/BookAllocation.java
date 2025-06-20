package BinarySearch;

public class BookAllocation {
    public static void findPages() {
        int[] nums = {7, 2, 5, 10, 8};
        int k = 2;
        int low = 0;
        int high = 0;
        for (int i = 0; i < nums.length; i++) {
            low = Math.max(low, nums[i]);
            high += nums[i];
        }
        int mid;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (countStudents(nums, k, mid) > k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        System.out.println("Each students is given " + low + " pages");
    }

    public static int countStudents(int[] nums, int k, int mid) {
        int cur = 0;
        int count = 1;
        for (int i = 0; i < nums.length; i++) {
            cur += nums[i];
            if (cur > mid) {
                cur = nums[i];
                count++;
                if (count > k) {
                    return count;
                }
            }
        }
        return count;
    }
}
