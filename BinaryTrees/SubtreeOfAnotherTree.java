package BinaryTrees;

public class SubtreeOfAnotherTree {
    public static boolean isIDentical(TreeUtils.TreeNode root, TreeUtils.TreeNode subRoot) {
        if (root == null && subRoot == null) {
            return true;
        }
        if (root == null || subRoot == null) {
            return false;
        }
        if (root.data != subRoot.data) {
            return false;
        }
        return isIDentical(root.left, subRoot.left) && isIDentical(root.right, subRoot.right);
    }

    public static boolean isSubTree(TreeUtils.TreeNode root, TreeUtils.TreeNode subRoot) {
        if (subRoot == null) {
            return true;
        }
        if (root == null) {
            return false;
        }
        if (root.data == subRoot.data) {
            if (isIDentical(root, subRoot)) {
                return true;
            }
        }
        return isSubTree(root.left, subRoot) || isSubTree(root.right, subRoot);
    }
}
