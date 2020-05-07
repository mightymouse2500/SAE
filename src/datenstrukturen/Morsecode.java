package datenstrukturen;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Morsecode {

	private static final Map<String, Character> MORSECODE_MAP = new HashMap<>();

	static 
	{
		// 48-57 0-9
		// 65-90 A-Z
		MORSECODE_MAP.put( "-----",	(char) 48);
		MORSECODE_MAP.put( ".----",	(char) 49);
		MORSECODE_MAP.put( "..---",	(char) 50);
		MORSECODE_MAP.put( "...--",	(char) 51);
		MORSECODE_MAP.put( "....-",	(char) 52);
		MORSECODE_MAP.put( ".....",	(char) 53);
		MORSECODE_MAP.put( "-....",	(char) 54);
		MORSECODE_MAP.put( "--...",	(char) 55);
		MORSECODE_MAP.put( "---..",	(char) 56);
		MORSECODE_MAP.put( "----.",	(char) 57);
		MORSECODE_MAP.put( ".-",	(char) 65);
		MORSECODE_MAP.put( "-...",	(char) 66);
		MORSECODE_MAP.put( "-.-.",	(char) 67);
		MORSECODE_MAP.put( "-..",	(char) 68);
		MORSECODE_MAP.put( ".",		(char) 69);
		MORSECODE_MAP.put( "..-.",	(char) 70);
		MORSECODE_MAP.put( "--.",	(char) 71);
		MORSECODE_MAP.put( "....",	(char) 72);
		MORSECODE_MAP.put( "..",	(char) 73);
		MORSECODE_MAP.put( ".---",	(char) 74);
		MORSECODE_MAP.put( "-.-",	(char) 75);
		MORSECODE_MAP.put( ".-..",	(char) 76);
		MORSECODE_MAP.put( "--",	(char) 77);
		MORSECODE_MAP.put( "-.",	(char) 78);
		MORSECODE_MAP.put( "---",	(char) 79);
		MORSECODE_MAP.put( ".--.",	(char) 80);
		MORSECODE_MAP.put( "--.-",	(char) 81);
		MORSECODE_MAP.put( ".-.",	(char) 82);
		MORSECODE_MAP.put( "...",	(char) 83);
		MORSECODE_MAP.put( "-",		(char) 84);
		MORSECODE_MAP.put( "..-",	(char) 85);
		MORSECODE_MAP.put( "...-",	(char) 86);
		MORSECODE_MAP.put( ".-",	(char) 87);
		MORSECODE_MAP.put( "-..-",	(char) 88);
		MORSECODE_MAP.put( "-.-",	(char) 89);
		MORSECODE_MAP.put( "--..",	(char) 90);
	}
	
	// converts morse code into a string
	private static void translateMorse(String morse) {
		String[] letters = morse.split(" ", 0);
		StringBuilder output = new StringBuilder();
		
		// now fill the array with the characters, delimit morse with space
		for (int i = 0; i < letters.length; i++) {
			output.append(MORSECODE_MAP.get(letters[i]));
		}
		
		System.out.println(output.toString());
	}
	
	public static void main(String[] args) {
		// generates a string input through console
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a morse code sequence. Split characters by using space:");
		String input = sc.nextLine();
		
		translateMorse(input);

		sc.close();

	}

}
