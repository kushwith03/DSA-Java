package Stack;

import java.util.ArrayList;

public class ArrayListStack {
    public static class MyStack {
        static ArrayList<Integer> list = new ArrayList<>();

        public static void push(int data) {
            list.add(data);
        }

        public static int pop() {
            if (list.isEmpty()) {
                System.out.println("Stack underflow");
                return Integer.MIN_VALUE;
            }
            return list.remove(list.size() - 1);
        }

        public static int peek() {
            if (list.isEmpty()) {
                System.out.println("Stack underflow");
                return Integer.MIN_VALUE;
            }
            return list.get(list.size() - 1);
        }

        public static boolean isEmpty() {
            return list.isEmpty();
        }

        public static void printStack() {
            if (list.isEmpty()) {
                System.out.println("Stack is empty");
                return;
            }
            System.out.println(list);
        }
    }

    public static void main(String[] args) {
        MyStack.push(1);
        MyStack.push(2);
        MyStack.push(3);
        MyStack.push(4);
        MyStack.push(5);
        MyStack.push(7);
        MyStack.printStack();
    }
}
