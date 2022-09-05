package lab;

import java.util.Scanner;
import java.util.Vector;

public class Balanced_Paranthesis {
	public static void solve(int open, int close, String output, Vector<String> v){
		if(open == 0 && close == 0) {
			v.add(output);
			return;
		}
		
		if(open != 0) {
			String op = output;
			op += "(";
			solve(open - 1, close, op, v);
		}
		if(close > open) {
			String op = output;
			op += ")";
			solve(open, close - 1, op, v);
		}
		
	}

	public static void main(String[] args) {
		Vector<String> v = new Vector<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number for paranthesis.");
		int n = sc.nextInt();
		int open = n;
		int close = n;
		String output = "";
		solve(open, close, output, v);
		v.forEach(paranthesis -> System.out.println(paranthesis + "\n"));

	}

}
