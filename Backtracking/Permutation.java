package Backtracking;

public class Permutation {
    public static void findPermutation(String str, String ans) {
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char cur = str.charAt(i);
            String newString = str.substring(0, i) + str.substring(i + 1);
            findPermutation(newString, ans + cur);
        }
    }

    public static void main(String[] args) {
        findPermutation("abc", "");
    }
}
