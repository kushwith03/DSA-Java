package BinaryTrees;

public class HeightOfTree {

    public static int calcHeight(TreeUtils.TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftMaxHeight = calcHeight(root.left);
        int rightMaxHeight = calcHeight(root.right);
        return Math.max(leftMaxHeight, rightMaxHeight) + 1;
    }
}
