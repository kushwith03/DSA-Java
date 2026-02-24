package BinaryTrees;

import java.util.LinkedList;
import java.util.Queue;

public class SumOfNodesAtKthLevel {
    public static int sumOfNodes2(TreeUtils.TreeNode root, int k) {
        //Without using null marker
        if (root == null) return 0;
        Queue<TreeUtils.TreeNode> queue = new LinkedList<>();
        int level = 0;
        int sum = 0;
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeUtils.TreeNode curr = queue.poll();
                if (curr != null) {
                    if (curr.left != null) queue.add(curr.left);
                    if (curr.right != null) queue.add(curr.right);
                    if (level == k) {
                        sum += curr.data;
                    }
                }
            }
            if (level == k) break;
            level++;

        }
        return sum;

    }

    public static int sumOfNodes(TreeUtils.TreeNode root, int k) {
        if (root == null) {
            return 0;
        }
        Queue<TreeUtils.TreeNode> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);
        int level = 0;
        int sum = 0;
        while (!queue.isEmpty()) {
            TreeUtils.TreeNode curr = queue.poll();
            if (curr != null) {
                if (level == k) sum += curr.data;
                if (curr.left != null) queue.add(curr.left);
                if (curr.right != null) queue.add(curr.right);

            } else {
                if (queue.isEmpty() || level == k) {
                    break;
                }
                level++;
                queue.add(null);
            }
        }
        return sum;
    }
}
