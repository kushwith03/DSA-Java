package Backtracking;

import java.util.ArrayList;

public class SubSequenceArrays {
    public static void subSquence(ArrayList<Integer> list, int[] array, int i) {
        if (i == array.length) {
            System.out.println(list);
            return;
        }
        list.add(array[i]);
        subSquence(list, array, i + 1);
        list.remove(list.size() - 1);
        subSquence(list, array, i + 1);
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        ArrayList<Integer> list = new ArrayList<>();
        subSquence(list, array, 0);
    }
}
