package einfuehrung;

import java.util.Scanner;

public class Verbrauchswerte {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter liters used");
		double liter = sc.nextDouble();
		System.out.println("Enter kilometers driven");
		double kilometer = sc.nextDouble();
		sc.close();
		
		double proportion = kilometer / 100;
		double usage = liter / proportion;
		
		System.out.println("Usage is: " + usage + " l/100kms");

	}

}