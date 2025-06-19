package BinarySearch;

public class NthRoot {
    public static void find() {
        int n = 125;
        int m = 3;
        int low = 1;
        int high = n;
        int mid;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (result(mid, m) == n) {
                System.out.println(m + " th root of " + n + " is : " + mid);
                return;
            } else if (result(mid, m) > n) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        System.out.println("Does not exist");
    }

    public static long result(int b, int exp) {
        long ans = 1;
        int last;
        long base = b;
        while (exp > 0) {
            last = (exp & 1);
            if (last == 1) {
                ans *= base;
            }
            base = base * base;
            exp = exp >> 1;
        }
        return ans;
    }

}
