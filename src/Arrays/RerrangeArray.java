package Arrays;

public class RerrangeArray {
    public static void rearrnge() {
        int[] nums = {3, 1, -2, -5, 2, -4};
        int pindex = 0;
        int nindex = 1;
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= 0) {
                ans[pindex] = nums[i];
                pindex += 2;
            } else {
                ans[nindex] = nums[i];
                nindex += 2;
            }
        }
        ArraysUtils.printArray(ans);
    }
}
