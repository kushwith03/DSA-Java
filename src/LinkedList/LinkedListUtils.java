package LinkedList;

public class LinkedListUtils {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }


    }

    public static Node head;
    public static Node tail;
    static int size = 0;

    public static void addFirst(int val) {
        size++;
        Node newNode = new Node(val);
        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public static void addLast(int val) {
        size++;
        Node newNode = new Node(val);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public static void add(int index, int val) {
        if (index < 0 || index > size) {
            System.out.println("Invalid index ");
            return;
        }
        if (index == 0) {
            addFirst(val);
            return;
        }
        size++;
        int i = 0;
        Node newNode = new Node(val);
        Node temp = head;
        while (temp != null && i < index - 1) {
            i++;
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;

    }

    public static int removeFirst() {
        if (size == 0) {
            System.out.println("Linked list is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            size = 0;
            head = tail = null;
            return val;
        }
        size--;
        int val = head.data;
        head = head.next;
        return val;
    }

    public static int removeLast() {
        if (size == 0) {
            System.out.println("Linked list is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            size = 0;
            int val = tail.data;
            head = tail = null;
            return val;
        }
        size--;
        Node temp = head;
        Node prev = null;
        while (temp.next != null) {
            prev = temp;
            temp = temp.next;
        }
        int val = temp.data;
        prev.next = null;
        tail = prev;
        return val;
    }

    public static int remove(int i) {
        if (i < 0 || i >= size) {
            System.out.println("Invalid index");
            return Integer.MIN_VALUE;
        }
        if (size == 1) {
            return removeFirst();
        }
        if (i == size - 1) {
            return removeLast();
        }
        size--;
        Node temp = head;
        int index = 0;
        while (index < i - 1) {
            index++;
            temp = temp.next;
        }
        Node remove = temp.next;
        int val = remove.data;
        temp.next = temp.next.next;
        return val;
    }

    public static void printLinkedList(Node head) {
        if (head == null) {
            System.out.println("Linked list is empty ");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static int search(Node head, int key) {
        Node temp = head;
        int index = 0;
        while (temp != null) {
            if (temp.data == key) {
                return index;
            }
            index++;
            temp = temp.next;
        }
        return -1;
    }

    public static int recursiveSearch(Node head, int key, int i) {
        if (head == null) {
            return -1;
        }
        if (head.data == key) {
            return i;
        }
        return recursiveSearch(head.next, key, i + 1);
    }

    public static void reverse() {
        if (head == null || head.next == null) {
            return;
        }
        Node prev = null;
        Node cur = tail = head;
        Node next;
        while (cur != null) {
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        head = prev;
    }

    public static void main(String[] args) {
        addFirst(0);
        addFirst(3);
        addFirst(2);
        addFirst(1);
        addLast(5);
        addLast(6);
        addLast(7);
        add(4, 4);
        removeFirst();
        printLinkedList(head);
        System.out.println("Size of Linked List : " + size);
        remove(4);
        printLinkedList(head);
    }
}
