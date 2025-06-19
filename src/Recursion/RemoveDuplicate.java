package Recursion;

public class RemoveDuplicate {
    public static StringBuilder remove(String str, StringBuilder ans, int i, int[] map) {
        if (i == str.length()) {
            return ans;
        }
        if (map[str.charAt(i) - 'a'] == 0) {
            map[str.charAt(i) - 'a'] = 1;
            ans.append(str.charAt(i));
        }
        return remove(str, ans, i + 1, map);

    }

    public static StringBuilder recursiveRemove(String str, StringBuilder ans, int i) {
        if (i == str.length()) {
            return ans;
        }
        if (check(str, i, 0)) {
            ans.append(str.charAt(i));
        }
        return recursiveRemove(str, ans, i + 1);

    }

    public static boolean check(String str, int i, int j) {
        if (i == j) {
            return true;
        }
        if (str.charAt(j) == str.charAt(i)) {
            return false;
        }
        return check(str, i, j + 1);
    }

    public static void main(String[] args) {
        String str = "apnacollege";
        StringBuilder ans = new StringBuilder("");
        System.out.println(recursiveRemove(str, ans, 0));

    }
}
