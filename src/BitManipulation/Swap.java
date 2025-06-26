package BitManipulation;

public class Swap {
    public static void swap() {
        int a = 10;
        int b = 15;
        System.out.println("Value of a : " + a);
        System.out.println("Value of b : " + b);
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("After swapping ");
        System.out.println("Value of a : " + a);
        System.out.println("Value of b : " + b);

    }
}
