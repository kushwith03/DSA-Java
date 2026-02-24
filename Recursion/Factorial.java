package Recursion;

public class Factorial {
    public static int find(int n) {
        if (n == 0) {
            return 1;
        }
        return n * find(n - 1);
    }

    public static int finding(int n) {
        System.out.println("Calling find(" + n + ")");
        if (n == 0) {
            return 1;
        }
        int result = n * find(n - 1);
        System.out.println("Returning " + result + " for find(" + n + ")");
        return result;
    }


    public static void main(String[] args) {
        System.out.println(finding(5));
    }
}
