package Recursion;

public class NumberToWords {
    public static void printInWords(int n, String[] words) {
        if (n == 0) {
            return;
        }

        printInWords(n / 10, words);
        System.out.print(words[n % 10] + " ");
    }

    public static void main(String[] args) {
        int n = 2134;
        String[] words = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        printInWords(n, words);
    }
}
