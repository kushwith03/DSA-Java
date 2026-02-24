package BinaryTrees;

import java.util.ArrayList;
import java.util.List;

public class PathSumII {
    public List<Integer> currList = new ArrayList<>();

    public void helper(TreeUtils.TreeNode root, int targetSum, List<List<Integer>> list) {
        if (root == null) {
            return;
        }
        currList.add(root.data);
        if (root.left == null && root.right == null && targetSum == root.data) {
            list.add(new ArrayList<>(currList));
        }
        helper(root.left, targetSum - root.data, list);
        helper(root.right, targetSum - root.data, list);
        currList.remove(currList.size() - 1);
    }

    public List<List<Integer>> pathSum(TreeUtils.TreeNode root, int targetSum) {
        List<List<Integer>> list = new ArrayList<>();
        helper(root, targetSum, list);
        return list;
    }
}
