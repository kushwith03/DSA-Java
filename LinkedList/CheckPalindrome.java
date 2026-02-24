package LinkedList;

public class CheckPalindrome {
    public static void check(LinkedListUtils.Node head) {
        if (head == null || head.next == null) {
            System.out.println("Is palindrome");
            return;
        }
        LinkedListUtils.Node slow = head;
        LinkedListUtils.Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        LinkedListUtils.Node prev = null;
        LinkedListUtils.Node cur = slow;
        LinkedListUtils.Node next;
        while (cur != null) {
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        LinkedListUtils.Node left = head;
        LinkedListUtils.Node right = prev;
        while (right != null) {
            if (left.data != right.data) {
                System.out.println("Not a Palindromes");
                return;
            }
            left = left.next;
            right = right.next;
        }
        System.out.println("Is palindrome");
    }
}
