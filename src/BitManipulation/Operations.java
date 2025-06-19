package BitManipulation;

public class Operations {
    public static int getIthBit(int n, int i) {
        if ((n & (1 << i)) == 0) {
            return 0;
        }
        return 1;
    }

    public static int setIthBit(int n, int i) {
        return n | (1 << i);
    }

    public static int clearIthBit(int n, int i) {
        return n & ~(1 << i);
    }

    public static int updateIthBit(int n, int i, int val) {
        if (val == 0) {
            return clearIthBit(n, i);
        } else {
            return setIthBit(n, i);
        }
    }

    public static int clearLastIBits(int n, int i) {
        return n & (~0 << i);
    }

    public static int clearRange(int n, int i, int j) {
        int a = (~0) << j + 1;
        int b = (1 << i) - 1;
        return n & (a | b);
    }

    public static int countSetBits(int n) {
        int count = 0;
        while (n > 0) {
            count += (n & 1);
            n = n >> 1;
        }
        return count;
    }
}
