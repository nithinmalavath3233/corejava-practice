package com.javavcube.loops;
import java.util.Scanner;
public class PallindromeNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int n = sc.nextInt();

        if (isPallindrome(n)) {
            System.out.println(n + " is a palindrome number");
        } else {
            System.out.println(n + " is not a palindrome number");
        }

        sc.close();
    }

    private static boolean isPallindrome(int n) {

        int original = n;
        int rev = 0;
        int r = 0;

        while (n > 0) {
            r = n % 10;
            n = n / 10;
            rev = rev * 10 + r;
        }

        return original == rev;
	}

}
