package LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedListUtils.addLast(1);
        LinkedListUtils.addLast(2);
        LinkedListUtils.addLast(3);
        LinkedListUtils.addLast(1);
        LinkedListUtils.printLinkedList(LinkedListUtils.head);
    }
}
