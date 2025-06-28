package Stack;

public class LinkedListStack {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    public static class MyStack {
        public static Node head;

        public static void push(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        public static int pop() {
            if (head == null) {
                System.out.println("Stack underflow");
                return Integer.MIN_VALUE;
            }
            int val = head.data;
            head = head.next;
            return val;
        }

        public static int peek() {
            if (head == null) {
                System.out.println("Stack is empty");
                return Integer.MIN_VALUE;
            }
            return head.data;
        }

        public static boolean isEmpty() {
            return head == null;
        }

        public static void printStack() {
            if (head == null) {
                System.out.println("Stack is empty");
                return;
            }
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }


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
