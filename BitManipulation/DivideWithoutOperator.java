package BitManipulation;


public class DivideWithoutOperator {
    public static void find() {
        int a = 37;
        int b = 3;
        if (b == 0) {
            System.out.println("Division by zero is undefined.");
            return;
        }
        int divident = Math.abs(a);
        int divisor = Math.abs(b);
        long ans = 0;
        int count;
        while (divident >= divisor) {
            count = 0;
            while (divident >= (divisor << (count + 1))) {
                count++;
            }
            ans += (1 << count);
            divident -= (divisor << count);
        }
        if ((a < 0 && b > 0) || (a > 0 && b < 0)) {
            ans = -ans;
        }
        System.out.println(a + "/" + b + " gives ");
        System.out.println("Quotient : " + ans);
        System.out.println("Remainder : " + divident);

    }
}
