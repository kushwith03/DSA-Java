package BitManipulation;

import java.util.ArrayList;

public class Subsets {
    public static void subjets() {
        int[] nums = {1, 2, 3};
        int total = 1 << nums.length;
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < total; i++) {
            ArrayList<Integer> cur = new ArrayList<>();
            for (int j = 0; j < nums.length; j++) {
                if ((i & (1 << j)) != 0) {
                    cur.add(nums[j]);
                }
            }
            ans.add(cur);
        }
        System.out.println("All subsets : ");
        System.out.println(ans);
    }
}
