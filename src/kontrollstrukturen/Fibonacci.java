package kontrollstrukturen;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		System.out.print("Geben Sie eine Ganzzahl ein: ");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		sc.close();
		
		int[] numbers;
		numbers = new int[input];
		numbers[0] = 1;
		numbers[1] = 1;
		System.out.println("Die Fibonacci-Reihe bis zur " + input + ". Stelle lautet:");
		
		for (int i = 0; i < (numbers.length - 2); i++) {
			
			numbers[i+2] = numbers[i+1] + numbers[i];

		}
		
		StringBuilder output = new StringBuilder();
		
		for (int i = 0; i < numbers.length; i++) {
			if (i < numbers.length - 1) {
				output.append(numbers[i] + "  ");
			} else {
				output.append(numbers[i]);
			}
		}
		
		System.out.println(output);
	}

}