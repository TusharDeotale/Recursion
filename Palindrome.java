package lab;

import java.util.Scanner;

public class Palindrome {

	public static boolean isPalindrome(String s, int i, int j) {
		if (i >= j) {
			return true;
		}
		if (s.charAt(i) != s.charAt(j)) {
			return false;
		}
		return isPalindrome(s, i + 1, j - 1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String s = sc.next();
		if (isPalindrome(s, 0, s.length() - 1)) {
			System.out.println("Palindrome.");
		} else {
			System.out.println("Not a Palindrome.");
		}
	}
}
