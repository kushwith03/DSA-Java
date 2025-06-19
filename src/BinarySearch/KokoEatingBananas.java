package BinarySearch;

public class KokoEatingBananas {
    public static void findMinEatingSpeed() {
        int[] piles = {3, 6, 7, 11};
        int h = 8;
        int max = 0;
        for (int i = 0; i < piles.length; i++) {
            max = Math.max(max, piles[i]);
        }
        int low = 1;
        int high = max;
        int mid;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (speed(piles, mid) <= h) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        System.out.println("Minimum eating speed of koko should be " + low);

    }

    public static int speed(int[] piles, int s) {
        int hrs = 0;
        for (int i = 0; i < piles.length; i++) {
            hrs += Math.ceil((double) piles[i] / s);
        }
        return hrs;
    }
}
