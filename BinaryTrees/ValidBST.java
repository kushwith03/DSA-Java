package BinaryTrees;

public class ValidBST {
    public static boolean check(TreeUtils.TreeNode root) {
        if (root == null) {
            return true;
        }
        return helper(root, null, null);
    }

    public static boolean helper(TreeUtils.TreeNode root, Integer low, Integer high) {
        if (root == null) {
            return true;
        }
        if (low != null && root.data <= low) {
            return false;
        }
        if (high != null && root.data >= high) {
            return false;
        }
        return helper(root.left, low, root.data) && helper(root.right, root.data, high);
    }
}
