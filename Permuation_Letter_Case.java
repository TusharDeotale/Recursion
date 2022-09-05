package lab;

import java.util.Scanner;

public class Permuation_Letter_Case {
	
	public static void solve(String input, String output) {
		if(input.length() == 0) {
			System.out.println(output);
			return;
		}
		if(!Character.isDigit(input.charAt(0))) {
			String output1 = output;
			String output2 = output;
			
			output1 += input.toLowerCase().charAt(0);
			output2 += input.toUpperCase().charAt(0);
			
			input = input.substring(1);
			solve(input, output1);
			solve(input, output2);
		}
		else {
			String output1 = output;
			output1 += input.charAt(0);
			input = input.substring(1);
			solve(input, output1);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any string");
		String input = sc.next();
		String output = "";
		solve(input, output);
	}

}
