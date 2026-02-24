package BinaryTrees;

public class LowestCommonAncestor {
    public TreeUtils.TreeNode lowestCommonAncestor(TreeUtils.TreeNode root, TreeUtils.TreeNode p, TreeUtils.TreeNode q) {
        if (root == null) {
            return null;
        }
        if (root == p || root == q) {
            return root;
        }
        TreeUtils.TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeUtils.TreeNode right = lowestCommonAncestor(root.right, p, q);

        if (left != null && right != null) {
            return root;
        }

        return left != null ? left : right;
    }
}
