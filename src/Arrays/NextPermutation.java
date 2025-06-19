package Arrays;

public class NextPermutation {
    public static void find() {
        int[] nums = {2, 1, 5, 4, 3, 0, 0};
        int index = -1;
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            for (int i = nums.length - 1; i > index; i--) {
                if (nums[i] > nums[index]) {
                    int temp = nums[index];
                    nums[index] = nums[i];
                    nums[i] = temp;
                    break;
                }
            }
        }
        ArraysUtils.reverse(nums, index + 1, nums.length - 1);
        ArraysUtils.printArray(nums);
    }
}
