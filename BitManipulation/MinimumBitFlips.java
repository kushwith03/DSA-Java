package BitManipulation;

public class MinimumBitFlips {
    public static void minBitFlips() {
        int start = 10;
        int goal = 7;
        int xor = start ^ goal;
        int count = 0;
        while (xor > 0) {
            xor = xor & (xor - 1);
            count++;
        }
        System.out.println("Start in Binary : " + Integer.toBinaryString(start));
        System.out.println("Goal in Binary : " + Integer.toBinaryString(goal));
        System.out.println("Number of bits to be changed : " + count);
    }
}
