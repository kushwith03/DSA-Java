package BinarySearch;

public class FirstAndLastPosition {
    public static int[] searchRange(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int mid;
        int[] ans = {-1, -1};
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                ans[0] = mid;
                high = mid - 1;
            } else if (nums[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        low = 0;
        high = nums.length - 1;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                ans[1] = mid;
                low = mid + 1;
            } else if (nums[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

}
