package LinkedList;

public class AddTwoNumbers {
    public static LinkedListUtils.Node addTwoNumbers(LinkedListUtils.Node l1, LinkedListUtils.Node l2) {
        LinkedListUtils.Node temp1 = l1;
        LinkedListUtils.Node temp2 = l2;
        LinkedListUtils.Node dummyNode = new LinkedListUtils.Node(-1);
        LinkedListUtils.Node cur = dummyNode;
        int carry = 0;
        int sum = 0;
        while (temp1 != null || temp2 != null) {
            sum = carry;
            if (temp1 != null) {
                sum += temp1.data;
            }
            if (temp2 != null) {
                sum += temp2.data;
            }
            LinkedListUtils.Node newNode = new LinkedListUtils.Node(sum % 10);
            carry = sum / 10;
            cur.next = newNode;
            cur = cur.next;
            if (temp1 != null) {
                temp1 = temp1.next;
            }
            if (temp2 != null) {
                temp2 = temp2.next;
            }
        }
        if (carry > 0) {
            LinkedListUtils.Node newNode = new LinkedListUtils.Node(carry);
            cur.next = newNode;
        }
        return dummyNode.next;
    }
}
