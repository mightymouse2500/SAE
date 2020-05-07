package kontrollstrukturen;

import java.util.Scanner;

public class Iterationen1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter int x");
		int x = sc.nextInt();
		sc.close();
		
		for (int i = 1; i <= x; i++) {
			System.out.println(i);
		}
		
	}

}