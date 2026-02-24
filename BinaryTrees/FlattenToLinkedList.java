package BinaryTrees;

import java.util.LinkedList;
import java.util.Queue;

public class FlattenToLinkedList {
    public void preOrder(TreeUtils.TreeNode root, Queue<TreeUtils.TreeNode> queue) {
        if (root == null) {
            return;
        }
        queue.add(root);
        preOrder(root.left, queue);
        preOrder(root.right, queue);
    }

    public void optimal(TreeUtils.TreeNode root) {
        if (root == null) {
            return;
        }
        TreeUtils.TreeNode curr = root;
        while (curr != null) {
            if (curr.left != null) {
                TreeUtils.TreeNode temp = curr.left;
                while (temp.right != null) {
                    temp = temp.right;
                }
                temp.right = curr.right;
                curr.right = curr.left;
                curr.left = null;
            }
            curr = curr.right;
        }
    }

    public void flatten(TreeUtils.TreeNode root) {
        Queue<TreeUtils.TreeNode> queue = new LinkedList<>();
        preOrder(root, queue);
        TreeUtils.TreeNode prev = null;
        while (!queue.isEmpty()) {
            TreeUtils.TreeNode curr = queue.poll();
            if (prev != null) {
                prev.right = curr;
            }
            curr.left = null;
            prev = curr;
        }

    }
}
