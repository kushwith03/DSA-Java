package Recursion;

public class Power {
    public static int find(int n, int m) {
        if (m == 0) {
            return 1;
        }
        return n * find(n, m - 1);
    }

    public static int optimised(int n, int m) {
        if (m == 0) {
            return 1;
        }
        int halfPow = optimised(n, m / 2);
        int halfPowSq = halfPow * halfPow;
        if (m % 2 == 1) {
            halfPowSq = halfPowSq * n;
        }
        return halfPowSq;
    }

    public static void main(String[] args) {
        System.out.println(optimised(2, 10));
    }
}
