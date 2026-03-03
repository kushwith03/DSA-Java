package Hashing;

import java.util.HashSet;

public class IntersectionOfTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        if (nums1.length == 0 || nums2.length == 0) {
            return new int[0];
        }
        HashSet<Integer> set1 = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            set1.add(nums1[i]);
        }
        HashSet<Integer> ans = new HashSet<>();
        for (int i = 0; i < nums2.length; i++) {
            if (set1.contains(nums2[i])) {
                ans.add(nums2[i]);
            }
        }
        int[] ansArray = new int[ans.size()];
        int i = 0;
        for (Integer ele : ans) {
            ansArray[i++] = ele;
        }
        return ansArray;
    }
}
