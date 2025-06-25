package LinkedList;

public class SortLinkedListOfZeroOneTwo {
    public static LinkedListUtils.Node sort(LinkedListUtils.Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        LinkedListUtils.Node zeroHead = new LinkedListUtils.Node(-1);
        LinkedListUtils.Node oneHead = new LinkedListUtils.Node(-1);
        LinkedListUtils.Node twoHead = new LinkedListUtils.Node(-1);
        LinkedListUtils.Node zero = zeroHead;
        LinkedListUtils.Node one = oneHead;
        LinkedListUtils.Node two = twoHead;
        LinkedListUtils.Node temp = head;
        while (temp != null) {
            if (temp.data == 0) {
                zero.next = temp;
                zero = temp;
            } else if (temp.data == 1) {
                one.next = temp;
                one = temp;
            } else {
                two.next = temp;
                two = temp;
            }
            temp = temp.next;
        }
        if (oneHead.next != null) {
            zero.next = oneHead.next;
        } else {
            zero.next = twoHead.next;
        }
        one.next = twoHead.next;
        two.next = null;
        return zeroHead.next;
    }
}
