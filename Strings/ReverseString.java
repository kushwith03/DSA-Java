package Strings;

import java.util.Arrays;

public class ReverseString {
    public static void reverse() {
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        System.out.println("Original string :" + Arrays.toString(s));
        int start = 0;
        int end = s.length - 1;
        char temp;
        while (start < end) {
            temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }
        System.out.println("Reversed string :" + Arrays.toString(s));
    }
}
