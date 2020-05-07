package kontrollstrukturen;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		System.out.print("Geben Sie eine Ganzzahl ein: ");
		
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		sc.close();
		
		int factorial = 1;
		
		for (int i = 1; i <= number; i++) {
			factorial = factorial * i;
		}

		System.out.println("Die Fakultät von " + number + " ist " + factorial);
		

	}

}