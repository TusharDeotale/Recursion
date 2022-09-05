package lab;

import java.util.Scanner;
import java.util.Vector;

public class JosephusProblem {
	public static void solve(int k, Vector<Integer> v, int index) {
		if (v.size() == 1) {
			System.out.println("Person has to suicide is " + v.get(0) + "th.");
			return;
		}
		index = (index + k) % v.size();
		v.remove(index);
		solve(k, v, index);
	}

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of person");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			v.add(i);
		}
		System.out.println("Enter Kth person to be killed");
		int k = sc.nextInt();
		int index = 0;
		solve(k - 1, v, index);
	}

}
