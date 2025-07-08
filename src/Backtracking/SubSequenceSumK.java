package Backtracking;

import java.util.ArrayList;

public class SubSequenceSumK {
    public static void sumK(ArrayList<Integer> list, int[] array, int curSum, int i, int target) {
        if (i == array.length) {
            if (curSum == target) {
                System.out.println(list);
            }
            return;
        }
        list.add(array[i]);
        sumK(list, array, curSum + array[i], i + 1, target);
        list.remove(list.size() - 1);
        sumK(list, array, curSum, i + 1, target);
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 1};
        int target = 2;
        ArrayList<Integer> list = new ArrayList<>();
        sumK(list, array, 0, 0, target);
    }
}
