package BinarySearch;

public class SingleElement {
    public static void singleNonDuplicate() {
        int[] nums = {1, 1, 2, 2, 3, 3, 4, 5, 5, 6, 6};
        if (nums.length == 1) {
            System.out.println("Single element is " + nums[0]);
            return;

        } else if (nums[0] != nums[1]) {
            System.out.println("Single element is " + nums[0]);
            return;
        } else if (nums[nums.length - 1] != nums[nums.length - 2]) {
            System.out.println("Single element is " + nums[nums.length - 1]);
            return;
        }
        int low = 1;
        int high = nums.length - 2;
        int mid;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (nums[mid - 1] != nums[mid] && nums[mid] != nums[mid + 1]) {
                System.out.println("Single element is " + nums[mid]);
                return;
            } else if (mid % 2 == 0) {
                if (nums[mid] == nums[mid + 1]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            } else {
                if (nums[mid] == nums[mid - 1]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
    }
}
