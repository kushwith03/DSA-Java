package LinkedList;

public class OddEven {
    public static LinkedListUtils.Node oddEvenList(LinkedListUtils.Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        LinkedListUtils.Node odd = head;
        LinkedListUtils.Node even = head.next;
        LinkedListUtils.Node evenHead = even;
        while (even != null && even.next != null) {
            odd.next = odd.next.next;
            even.next = even.next.next;
            odd = odd.next;
            even = even.next;
        }
        odd.next = evenHead;
        return head;
    }
}
