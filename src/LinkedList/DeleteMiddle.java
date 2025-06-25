package LinkedList;

public class DeleteMiddle {
    public static LinkedListUtils.Node deleteMiddle(LinkedListUtils.Node head) {
        if (head == null || head.next == null) {
            return null;
        }
        LinkedListUtils.Node slow = head;
        LinkedListUtils.Node fast = head.next.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        slow.next = slow.next.next;
        return head;
    }
}
