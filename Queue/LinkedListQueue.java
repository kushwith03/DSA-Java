package Queue;

public class LinkedListQueue {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static class MyQueue {
        public static Node head;
        public static Node tail;

        public static void add(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }

        public static int remove() {
            if (head == null) {
                System.out.println("Queue is empty !!");
                return Integer.MIN_VALUE;
            }
            if (head.next == null) {
                int val = head.data;
                head = tail = null;
                return val;
            }
            int val = head.data;
            head = head.next;
            return val;
        }

        public static int peek() {
            if (head == null) {
                System.out.println("Queue is empty !!");
                return Integer.MIN_VALUE;
            }
            return head.data;
        }

        public static boolean isEmpty() {
            return head == null;
        }

        public static void printQueue() {
            if (head == null) {
                System.out.println("Queue is empty !!");
                return;
            }
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        MyQueue.add(10);
        MyQueue.add(20);
        MyQueue.add(30);
        MyQueue.printQueue();

        System.out.println("Removed: " + MyQueue.remove());
        System.out.println("Front: " + MyQueue.peek());
        System.out.println("Is Empty? " + MyQueue.isEmpty());
        MyQueue.printQueue();
    }
}
