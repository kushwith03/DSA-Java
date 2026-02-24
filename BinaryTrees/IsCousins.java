package BinaryTrees;

import java.util.LinkedList;
import java.util.Queue;

public class IsCousins {
    public static boolean check(TreeUtils.TreeNode root, int x, int y) {
        if (root == null) {
            return false;
        }
        Queue<TreeUtils.TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            boolean foundX = false;
            boolean foundY = false;
            for (int i = 0; i < size; i++) {
                TreeUtils.TreeNode curr = queue.poll();
                if (curr.left != null && curr.right != null) {
                    if ((curr.left.data == x && curr.right.data == y) ||
                            (curr.left.data == y && curr.right.data == x)) {
                        return false;
                    }
                }
                if (curr.left != null) {
                    if (curr.left.data == x) foundX = true;
                    if (curr.left.data == y) foundY = true;
                    queue.offer(curr.left);
                }
                if (curr.right != null) {
                    if (curr.right.data == x) foundX = true;
                    if (curr.right.data == y) foundY = true;
                    queue.offer(curr.right);
                }
                if (foundX && foundY) {
                    return true;
                }
            }
        }
        return false;
    }
}
