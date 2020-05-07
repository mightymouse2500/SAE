package einfuehrung;

import java.util.Scanner;

public class Quader {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length");
		double length = sc.nextDouble();
		System.out.println("Enter width");
		double width = sc.nextDouble();
		System.out.println("Enter height");
		double height = sc.nextDouble();
		sc.close();
		
		double result = length * width * height;
		System.out.println("Volume is: " + length + "cm * " + width + "cm * " + height + "cm = " + result + "cm^3");

	}

}