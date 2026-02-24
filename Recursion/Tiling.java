package Recursion;

public class Tiling {
    public static int ways(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return ways(n - 1) + ways(n - 2);
    }

    public static void main(String[] args) {
        //Given a "2 x n" floor and tiles of size "2 x 1", count the number of
        //ways to tile the given floor using the 2 x 1 tiles.
        //(A tile can either be placed horizontally or vertically.)
        System.out.println(ways(10));
    }
}
