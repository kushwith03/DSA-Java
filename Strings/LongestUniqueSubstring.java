package Strings;

public class LongestUniqueSubstring {
    public static int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) {
            return 0;
        }
        int left = 0;
        int right = 0;
        int[] map = new int[256];
        int maxLen = 0;
        while (right < s.length()) {
            char curr = s.charAt(right);
            while (left < right && map[curr] == 1) {
                map[s.charAt(left)]--;
                left++;
            }
            map[curr]++;
            maxLen = Math.max(maxLen, right - left + 1);
            right++;
        }
        return maxLen;
    }
}
