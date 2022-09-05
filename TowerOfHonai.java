package lab;

import java.util.Scanner;

public class TowerOfHonai {
	static int count = 0;

	public static void solve(int n, int s, int d, int h) {
		count++;
		if (n == 1) {
			System.out.println("Moving plate " + n + " from " + s + " to " + d);
			return;
		}
		solve(n-1, s, h, d);
		System.out.println("Movint plate "+ n +" from "+ s + " to " + d);
		solve(n-1, h, d, s);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of disk");
		int n = sc.nextInt();

		int s = 1, h = 2, d = 3;

		solve(n, s, d, h);
		System.out.println("Number of swaping "+count);

	}

}
