package BinaryTrees;

public class DiameterOfTree {
    public static int calcDiameter(TreeUtils.TreeNode root) {
        if (root == null) {
            return 0;
        }
        int dia1 = calcDiameter(root.left);
        int dia2 = calcDiameter(root.right);
        int dia3 = height(root.left) + height(root.right) + 1;

        return Math.max(dia3, (Math.max(dia1, dia2)));
    }

    public class TreeInfo {
        int height;
        int diameter;

        public TreeInfo(int height, int diameter) {
            this.height = height;
            this.diameter = diameter;
        }
    }

    public static int height(TreeUtils.TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        return Math.max(leftHeight, rightHeight) + 1;

    }
}
