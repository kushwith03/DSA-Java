package Hashing;

public class MajorityElement {
    public static int majorityElement(int[] nums) {
        HashingUtils<Integer, Integer> map = new HashingUtils<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                int freq = map.get(nums[i]);
                if (freq + 1 > nums.length / 2) {
                    return nums[i];
                }
                map.put(nums[i], freq + 1);
            } else {
                map.put(nums[i], 1);
            }
        }
        return -1;
    }
}
