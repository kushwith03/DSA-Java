package Stack;

import java.util.Stack;

public class ReverseString {
    public static void reverse(String str) {
        Stack<Character> stack = new Stack<>();
        StringBuilder reversed = new StringBuilder("");
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }
        System.out.println(reversed);

    }
}
