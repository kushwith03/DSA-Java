package Hashing;

import java.util.HashSet;

public class LongestConsecutiveSequence {
    public int find(int[] array) {
        HashSet<Integer> set = new HashSet<>();
        int maxLen = 0;
        for (int i = 0; i < array.length; i++) {
            set.add(array[i]);
        }
        for (int num : set) {
            if (!set.contains(num - 1)) {
                int cur = num;
                int len = 1;
                while (set.contains(cur + 1)) {
                    cur++;
                    len++;
                }
                maxLen = Math.max(maxLen, len);
            }
        }
        return maxLen;
    }
}
