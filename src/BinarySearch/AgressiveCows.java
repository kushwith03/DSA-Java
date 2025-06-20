package BinarySearch;

import java.util.Arrays;

public class AgressiveCows {
    public int maxDistance() {
        int[] position = {1, 2, 3, 4, 7};
        int m = 3;
        Arrays.sort(position);
        int low = 1;
        int high = position[position.length - 1] - position[0];
        int mid;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (valid(position, m, mid)) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return high;

    }

    public static boolean valid(int[] position, int m, int mid) {
        int count = 1;
        int lastMagnet = position[0];
        for (int i = 1; i < position.length; i++) {
            if ((position[i] - lastMagnet) >= mid) {
                lastMagnet = position[i];
                count++;
                if (count >= m) {
                    return true;
                }
            }
        }
        return false;
    }
}
