package Recursion;

public class SumOfNNumbers {
    public static int sum(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sum(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(sum(10));
    }
}
