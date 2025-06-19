package Recursion;

public class PrintNumber {
    public static void printDecreasing(int n) {
        if (n == 0) {
            return;
        }
        System.out.print(n + " ");
        printDecreasing(n - 1);
    }

    public static void printIncreasing(int n) {
        if (n == 0) {
            return;
        }
        printIncreasing(n - 1);
        System.out.print(n + " ");
    }


    public static void main(String[] args) {

    }
}
