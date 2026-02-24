package BinaryTrees;

public class IsSameTree {
    public static boolean check(TreeUtils.TreeNode p, TreeUtils.TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null) {
            return false;
        }
        if (p.data != q.data) {
            return false;
        }
        return check(p.left, q.left) && check(p.right, q.right);
    }
}
