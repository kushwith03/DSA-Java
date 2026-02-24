package BinaryTrees;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class TopView {

    public static class myInfo {
        TreeUtils.TreeNode node;
        int hd;

        public myInfo(TreeUtils.TreeNode node, int hd) {
            this.node = node;
            this.hd = hd;
        }
    }

    public static void printTopView(TreeUtils.TreeNode root) {
        if (root == null) {
            return;
        }
        Queue<myInfo> queue = new LinkedList<>();
        HashMap<Integer, TreeUtils.TreeNode> map = new HashMap<>();
        queue.add(new myInfo(root, 0));
        queue.add(null);
        int minHd = 0;
        int maxHd = 0;
        while (!queue.isEmpty()) {
            myInfo curr = queue.poll();
            if (curr != null) {
                if (!map.containsKey(curr.hd)) {
                    map.put(curr.hd, curr.node);
                }
                if (curr.node.left != null) {
                    queue.add(new myInfo(curr.node.left, curr.hd - 1));
                    minHd = Math.min(minHd, curr.hd - 1);

                }
                if (curr.node.right != null) {
                    queue.add(new myInfo(curr.node.right, curr.hd + 1));
                    maxHd = Math.max(maxHd, curr.hd + 1);
                }
            } else if (curr == null) {
                if (queue.isEmpty()) {
                    break;
                } else {
                    queue.add(null);
                }
            }
        }
        for (int i = minHd; i <= maxHd; i++) {
            System.out.print(map.get(i).data + " ");
        }

    }
}
