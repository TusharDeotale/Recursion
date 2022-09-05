package lab;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Permuation {
	
	public static void subset(String output, String input, Set<String> ts) {
		
		if (input.length() == 0) {
			ts.add(output);
			return;
		}
		String output1 = output;
		String output2 = output;
		output2 += input.charAt(0);
		input = input.substring(1);
		subset(output1, input, ts);
		subset(output2, input, ts);
	}

	public static void main(String[] args) {
		Set<String> ts = new TreeSet<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string!");
		String input = sc.next();
		String output = "";
		subset(output, input, ts);
		ts.forEach(subsets -> System.out.print(subsets + " "));

	}

}
