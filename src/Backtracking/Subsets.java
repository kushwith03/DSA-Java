package Backtracking;

public class Subsets {
    public static void findSubsets(String str, String ans, int i) {
        if (i == str.length()) {
            if (ans.length() == 0) {
                System.out.println("{empty}");
                return;
            }
            System.out.println(ans);
            return;
        }
        findSubsets(str, ans + str.charAt(i), i + 1);
        findSubsets(str, ans, i + 1);

    }

    public static void main(String[] args) {
        findSubsets("abc", "", 0);
    }
}
