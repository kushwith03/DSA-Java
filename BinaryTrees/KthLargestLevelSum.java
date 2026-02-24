package BinaryTrees;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class KthLargestLevelSum {
    public static long kthLargestLevelSum(TreeUtils.TreeNode root, int k) {
        if (root == null) {
            return -1;
        }
        PriorityQueue<Long> minHeap = new PriorityQueue<>();
        Queue<TreeUtils.TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            long sum = 0;
            for (int i = 0; i < size; i++) {
                TreeUtils.TreeNode curr = queue.poll();
                if (curr.left != null) queue.add(curr.left);
                if (curr.right != null) queue.add(curr.right);
                sum += curr.data;
            }
            minHeap.add(sum);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }
        if (minHeap.size() < k) return -1;
        return minHeap.peek();
    }
}
