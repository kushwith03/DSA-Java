package Queue;

import java.util.Stack;

public class QueueUsingTwoStack {
    public static class MyQueue {
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        public static boolean isEmpty() {
            return s1.isEmpty();
        }

        public static void add(int data) {
            while (!s1.isEmpty()) {
                s2.add(s1.pop());
            }
            s1.add(data);
            while (!s2.isEmpty()) {
                s1.add(s2.pop());
            }

        }

        public static int remove() {
            if (s1.isEmpty()) {
                System.out.println("Queue underflow");
                return Integer.MIN_VALUE;
            }
            return s1.pop();
        }

        public static int peek() {
            if (s1.isEmpty()) {
                return Integer.MIN_VALUE;
            }
            return s1.peek();
        }

    }

    public static void main(String[] args) {
        MyQueue.add(1);
        MyQueue.add(2);
        MyQueue.add(3);

    }
}
