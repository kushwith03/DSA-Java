package LinkedList;

public class Rotate {
    public static void rotateRight(LinkedListUtils.Node head) {
        int k = 2;
        if (k == 0 || head == null || head.next == null) {
            return;
        }
        int size = 0;
        LinkedListUtils.Node temp = head;
        while (temp != null) {
            size++;
            temp = temp.next;
        }
        k = k % size;
        if (k == 0) {
            return;
        }
        temp = head;
        int i = 0;
        while (i < (size - k - 1)) {
            i++;
            temp = temp.next;
        }
        LinkedListUtils.Node newHead = temp.next;
        LinkedListUtils.Node prev = newHead;
        temp.next = null;
        temp = newHead;
        while (temp != null) {
            prev = temp;
            temp = temp.next;
        }
        prev.next = head;
        LinkedListUtils.printLinkedList(newHead);
    }
}
