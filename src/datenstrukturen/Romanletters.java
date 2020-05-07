package datenstrukturen;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Romanletters {
	
	public static String convertToArabic(String input) {
		return roman2decimal(checkValidity(input));
	}
	
	// map roman numbers to arabic numbers
	private static final Map<Character, Integer> ROMANNUMBERS_MAP = new HashMap<>();

	static
	{
		// 65-90 A-Z
		ROMANNUMBERS_MAP.put( (char) 77, 1000 );
		ROMANNUMBERS_MAP.put( (char) 68, 500 );
		ROMANNUMBERS_MAP.put( (char) 67, 100 );
		ROMANNUMBERS_MAP.put( (char) 76, 50 );
		ROMANNUMBERS_MAP.put( (char) 88, 10 );
		ROMANNUMBERS_MAP.put( (char) 86, 5 );
		ROMANNUMBERS_MAP.put( (char) 73, 1 );
	}
	
	// convert roman numbers input to arabic numbers
	private static String roman2decimal(String input) {
		if ( input.equals("The entered input contains illegal values.") || input.equals("The entered input contains illegal expressions.") ) {
			return input;
		}
		
		char[] inputArray = input.toCharArray();
		int[] output = new int[inputArray.length];
		
		for (int i = 0; i < inputArray.length; i++) {
			output[i] = ROMANNUMBERS_MAP.get(inputArray[i]);
		}
		
		// the algorithm doesn't work as intended
		int arabic = 0;
		
		for (int i = 1; i < output.length; i++) {
			if (output[i] > output[i-1]) {
				output[i] -= output[i-1];
			} else if (output[i] <= output[i-1]) {
				arabic += output[i-1];
			}
		}
		
		arabic += output[output.length - 1];	// guess what, I don't need to use ArrayList here.

		return String.valueOf(arabic);
	}
	
	// check input validity, throw error if mismatched
	private static String checkValidity(String input) {
		// for illegal values
		char[] romans = input.toCharArray();
		
		
		for ( int i = 0; i < romans.length; i++ ) {
			boolean isValid = false;
			for ( Character key : ROMANNUMBERS_MAP.keySet() ) {
			    if ( romans[i] == key ) {
			    	isValid = true;
			    }
			}
			
			if ( !isValid ) {
		    	input = "The entered input contains illegal values.";
		    }

		}
		
		// for illegal expressions
		if ( romans.length > 3 ) {
			for ( int i = 0; i <= romans.length - 4; i++ ) {
				char[] check = Arrays.copyOfRange( romans, i, i+4 );
				if ( (check[0] == check[1]) && (check[0] == check[2]) && (check[0] == check[3]) ) {
					input = "The entered input contains illegal expressions.";
				}
			}
		}
		
		// NOTE: What if the order of characters is wrong, say like VX or VXIMD?
		
		return input;
	}

	// tests functionality of Romanletters
	public static void main(String[] args) {
		
		String[] testInputs = { "I", "V", "X", "L", "C", "D", "M", "XIV", "XXII", "XXXIX", "XLVIII", "XCIX", "MMMDCCXCIV", "IIII", "B" };
		String[] expect = { "1", "5", "10", "50", "100", "500", "1000", "14", "22", "39", "48", "99", "3794", "The entered input contains illegal expressions.", "The entered input contains illegal values." };
			
		for ( int i = 0; i < testInputs.length; i++ ) {
			if ( expect[i].equals( Romanletters.convertToArabic( testInputs[i] ) ) ) {
				System.out.println("Test successful for: " + testInputs[i] + ", received: " + Romanletters.convertToArabic(testInputs[i]));
			} else {
				System.out.println("Expected " + testInputs[i] + " to equal " + expect[i] );
				System.out.println("However the result received was " + Romanletters.convertToArabic(testInputs[i]));
			}
		}
	}
}
