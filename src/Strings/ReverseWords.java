package Strings;

import java.util.Stack;

public class ReverseWords {
    public static void bruteForce() {
        String str = "My name is Khushwith";
        Stack<String> stack = new Stack<>();
        String temp = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                temp += str.charAt(i);
            } else {
                stack.push(temp);
                temp = "";
            }
        }
        if (temp.length() != 0) {
            stack.push(temp);
        }
        StringBuilder ans = new StringBuilder("");
        while (!stack.isEmpty()) {
            ans.append(stack.pop() + " ");
        }
        System.out.println("Original String :" + str);
        System.out.println("Reversed order : " + ans);
    }

    public static void optimal() {
        String str = "My name is Khushwith";
        StringBuilder ans = new StringBuilder();
        int end;
        for (int i = str.length() - 1; i >= 0; i--) {
            end = i;
            while (i >= 0 && str.charAt(i) != ' ') {
                i--;
            }
            if (ans.length() > 0) {
                ans.append(" ");
            }
            ans.append(str.substring(i + 1, end + 1));
        }
        System.out.println("Original String :" + str);
        System.out.println("Reversed order : " + ans);
    }
}
