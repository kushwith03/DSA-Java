package BinarySearch;

public class MakeBouquets {
    public static void minDays() {
        int[] bloomDay = {7, 7, 7, 7, 12, 7, 7};
        int m = 2;
        int k = 3;
        if (bloomDay.length < m * k) {
            System.out.println("It is not possible to make " + m + " bouquets");
            return;
        }
        int max = bloomDay[0];
        int min = bloomDay[0];
        for (int i = 0; i < bloomDay.length; i++) {
            max = Math.max(max, bloomDay[i]);
            min = Math.min(min, bloomDay[i]);
        }
        int low = min;
        int high = max;
        int mid;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (findBouquets(bloomDay, k, mid) >= m) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        System.out.println("Minimum number of days required to make " + m + " bouquets is " + low);
    }

    public static int findBouquets(int[] array, int k, int val) {
        int count = 0;
        int ans = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] <= val) {
                count++;
                if (count == k) {
                    ans++;
                    count = 0;
                }
            } else {
                count = 0;
            }
        }
        return ans;
    }


}
