package BinarySearch;

public class SearchInsertPosition {
    public static int searchInsertPosition(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int ans = high + 1;
        int mid;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (nums[mid] >= target) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }
}
