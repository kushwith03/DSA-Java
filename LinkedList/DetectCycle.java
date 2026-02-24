package LinkedList;

public class DetectCycle {
    public static void check(LinkedListUtils.Node head) {
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
                System.out.println("Cycle found");
                return;
            }
        }
        System.out.println("Cycle not found");


    }
}
