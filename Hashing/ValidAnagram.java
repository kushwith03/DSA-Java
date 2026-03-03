package Hashing;

import java.util.HashMap;

public class ValidAnagram {
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        for (int i = 0; i < t.length(); i++) {
            if (map.containsKey(t.charAt(i))) {
                int freq = map.get(t.charAt(i));
                if (freq == 0) {
                    return false;
                }
                map.put(t.charAt(i), freq - 1);
            } else {
                return false;
            }
        }
        return true;
    }
}
