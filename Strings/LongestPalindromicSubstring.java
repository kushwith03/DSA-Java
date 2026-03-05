package Strings;

public class LongestPalindromicSubstring {
    public static String longestPalindrome(String s) {
        //brute force
        int maxLen = 0;
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                String subString = s.substring(i, j + 1);
                if (isPalindrome(subString)) {
                    if (subString.length() > maxLen) {
                        maxLen = subString.length();
                        ans = subString;
                    }

                }
            }
        }
        return ans;
    }

    public static boolean isPalindrome(String s) {
        if (s.length() == 0) {
            return true;
        }
        int low = 0;
        int high = s.length() - 1;
        while (low < high) {
            if (s.charAt(low) != s.charAt(high)) {
                return false;
            }
            low++;
            high--;
        }
        return true;
    }

    public static String optimal(String s) {
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            String odd = expand(s, i, i);
            String even = expand(s, i, i + 1);
            if (odd.length() > ans.length()) {
                ans = odd;
            }
            if (even.length() > ans.length()) {
                ans = even;
            }
        }
        return ans;
    }

    public static String expand(String s, int low, int high) {
        while (low >= 0 && high < s.length() && s.charAt(low) == s.charAt(high)) {
            low--;
            high++;
        }
        return s.substring(low + 1, high);
    }
}
