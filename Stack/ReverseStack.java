package Stack;

import java.util.Stack;

public class ReverseStack {
    public static void reverse(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return;
        }
        int top = stack.pop();
        reverse(stack);
        pushAtBottom(stack, top);
    }

    public static void pushAtBottom(Stack<Integer> stack, int val) {
        if (stack.isEmpty()) {
            stack.push(val);
            return;
        }
        int top = stack.pop();
        pushAtBottom(stack, val);
        stack.push(top);
    }
}
