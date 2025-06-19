package BinarySearch;

public class RotatedArrayMin {
    public static void findMin() {
        int[] nums = {6, 7, 8, 1, 2, 3, 4, 5};
        int min = Integer.MAX_VALUE;
        int low = 0;
        int high = nums.length - 1;
        int mid;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (nums[low] <= nums[high]) {
                System.out.println("Minimum element in array : " + nums[low]);
            }
            if (nums[low] <= nums[mid]) {
                min = Math.min(min, nums[low]);
                low = mid + 1;
            } else {
                min = Math.min(min, nums[mid]);
                high = mid - 1;
            }
        }
        System.out.println("Minimum element in array : " + min);
    }
}
