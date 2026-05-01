package Recursion;

import java.util.List;

public class PrintAllSubsets {

	public static void main(String[] args) {
		
		String input = "abc";
		String output = " ";
		generateAllSubsets(input, output);

	}
	
	static void generateAllSubsets(String input, String output) { 
		
		if(input.length()==0 || input.isEmpty()) {
			System.out.println("output is " + output);
			return;
		}
		
		char ch = input.charAt(0);
		String remaining = input.substring(1);
		generateAllSubsets(remaining, output);
		generateAllSubsets(remaining, output+ch);

	}

}
