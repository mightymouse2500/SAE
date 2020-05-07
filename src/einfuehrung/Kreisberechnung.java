package einfuehrung;

import java.util.Scanner;

public class Kreisberechnung {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter circle radius in cm");
		double rad = sc.nextDouble();
		sc.close();
		
		double perimeter = 2 * Math.PI * rad;
		double area = Math.PI * rad * rad;
		
		System.out.println("Perimeter is: " + perimeter + " cm");
		System.out.println("Area is: " + area + " qcm");
		
	}

}