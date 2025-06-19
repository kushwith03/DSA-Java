package BinarySearch;

public class SearchInRoated {
    public static void search() {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        int low = 0;
        int high = nums.length - 1;
        int mid;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                System.out.println("Target found at index : " + mid);
                return;
            }
            if (nums[low] <= nums[mid]) {
                if (nums[low] <= target && target < nums[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                if (nums[mid] < target && target <= nums[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        System.out.println("Target not found");
    }

}
