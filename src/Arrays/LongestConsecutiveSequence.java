package Arrays;

import java.util.Arrays;
import java.util.HashSet;

public class LongestConsecutiveSequence {
    public static void bruteForce() {
        int[] array = {102, 4, 100, 1, 101, 3, 2, 1, 1};
        int cur;
        int x;
        int mLen = 0;
        for (int i = 0; i < array.length; i++) {
            cur = array[i];
            x = 1;
            while (ls(array, cur + 1)) {
                cur++;
                x++;
            }
            mLen = Math.max(x, mLen);
        }
        System.out.println("Length of longest consecutive sequence : " + mLen);
    }

    public static boolean ls(int[] array, int k) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == k) {
                return true;
            }
        }
        return false;
    }

    public static void better() {
        int[] array = {102, 4, 100, 1, 101, 3, 2, 1, 1};
        Arrays.sort(array);
        int lastSmallest = Integer.MIN_VALUE;
        int cnt = 1;
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] - 1 == lastSmallest) {
                cnt++;
                max = Math.max(cnt, max);
            } else if (array[i] != lastSmallest) {

                cnt = 1;
            }
            lastSmallest = array[i];
        }
        System.out.println("Length of longest consecutive sequence : " + max);
    }

    public static void optimal() {
        int[] array = {102, 4, 100, 1, 101, 3, 2, 1, 1};
        HashSet<Integer> set = new HashSet<>();
        int maxLen = 0;
        for (int i = 0; i < array.length; i++) {
            set.add(array[i]);
        }
        for (int num : set) {
            if (!set.contains(num - 1)) {
                int cur = num;
                int len = 1;
                while (set.contains(cur + 1)) {
                    cur++;
                    len++;
                }
                maxLen = Math.max(maxLen, len);
            }
        }
        System.out.println("Length of longest consecutive sequence : " + maxLen);

    }
}
