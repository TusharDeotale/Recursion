package lab;

import java.util.Scanner;

public class Prefix_Binary {
	public static void solve(int ones, int zeros, String output, int n) {
		if (n == 0) {
			System.out.println(output);
			return;
		}

		String op1 = output;
		op1 += "1";
		solve(ones + 1, zeros, op1, n - 1);

		if (ones > zeros) {
			String op2 = output;
			op2 += "0";
			solve(ones, zeros + 1, op2, n - 1);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int n = sc.nextInt();
		int ones = 0;
		int zeros = 0;
		String output = "";
		solve(ones, zeros, output, n);
	}

}
