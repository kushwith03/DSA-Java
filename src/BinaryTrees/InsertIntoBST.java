package BinaryTrees;

public class InsertIntoBST {
    public static TreeUtils.TreeNode insertIntoBST(TreeUtils.TreeNode root, int val) {
//        if (root == null) {
//            return new TreeUtils.TreeNode(val);
//        }
//        if (val < root.data) {
//            root.left = insertIntoBST(root.left, val);
//        } else {
//            root.right = insertIntoBST(root.right, val);
//        }
//        return root;
        TreeUtils.TreeNode newNode = new TreeUtils.TreeNode(val);
        if (root == null) {
            return newNode;
        }
        TreeUtils.TreeNode current = root;
        while (true) {
            if (val < current.data) {
                if (current.left == null) {
                    current.left = newNode;
                    break;
                } else {
                    current = current.left;
                }
            } else {
                if (current.right == null) {
                    current.right = newNode;
                    break;
                } else {
                    current = current.right;
                }
            }
        }
        return root;
    }
}
