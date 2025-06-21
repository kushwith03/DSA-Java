package LinkedList;

public class RemoveCycle {
    public static void remove(LinkedListUtils.Node head) {
        if (head == null || head.next == null) {
            System.out.println("Cycle not found");
            return;
        }
        LinkedListUtils.Node slow = head;
        LinkedListUtils.Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                slow = head;
                while (slow.next != fast.next) {
                    slow = slow.next;
                    fast = fast.next;
                }
                fast.next = null;
                System.out.println("Cycle removed");
                LinkedListUtils.printLinkedList(head);
                return;
            }
        }
        System.out.println("Cycle not found");
    }
}
