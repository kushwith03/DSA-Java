package BinaryTrees;

import BinaryTrees.NodeWithNext.Node;

import java.util.LinkedList;
import java.util.Queue;

public class PopulatingNextRightPointers {
    public static void optimal(Node root) {
        if (root == null) {
            return;
        }
        Node leftMost = root;
        while (leftMost.left != null) {
            Node curr = leftMost;
            while (curr != null) {
                curr.left.next = curr.right;
                if (curr.next != null) {
                    curr.right.next = curr.next.left;
                }
                curr = curr.next;
            }
            leftMost = leftMost.left;
        }

    }

    public static void implement(Node root) {
        if (root == null) return;

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            Node prev = null;

            for (int i = 0; i < size; i++) {
                Node curNode = queue.poll();

                if (prev != null) {
                    prev.next = curNode;
                }

                if (curNode.left != null) queue.add(curNode.left);
                if (curNode.right != null) queue.add(curNode.right);

                prev = curNode;
            }

            prev.next = null;
        }
    }

}
