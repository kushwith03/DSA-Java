package BinaryTrees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AverageOfLevels {
    public void averageOfLevels(TreeUtils.TreeNode root) {
        List<Double> list = new ArrayList<>();
        if (root == null) {
            return;
        }
        Queue<TreeUtils.TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        long sum;
        while (!queue.isEmpty()) {
            sum = 0;
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeUtils.TreeNode curr = queue.poll();
                sum += curr.data;
                if (curr.left != null) queue.add(curr.left);
                if (curr.right != null) queue.add(curr.right);
            }
            list.add((double) sum / size);
        }
    }
}
