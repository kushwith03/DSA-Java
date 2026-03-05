package Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AnagramsInString {
    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        if (p.length() > s.length()) return result;
        int[] pMap = new int[26];
        int[] window = new int[26];
        for (char c : p.toCharArray()) {
            pMap[c - 'a']++;
        }
        int left = 0;
        for (int right = 0; right < s.length(); right++) {
            window[s.charAt(right) - 'a']++;
            if (right - left + 1 > p.length()) {
                window[s.charAt(left) - 'a']--;
                left++;
            }
            if (right - left + 1 == p.length() && Arrays.equals(window, pMap)) {
                result.add(left);
            }
        }

        return result;
    }
}
