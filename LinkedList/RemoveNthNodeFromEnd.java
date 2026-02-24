package LinkedList;

public class RemoveNthNodeFromEnd {
    public static LinkedListUtils.Node removeNthFromEnd(LinkedListUtils.Node head, int n) {
        int size = 0;
        LinkedListUtils.Node temp = head;
        while (temp != null) {
            size++;
            temp = temp.next;
        }
        if (n == size) {
            return head.next;
        }
        temp = head;
        int count = 0;
        while (count < size - n - 1) {
            count++;
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return head;
    }

    public static LinkedListUtils.Node twoPointer(LinkedListUtils.Node head, int n) {
        int count = 0;
        LinkedListUtils.Node fast = head;
        while (count < n && fast != null) {
            count++;
            fast = fast.next;
        }
        if (fast == null) {
            return head.next;
        }
        LinkedListUtils.Node slow = head;
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return head;
    }

}
