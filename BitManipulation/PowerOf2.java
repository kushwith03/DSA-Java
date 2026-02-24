package BitManipulation;

public class PowerOf2 {
    public static void check() {
        int n = 14;
        if (n > 0 && (n & (n - 1)) == 0) {
            System.out.println(n + " is power of 2");
        } else {
            System.out.println(n + " is not power of 2");
        }
    }
}
