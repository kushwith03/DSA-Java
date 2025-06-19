package Recursion;

public class TowerOfHanoi {
    public static void solve(int n, char s, char h, char d) {
        if (n == 1) {
            System.out.println("Move disk " + n + " from " + s + " to " + d);
            return;
        }
        solve(n - 1, s, d, h);
        System.out.println("Move disk " + n + " from " + s + " to " + d);
        solve(n - 1, h, s, d);

    }

    public static void main(String[] args) {
        solve(3, 'A', 'B', 'C');
    }
}
