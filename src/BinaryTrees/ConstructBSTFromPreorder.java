package BinaryTrees;

public class ConstructBSTFromPreorder {
    public static TreeUtils.TreeNode insertIntoBST(TreeUtils.TreeNode root, int val) {
        if (root == null) {
            return new TreeUtils.TreeNode(val);
        }
        if (val < root.data) {
            root.left = insertIntoBST(root.left, val);
        } else {
            root.right = insertIntoBST(root.right, val);
        }
        return root;
    }

    public static TreeUtils.TreeNode bstFromPreorder(int[] preorder) {
        if (preorder == null || preorder.length == 0) {
            return null;
        }
        TreeUtils.TreeNode root = new TreeUtils.TreeNode(preorder[0]);
        for (int i = 1; i < preorder.length; i++) {
            root = insertIntoBST(root, preorder[i]);
        }
        return root;
    }
}
