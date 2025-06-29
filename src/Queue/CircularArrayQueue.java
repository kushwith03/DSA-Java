package Queue;

public class CircularArrayQueue {
    public static class MyQueue {
        static int[] array;
        static int front = -1;
        static int rear = -1;
        static int size;

        public MyQueue(int n) {
            array = new int[n];
            this.size = n;
        }

        public static boolean isEmpty() {
            return front == -1;
        }

        public static void add(int data) {
            if ((rear + 1) % size == front) {
                System.out.println("Queue is full");
                return;
            }
            if (front == -1) {
                front = 0;
            }
            rear = (rear + 1) % size;
            array[rear] = data;
        }

        public static int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return Integer.MIN_VALUE;
            }
            int val = array[front];
            if (rear == front) {
                rear = front = -1;
            } else {
                front = (front + 1) % size;
            }
            return val;
        }

        public static int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return Integer.MIN_VALUE;
            }
            return array[front];
        }

        public static void printQueue() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return;
            }
            int i = front;
            while (true) {
                System.out.print(array[i] + " ");
                if (i == rear) {
                    break;
                }
                i = (i + 1) % size;
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
