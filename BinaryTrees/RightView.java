package BinaryTrees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class RightView {
    public static void print(TreeUtils.TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) {
            return;
        }
        Queue<TreeUtils.TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeUtils.TreeNode curr = queue.poll();
                if (i == size - 1) {
                    list.add(curr.data);
                }
                if (curr.left != null) queue.add(curr.left);
                if (curr.right != null) queue.add(curr.right);
            }
        }
        System.out.println(list);

    }
}
