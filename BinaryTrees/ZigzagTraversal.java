package BinaryTrees;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class ZigzagTraversal {
    public static void print(TreeUtils.TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null) {
            return;
        }
        Deque<TreeUtils.TreeNode> queue = new LinkedList<>();
        queue.add(root);
        boolean reverse = false;
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> currList = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                if (!reverse) {
                    TreeUtils.TreeNode curr = queue.removeFirst();
                    currList.add(curr.data);
                    if (curr.left != null) queue.addLast(curr.left);
                    if (curr.right != null) queue.addLast(curr.right);
                } else {
                    TreeUtils.TreeNode curr = queue.removeLast();
                    currList.add(curr.data);
                    if (curr.right != null) queue.addFirst(curr.right);
                    if (curr.left != null) queue.addFirst(curr.left);

                }

            }
            ans.add(currList);
            reverse = !reverse;
        }
        System.out.println(ans);
    }
}
