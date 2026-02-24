package LinkedList;

public class AddOne {
    public static LinkedListUtils.Node addOne(LinkedListUtils.Node head) {
        head = LinkedListUtils.reverse(head);
        LinkedListUtils.Node temp = head;
        int carry = 1;
        while (temp != null) {
            temp.data = temp.data + carry;
            if (temp.data < 9) {
                carry = 0;
                break;
            } else {
                temp.data = 0;
                carry = 1;
            }
            temp = temp.next;
        }
        if (carry == 1) {
            head = LinkedListUtils.reverse(head);
            LinkedListUtils.Node newNode = new LinkedListUtils.Node(1);
            newNode.next = head;
            return newNode;
        }
        head = LinkedListUtils.reverse(head);
        return head;
    }

    public static LinkedListUtils.Node better(LinkedListUtils.Node head) {
        int carry = recursiveAdd(head);
        if (carry == 1) {
            LinkedListUtils.Node newNode = new LinkedListUtils.Node(1);
            newNode.next = head;
            return newNode;
        }
        return head;
    }

    public static int recursiveAdd(LinkedListUtils.Node temp) {
        if (temp == null) {
            return 1;
        }
        int carry = recursiveAdd(temp.next);
        temp.data = temp.data + carry;
        if (temp.data < 10) {
            return 0;
        }
        temp.data = 0;
        return 1;
    }
}
