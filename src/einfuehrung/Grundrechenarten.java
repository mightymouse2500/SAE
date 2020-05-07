package einfuehrung;

import java.util.Scanner;

public class Grundrechenarten {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int number1 = sc.nextInt();
		System.out.println("Enter second number");
		int number2 = sc.nextInt();
		sc.close();
		
		int addition = number1 + number2;
		System.out.println(number1 + " + " + number2 + " = " + addition);
		
		int subtraktion = number1 - number2;
		System.out.println(number1 + " - " + number2 + " = " + subtraktion);
		
		int multiplikation = number1 * number2;
		System.out.println(number1 + " * " + number2 + " = " + multiplikation);
		
		int division = number1 / number2;
		System.out.println(number1 + " / " + number2 + " = " + division);

	}

}