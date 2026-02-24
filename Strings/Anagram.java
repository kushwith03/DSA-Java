package Strings;

public class Anagram {
    public static void check() {
        String str1 = "race";
        String str2 = "care";
        int[] map = new int[26];
        if (str1.length() != str2.length()) {
            System.out.println("Not anagram ");
            return;
        }
        for (int i = 0; i < str1.length(); i++) {
            map[str1.charAt(i) - 'a']++;
            map[str2.charAt(i) - 'a']--;
        }
        for (int i = 0; i < 26; i++) {
            if (map[i] != 0) {
                System.out.println("Not anagram ");
                return;
            }
        }
        System.out.println("Is anagram ");

    }
}
