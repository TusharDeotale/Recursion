package lab;

import java.util.Scanner;

public class Permuation_Case_Change {
	public static void solve(String input, String output) {
		if(input.length() == 0) {
			System.out.println(output);
			return;
		}
		
		String output1 = output;
		String output2 = output;
		output1 += input.charAt(0);
		output2 += input.toUpperCase().charAt(0);
		
		input = input.substring(1);
		
		solve(input, output1);
		solve(input, output2);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any String");
		String input = sc.next();
		String output = "";
		solve(input, output);
	}

}
