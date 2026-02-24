package BinaryTrees;

public class SumRootToLeaf {
    public static int sumNumbers(TreeUtils.TreeNode root) {
        return sumHelper(root, 0);
    }

    private static int sumHelper(TreeUtils.TreeNode root, int currentSum) {
        if (root == null) {
            return 0;
        }
        currentSum = currentSum * 10 + root.data;
        if (root.left == null && root.right == null) {
            return currentSum;
        }
        return sumHelper(root.left, currentSum) + sumHelper(root.right, currentSum);
    }
}
