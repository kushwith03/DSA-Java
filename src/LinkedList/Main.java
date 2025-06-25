package LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedListUtils.addLast(1);
        LinkedListUtils.addLast(0);
        LinkedListUtils.addLast(1);
        LinkedListUtils.addLast(2);
        LinkedListUtils.addLast(2);
        LinkedListUtils.addLast(0);

        LinkedListUtils.printLinkedList(LinkedListUtils.head);

        LinkedListUtils.printLinkedList(SortLinkedListOfZeroOneTwo.sort(LinkedListUtils.head));

    }
}
