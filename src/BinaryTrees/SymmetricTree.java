package BinaryTrees;

import java.util.LinkedList;
import java.util.Queue;

public class SymmetricTree {
    public boolean isSymmetric(TreeUtils.TreeNode root) {
        if (root == null) {
            return true;
        }
        Queue<TreeUtils.TreeNode> queue = new LinkedList<>();
        queue.add(root.left);
        queue.add(root.right);
        while (!queue.isEmpty()) {
            TreeUtils.TreeNode p = queue.poll();
            TreeUtils.TreeNode q = queue.poll();
            if (p == null && q == null) {
                continue;
            }
            if (p == null || q == null) {
                return false;
            }
            if (p.data != q.data) {
                return false;
            }
            queue.add(p.left);
            queue.add(q.right);
            queue.add(p.right);
            queue.add(q.left);
        }
        return true;
    }
}
