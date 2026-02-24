package BinaryTrees;

public class DiameterOfTree {
    public static int calcDiameter(TreeUtils.TreeNode root) {
        if (root == null) {
            return 0;
        }
        int dia1 = calcDiameter(root.left);
        int dia2 = calcDiameter(root.right);
        int dia3 = HeightOfTree.calcHeight(root.left) + HeightOfTree.calcHeight(root.right) + 1;

        return Math.max(dia3, (Math.max(dia1, dia2)));
    }

    public static class TreeInfo {
        int height;
        int diameter;

        public TreeInfo(int height, int diameter) {
            this.height = height;
            this.diameter = diameter;
        }
    }

    public static TreeInfo optimal(TreeUtils.TreeNode root) {
        if (root == null) {
            return new TreeInfo(0, 0);
        }
        TreeInfo left = optimal(root.left);
        TreeInfo right = optimal(root.right);
        int dia1 = left.diameter;
        int dia2 = right.diameter;
        int dia3 = left.height + right.height + 1;
        int myDia = Math.max(dia3, Math.max(dia1, dia2));
        int myHeight = Math.max(left.height, right.height) + 1;
        TreeInfo myInfo = new TreeInfo(myHeight, myDia);
        return myInfo;
    }
    
}
