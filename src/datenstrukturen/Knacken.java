package datenstrukturen;

import java.util.Random;
import java.util.Scanner;

public class Knacken {
	
	// generates random knacks to a string
	private static String createKnack(String in) {
		String knack = " KNACK ";
		String out = new String();
		
		Random rng = new Random(); //NOSONAR
		
		for (int i = 0; i < in.length(); i++) {
			// insert characters from "in" to "out"
			out += in.charAt(i);
			if (rng.nextInt(2) == 1) {
				out += knack;
			}
		}
		
		return out;
	}
	
	// hi-fi remaster a string by removing all the horrible knacking
	private static String remasterHd(String in) {
		return in.replace(" KNACK ", "");
	}
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

		System.out.println("Enter any sequence of characters:");
		String input = sc.nextLine();
		
		input = createKnack(input);
		System.out.println("This transmission is straight from the 90's: " + input);
		
		input = remasterHd(input);
        System.out.println("I remastered the recording, it's converted to super hi-fi sound now: " + input);
        
        sc.close();
	}

}
