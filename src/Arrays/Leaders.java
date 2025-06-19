package Arrays;

import java.util.ArrayList;

public class Leaders {
    public static void bruteForce() {
        int[] array = {10, 22, 12, 3, 0, 6};
        ArrayList<Integer> ans = new ArrayList<>();
        int leader;
        for (int i = 0; i < array.length; i++) {
            leader = array[i];
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] > leader) {
                    leader = -1;
                }
            }
            if (leader != -1) {
                ans.add(leader);
            }
        }
        System.out.println(ans);
    }

    public static void optimal() {
        int[] array = {10, 22, 12, 3, 0, 6};
        ArrayList<Integer> ans = new ArrayList<>();
        int leader = Integer.MIN_VALUE;
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] > leader) {
                leader = array[i];
                ans.add(0, leader);
            }
        }
        System.out.println(ans);
    }
}
