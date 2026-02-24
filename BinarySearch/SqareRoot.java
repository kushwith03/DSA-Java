package BinarySearch;

public class SqareRoot {
    public static void find() {
        int n = 27;
        int low = 0;
        int high = 25;
        int mid;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (mid * mid <= n) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        if ((high * high) == n) {
            System.out.println("Square root of " + n + " is : " + high);
            return;
        } else {
            double dlow = high;
            double dhigh = low;
            double dmid;
            while (dlow <= dhigh) {
                dmid = dlow + (dhigh - dlow) / 2;
                if ((dmid * dmid) <= n) {
                    dlow = dmid + 0.001;
                } else {
                    dhigh = dmid - 0.001;
                }
            }
            System.out.printf("Square root of %d is : %.4f\n", n, dhigh);
        }


    }
}
