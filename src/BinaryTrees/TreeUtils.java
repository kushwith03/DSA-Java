package BinaryTrees;

public class TreeUtils {
    public static class TreeNode {
        public int data;
        TreeNode left;
        TreeNode right;

        public TreeNode(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static int index = -1;

    public static TreeNode buildTree(int[] nodes) {
        index++;
        if (nodes[index] == -1) {
            return null;
        }
        TreeNode newNode = new TreeNode(nodes[index]);
        newNode.left = buildTree(nodes);
        newNode.right = buildTree(nodes);
        return newNode;
    }

    public static void inOrder(TreeNode root) {
        if (root != null) {
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }
    }


    public static void main(String[] args) {
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        TreeNode root = buildTree(nodes);
        inOrder(root);
        System.out.println();
    }
}
