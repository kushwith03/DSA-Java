package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        find(ans, list, candidates, 0, target);
        return ans;
    }

    public static void find(List<List<Integer>> ans, List<Integer> list, int[] array, int i, int target) {
        if (target < 0) {
            return;
        }
        if (i == array.length) {
            if (target == 0) {
                ans.add(new ArrayList<>(list));
                return;
            }
            return;
        }
        list.add(array[i]);
        find(ans, list, array, i, target - array[i]);
        list.remove(list.size() - 1);
        find(ans, list, array, i + 1, target);
        return;
    }
}
