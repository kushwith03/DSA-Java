package BinaryTrees;

public class SortedArrayToBST {
    public static TreeUtils.TreeNode sortedArrayToBST(int[] nums) {
        return buildBST(nums, 0, nums.length - 1);
    }

    private static TreeUtils.TreeNode buildBST(int[] nums, int left, int right) {
        if (left > right) {
            return null;
        }
        int mid = left + (right - left) / 2;
        TreeUtils.TreeNode node = new TreeUtils.TreeNode(nums[mid]);
        node.left = buildBST(nums, left, mid - 1);
        node.right = buildBST(nums, mid + 1, right);
        return node;
    }
}
