package Strings;

import java.util.Scanner;

public class Basic {
    public static void printLetters(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first name : ");
        String firstName = sc.next();
        System.out.println("Hello " + firstName);
        System.out.print("Enter your last name : ");
        String lastName = sc.next();
        String fullName = firstName + " " + lastName;
        System.out.println("Your full name : " + fullName);

        System.out.println("Length of full name : " + fullName.length());
        System.out.println("Letters of your name : ");
        printLetters(fullName);
        //SubString str.substring(si,ei)
        //Campare str1.compareTo(str2)
        StringBuilder sb = new StringBuilder(fullName);
        System.out.println(sb);

    }
}
