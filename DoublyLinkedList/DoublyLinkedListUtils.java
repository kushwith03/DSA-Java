package DoublyLinkedList;

public class DoublyLinkedListUtils {
    public static class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public static void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    public static void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    public static int removeFirst() {
        if (head == null) {
            return Integer.MIN_VALUE;
        }
        size--;
        if (head.next == null) {
            int val = head.data;
            head = tail = null;
            return val;
        }
        int val = head.data;
        head = head.next;
        head.prev = null;
        return val;
    }

    public static int removeLast() {
        if (head == null) {
            return Integer.MIN_VALUE;
        }
        size--;
        if (head.next == null) {
            int val = head.data;
            head = tail = null;
            return val;
        }
        int val = tail.data;
        Node temp = tail.prev;
        temp.next = null;
        tail = temp;
        return val;
    }

    public static void add(int data, int n) {
        if (n < 0 || n > size) {
            return;
        } else if (n == 0) {
            addFirst(data);
            return;
        } else if (n == size) {
            addLast(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        int count = 0;
        Node temp = head;
        while (count < n - 1) {
            temp = temp.next;
            count++;
        }
        Node next = temp.next;
        temp.next = newNode;
        newNode.prev = temp;
        newNode.next = next;
        next.prev = newNode;
    }

    public static int remove(int n) {
        if (head == null || n < 0 || n >= size) {
            return Integer.MIN_VALUE;
        } else if (n == 0) {
            return removeFirst();
        } else if (n == size - 1) {
            return removeLast();
        }
        size--;
        int count = 0;
        Node temp = head;
        while (count < n) {
            count++;
            temp = temp.next;
        }
        int val = temp.data;
        Node back = temp.prev;
        Node front = temp.next;
        back.next = front;
        front.prev = back;
        return val;
    }

    public static void printDoublyLinkedList(Node head) {
        Node temp = head;
        System.out.print("null ⇄ ");
        while (temp != null) {
            System.out.print("[" + temp.data + "] ⇄ ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static Node reverse(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node prev = null;
        Node cur = head;
        Node next;
        while (cur != null) {
            next = cur.next;
            cur.next = prev;
            cur.prev = next;
            prev = cur;
            cur = next;
        }
        return prev;
    }

    public static void main(String[] args) {
        addFirst(5);
        addFirst(4);
        addFirst(3);
        addFirst(2);
        addFirst(1);
        printDoublyLinkedList(head);
    }
}
