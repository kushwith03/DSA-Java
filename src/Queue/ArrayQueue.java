package Queue;

public class ArrayQueue {
    public static class MyQueue {
        static int[] array;
        static int front = 0;
        static int rear = -1;
        static int size;

        public MyQueue(int n) {
            array = new int[n];
            this.size = n;
        }

        public static boolean isEmpty() {
            return rear < front;
        }

        public static void add(int data) {
            if (rear + 1 == size) {
                System.out.println("Queue is full");
                return;
            }
            array[++rear] = data;
        }

        public static int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return Integer.MIN_VALUE;
            }
            int val = array[0];
            for (int i = 0; i < rear; i++) {
                array[i] = array[i + 1];
            }
            rear--;
            return val;
        }

        public static int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return Integer.MIN_VALUE;
            }
            return array[0];
        }

        public static void printQueue() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return;
            }
            for (int i = 0; i <= rear; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        MyQueue q = new MyQueue(5);
        q.add(10);
        q.add(20);
        q.add(30);
        q.printQueue();
        System.out.println("Removed: " + q.remove());
        System.out.println("Front: " + q.peek());
        q.printQueue();
    }
}
