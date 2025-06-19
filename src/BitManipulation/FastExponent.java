package BitManipulation;

public class FastExponent {
    public static void find() {
        int n = 5;
        int p = 3;
        int ans = 1;
        int pow = p;
        int temp = n;
        while (pow > 0) {
            if ((pow & 1) == 1) {
                ans = ans * temp;
            }
            temp = temp * temp;
            pow = pow >> 1;

        }
        System.out.println(n + " to the power " + p + " is :" + ans);
    }
}
