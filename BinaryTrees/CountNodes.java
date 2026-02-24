package BinaryTrees;

public class CountNodes {
    public static int countOfNodes(TreeUtils.TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftCount = countOfNodes(root.left);
        int rightCount = countOfNodes(root.right);

        return leftCount + rightCount + 1;
    }
}
