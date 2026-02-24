package BinarySearch;

public class PeakElement {
    public static void findPeakElement() {
        int[] nums = {1, 2, 1, 3, 5, 6, 4};
        if (nums.length == 1) {
            System.out.println("Peak element : " + nums[0]);
            return;
        } else if (nums[0] > nums[1]) {
            System.out.println("Peak element : " + nums[0]);
            return;
        } else if (nums[nums.length - 1] > nums[nums.length - 2]) {
            System.out.println("Peak element : " + (nums.length - 1));
            return;
        }
        int low = 1;
        int high = nums.length - 2;
        int mid;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (nums[mid - 1] < nums[mid] && nums[mid] > nums[mid + 1]) {
                System.out.println("Peak element : " + nums[mid]);
                return;
            }
            if (nums[mid - 1] < nums[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        System.out.println("Peak element not found ");

    }
}
