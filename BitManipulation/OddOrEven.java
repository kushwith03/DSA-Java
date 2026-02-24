package BitManipulation;

public class OddOrEven {
    public static void check() {
        int n = 5;
        if ((n & 1) == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }
    }
}
