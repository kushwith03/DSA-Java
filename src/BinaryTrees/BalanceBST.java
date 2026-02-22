package BinaryTrees;

import java.util.ArrayList;
import java.util.List;

public class BalanceBST {
    public static TreeUtils.TreeNode balanceBST(TreeUtils.TreeNode root) {
        List<Integer> sortedList = new ArrayList<>();
        inOrderTraversal(root, sortedList);
        return buildBalancedBST(sortedList, 0, sortedList.size() - 1);
    }

    public static void inOrderTraversal(TreeUtils.TreeNode node, List<Integer> sortedList) {
        if (node == null) {
            return;
        }
        inOrderTraversal(node.left, sortedList);
        sortedList.add(node.data);
        inOrderTraversal(node.right, sortedList);
    }

    public static TreeUtils.TreeNode buildBalancedBST(List<Integer> sortedList, int start, int end) {
        if (start > end) {
            return null;
        }
        int mid = start + (end - start) / 2;
        TreeUtils.TreeNode node = new TreeUtils.TreeNode(sortedList.get(mid));
        node.left = buildBalancedBST(sortedList, start, mid - 1);
        node.right = buildBalancedBST(sortedList, mid + 1, end);
        return node;
    }
}
