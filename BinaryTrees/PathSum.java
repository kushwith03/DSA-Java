package BinaryTrees;

public class PathSum {
    public static boolean hasPathSum(TreeUtils.TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }
        if (root.left == null && root.right == null) {
            return targetSum == root.data;
        }
        int newTargetSum = targetSum - root.data;
        return hasPathSum(root.left, newTargetSum) || hasPathSum(root.right, newTargetSum);
    }
}
