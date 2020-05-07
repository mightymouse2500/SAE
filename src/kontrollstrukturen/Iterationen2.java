package kontrollstrukturen;

import java.util.Scanner;

public class Iterationen2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter int x");
		int x = sc.nextInt();
		sc.close();
		
		for (int i = x; i >= 1; i--) {
			System.out.println(i);
		}
		
	}

}