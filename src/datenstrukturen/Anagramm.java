package datenstrukturen;

import java.util.Arrays;
import java.util.Scanner;

public class Anagramm {
	
	// check and delete special symbols like : ; , .
	private static String deleteSymbols(String input) {
		return input.replaceAll("[\\W]", "");
	}
	
	// order the strings to char[] arrays compare them for equality
	private static char[] sortString(String input) {
		input = deleteSymbols(input);
		input = input.toLowerCase();
		
		char[] output = input.toCharArray();
		
		Arrays.sort(output);
		
		return output;
	}
	// compare equality of both char[] arrays
	private static String checkForAnagrams(String first, String second) {
		char[] firstArray = sortString(first);
		char[] secondArray = sortString(second);
		
		if (Arrays.equals(firstArray, secondArray)) {
			return "The strings are anagrams! :)";
		} else {
			return "The strings are not anagrams :(";
		}
	}
	
	// main method
	public static void main(String[] args) {
		// receive user input
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the first word or sentence:");
		String firstString = sc.nextLine();
		
		System.out.println("Please enter the second word or sentence:");
		String secondString = sc.nextLine();
		
		sc.close();
		
		System.out.println(checkForAnagrams(firstString, secondString));
	}

}
