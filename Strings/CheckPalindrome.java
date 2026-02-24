package Strings;

public class CheckPalindrome {
    public static void check() {
        String str = "racecar";
        int low = 0;
        int high = str.length() - 1;
        while (low < high) {
            if (str.charAt(low) != str.charAt(high)) {
                System.out.println("Not a palindrome");
                return;
            }
            low++;
            high--;
        }
        System.out.println("Is palindrome");
    }
}
