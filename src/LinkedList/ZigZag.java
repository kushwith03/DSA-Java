package LinkedList;

public class ZigZag {
    public static void ZigZagReorder(LinkedListUtils.Node head) {
        System.out.println("Original linked list");
        LinkedListUtils.printLinkedList(head);
        if (head == null || head.next == null) {
            System.out.println("Zig Zag linked list : ");
            LinkedListUtils.printLinkedList(head);
            return;
        }
        LinkedListUtils.Node slow = head;
        LinkedListUtils.Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        LinkedListUtils.Node prev = null;
        LinkedListUtils.Node cur = slow.next;
        LinkedListUtils.Node next;
        slow.next = null;
        while (cur != null) {
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        LinkedListUtils.Node left = head;
        LinkedListUtils.Node right = prev;

        LinkedListUtils.Node leftNext;
        LinkedListUtils.Node rightNext;

        while (left != null && right != null) {
            leftNext = left.next;
            left.next = right;
            rightNext = right.next;
            right.next = leftNext;
            left = leftNext;
            right = rightNext;
        }
        System.out.println("Zig Zag linked list : ");
        LinkedListUtils.printLinkedList(head);
    }
}
