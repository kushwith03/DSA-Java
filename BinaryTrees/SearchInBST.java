package BinaryTrees;

public class SearchInBST {
    public static TreeUtils.TreeNode search(TreeUtils.TreeNode root, int key) {
        if (root == null) {
            return null;
        }
        if (root.data == key) {
            return root;
        }
        if (key < root.data) {
            return search(root.left, key);
        } else {
            return search(root.right, key);
        }
    }
}
