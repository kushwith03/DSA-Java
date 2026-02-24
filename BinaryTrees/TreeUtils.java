package BinaryTrees;

import java.util.LinkedList;
import java.util.Queue;

public class TreeUtils {
    public static class TreeNode {
        int data;
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

    public static void preOrder(TreeNode root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    public static void postOrder(TreeNode root) {
        if (root != null) {
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " ");
        }
    }

    public static void levelOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);
        while (!queue.isEmpty()) {
            TreeNode curr = queue.remove();
            if (curr == null) {
                System.out.println();
                if (queue.isEmpty()) {
                    break;
                } else {
                    queue.add(null);
                }
            } else {
                if (curr.left != null) queue.add(curr.left);
                if (curr.right != null) queue.add(curr.right);
                System.out.print(curr.data + " ");
            }
        }
    }


    public static void main(String[] args) {
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        TreeNode root = buildTree(nodes);
//                  1
//                /   \
//               2     3
//              / \     \
//             4   5     6
    }
}
