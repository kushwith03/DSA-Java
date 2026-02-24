package DoublyLinkedList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PairsWithSumK {
    public static void pairs(DoublyLinkedListUtils.Node head, int k) {
        DoublyLinkedListUtils.Node temp1 = head;
        DoublyLinkedListUtils.Node temp2;
        List<List<Integer>> ans = new ArrayList<>();
        while (temp1 != null) {
            temp2 = temp1.next;
            while (temp2 != null) {
                if (temp1.data + temp2.data == k) {
                    ans.add(Arrays.asList(temp1.data, temp2.data));
                }
                temp2 = temp2.next;
            }
            temp1 = temp1.next;
        }
        System.out.println("Pairs with sum as " + k);
        System.out.println(ans);
    }

    public static void sortedDLL(DoublyLinkedListUtils.Node head, int k) {
        DoublyLinkedListUtils.Node left = head;
        DoublyLinkedListUtils.Node right = DoublyLinkedListUtils.tail;
        List<List<Integer>> ans = new ArrayList<>();
        while (left.data < right.data) {
            if (left.data + right.data == k) {
                ans.add(Arrays.asList(left.data, right.data));
                left = left.next;
                right = right.prev;
            } else if (left.data + right.data < k) {
                left = left.next;
            } else {
                right = right.prev;
            }
        }
        System.out.println("Pairs with sum as " + k);
        System.out.println(ans);
    }
}
