package Arrays;

import java.util.HashMap;

public class MajorityElement {
    public static void bruteForce() {
        int[] nums = {1, 2, 3, 4, 2, 2, 2};
        int count;
        for (int i = 0; i < nums.length; i++) {
            count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                    if (count > nums.length / 2) {
                        System.out.println("Majority element : " + nums[i]);
                        return;
                    }
                }
            }
        }
        System.out.println("Majority element not found");
    }

    public static void better() {
        int[] nums = {1, 2, 3, 4, 2, 2, 2};
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            if (map.get(nums[i]) > nums.length / 2) {
                System.out.println("Majority element : " + nums[i]);
                return;
            }
        }
        System.out.println("Majority element not found");
    }

    public static void optimal() {
        //Moore's voting
        int[] nums = {1, 2, 3, 4, 2, 2, 2};
        int count = 0;
        int ele = -1;
        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {
                ele = nums[i];
                count = 1;
            } else if (nums[i] == ele) {
                count++;
            } else {
                count--;
            }
        }
        count = 0;
        for (int i : nums) {
            if (i == ele) {
                count++;
                if (count > nums.length / 2) {
                    System.out.println("Majority element : " + ele);
                    return;
                }
            }
        }
        System.out.println("Majority element not found");
    }
}
