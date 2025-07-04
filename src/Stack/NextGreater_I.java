package Stack;

import Arrays.ArraysUtils;

import java.util.ArrayList;
import java.util.Stack;

public class NextGreater_I {
    public static void find() {
        int[] array = {4, 12, 5, 3, 1, 2, 5, 3, 1, 2, 4, 6};
        ArraysUtils.printArray(array);
        System.out.println();
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = array.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() <= array[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                list.add(0, -1);
            } else {
                list.add(0, stack.peek());
            }
            stack.push(array[i]);
        }
        System.out.println(list);
    }
}
