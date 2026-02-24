package LinkedList;

public class MergeSort {
    public static LinkedListUtils.Node mergeSort(LinkedListUtils.Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        LinkedListUtils.Node slow = head;
        LinkedListUtils.Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        LinkedListUtils.Node left = head;
        LinkedListUtils.Node right = slow.next;
        slow.next = null;
        LinkedListUtils.Node newLeft = mergeSort(left);
        LinkedListUtils.Node newRight = mergeSort(right);
        return merge(newLeft, newRight);
    }

    public static LinkedListUtils.Node merge(LinkedListUtils.Node left, LinkedListUtils.Node right) {
        LinkedListUtils.Node mergedList = new LinkedListUtils.Node(-1);
        LinkedListUtils.Node temp = mergedList;
        while (left != null && right != null) {
            if (left.data <= right.data) {
                temp.next = left;
                temp = temp.next;
                left = left.next;
            } else {
                temp.next = right;
                temp = temp.next;
                right = right.next;

            }
        }
        while (left != null) {
            temp.next = left;
            temp = temp.next;
            left = left.next;
        }
        while (right != null) {
            temp.next = right;
            temp = temp.next;
            right = right.next;
        }
        return mergedList.next;
    }

    public static void main(String[] args) {
        LinkedListUtils.addLast(1);
        LinkedListUtils.addLast(3);
        LinkedListUtils.addLast(6);
        LinkedListUtils.addLast(9);
        LinkedListUtils.addLast(2);
        LinkedListUtils.addLast(4);
        LinkedListUtils.head = mergeSort(LinkedListUtils.head);
        LinkedListUtils.printLinkedList(LinkedListUtils.head);
    }
}
