package Stack;

import java.util.Stack;

public class PushAtBottom {
    public static void pushAtbottom(Stack<Integer> stack, int val) {
        if (stack.isEmpty()) {
            stack.push(val);
            return;
        }
        int top = stack.pop();
        pushAtbottom(stack, val);
        stack.push(top);
    }
}
