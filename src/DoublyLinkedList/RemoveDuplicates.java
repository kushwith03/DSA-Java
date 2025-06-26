package DoublyLinkedList;

public class RemoveDuplicates {
    public static void remove(DoublyLinkedListUtils.Node head) {
        DoublyLinkedListUtils.Node temp = head;
        DoublyLinkedListUtils.Node nextNode;
        while (temp != null) {
            nextNode = temp.next;
            while (nextNode != null && temp.data == nextNode.data) {
                nextNode = nextNode.next;
            }
            temp.next = nextNode;
            if (nextNode != null) {
                nextNode.prev = temp;
            }
            temp = nextNode;
        }

    }
}
