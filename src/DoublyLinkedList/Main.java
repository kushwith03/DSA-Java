package DoublyLinkedList;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedListUtils.addFirst(8);
        DoublyLinkedListUtils.addFirst(6);
        DoublyLinkedListUtils.addFirst(6);
        DoublyLinkedListUtils.addFirst(5);
        DoublyLinkedListUtils.addFirst(4);
        DoublyLinkedListUtils.addFirst(1);
        DoublyLinkedListUtils.addFirst(1);
        DoublyLinkedListUtils.addFirst(1);
        DoublyLinkedListUtils.printDoublyLinkedList(DoublyLinkedListUtils.head);
        RemoveDuplicates.remove(DoublyLinkedListUtils.head);
        DoublyLinkedListUtils.printDoublyLinkedList(DoublyLinkedListUtils.head);
    }
}
