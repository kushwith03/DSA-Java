package BitManipulation;

public class XorOfRange {
    public static void findInRange() {
        int a = 4;
        int b = 7;
        int ans = findForN(a - 1) ^ findForN(b);
        System.out.println("XOR of numbers in range " + a + "-" + b + " : " + ans);

    }

    public static int findForN(int n) {
        if (n % 4 == 0) {
            return n;
        } else if (n % 4 == 1) {
            return 1;
        } else if (n % 4 == 2) {
            return n + 1;
        } else {
            return 0;
        }
    }
}
