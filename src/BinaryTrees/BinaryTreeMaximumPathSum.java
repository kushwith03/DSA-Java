package BinaryTrees;

public class BinaryTreeMaximumPathSum {
    public static int maxPathSum;

    public static int maxPathSum(TreeUtils.TreeNode root) {
        maxPathSum = Integer.MIN_VALUE;
        findMaxPathSum(root);
        return maxPathSum;
    }

    public static int findMaxPathSum(TreeUtils.TreeNode node) {
        if (node == null) {
            return 0;
        }
        int leftMax = Math.max(0, findMaxPathSum(node.left));
        int rightMax = Math.max(0, findMaxPathSum(node.right));
        maxPathSum = Math.max(maxPathSum, node.data + leftMax + rightMax);
        return node.data + Math.max(leftMax, rightMax);
    }
}
