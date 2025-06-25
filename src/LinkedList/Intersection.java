package LinkedList;

import java.util.HashMap;

public class Intersection {
    public static LinkedListUtils.Node getIntersectionNode(LinkedListUtils.Node headA, LinkedListUtils.Node headB) {
        HashMap<LinkedListUtils.Node, Integer> map = new HashMap<>();
        LinkedListUtils.Node temp = headA;
        while (temp != null) {
            map.put(temp, 1);
            temp = temp.next;
        }
        temp = headB;
        while (temp != null) {
            if (map.containsKey(temp)) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    public static LinkedListUtils.Node better(LinkedListUtils.Node headA, LinkedListUtils.Node headB) {
        LinkedListUtils.Node temp1 = headA;
        LinkedListUtils.Node temp2 = headB;
        while (temp1 != temp2) {
            temp1 = temp1.next;
            temp2 = temp2.next;
            if (temp1 == temp2) {
                return temp1;
            }
            if (temp1 == null) {
                temp1 = headB;
            }
            if (temp2 == null) {
                temp2 = headA;
            }
        }
        return temp1;
    }
}
