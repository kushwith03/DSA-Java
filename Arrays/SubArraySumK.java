package Arrays;

import java.util.HashMap;

public class SubArraySumK {
    public static void bruteForce() {
        int[] nums = {1, 2, 3, -3, 1, 1, 1, 4, 2, -3};
        int k = 3;
        int count = 0;
        int cur;
        for (int start = 0; start < nums.length; start++) {
            for (int end = start; end < nums.length; end++) {
                cur = 0;
                for (int i = start; i <= end; i++) {
                    cur += nums[i];
                }
                if (cur == k) {
                    count++;
                }
            }
        }
        System.out.println("Number of subarrays with sum " + k + " : " + count);
    }

    public static void better() {
        int[] nums = {1, 2, 3, -3, 1, 1, 1, 4, 2, -3};
        int k = 3;
        int count = 0;
        int cur;
        for (int start = 0; start < nums.length; start++) {
            cur = 0;
            for (int end = start; end < nums.length; end++) {
                cur += nums[end];
                if (cur == k) {
                    count++;
                }
            }
        }
        System.out.println("Number of subarrays with sum " + k + " : " + count);
    }

    public static void optimal() {
        int[] nums = {1, 2, 3, -3, 1, 1, 1, 4, 2, -3};
        int k = 3;
        int count = 0;
        int presum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        for (int i = 0; i < nums.length; i++) {
            presum += nums[i];
            if (map.containsKey(presum - k)) {
                count += map.get(presum - k);
            }
            map.put(presum, map.getOrDefault(presum, 0) + 1);
        }
        System.out.println("Number of subarrays with sum " + k + " : " + count);
    }
}
