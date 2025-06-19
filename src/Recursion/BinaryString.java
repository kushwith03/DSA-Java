package Recursion;

public class BinaryString {
    public static void find(String str, int n, int i, char last) {
        if (i == n) {
            System.out.println(str);
            return;
        }
        find(str + "0", n, i + 1, '0');
        if (last == '0') {
            find(str + "1", n, i + 1, '1');

        }
    }

    public static void main(String[] args) {
        //Print all binary strings of size N without consecutive ones.
        find("", 3, 0, '0');
    }
}
