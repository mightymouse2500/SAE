package kontrollstrukturen;

import java.util.Scanner;

public class Schachbrett4 {

	public static void main(String[] args) {
		String[][] array = { {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"},{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26" } };

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number of rows you would like the chess board to have:");
		int requestedRows = sc.nextInt();
		System.out.println("Please enter the number of columns you would like the chess board to have:");
		int requestedColumns = sc.nextInt();
		sc.close();
		
		StringBuilder header = new StringBuilder("    ");
		StringBuilder separationLine = new StringBuilder("    ");
		
		for (int n = 0; n < requestedColumns; n++) {
			if (n < requestedColumns - 1) {
				header.append(array[0][n] + "   ");
				separationLine.append("____");
			} else {
				header.append(array[0][n] + " ");
				separationLine.append("__");
			}

		}
		
		System.out.println(header);
		System.out.println(separationLine);
		
		for (int i = 0; i < requestedRows; i++) {
			StringBuilder row = new StringBuilder(i+1 + ".| ");
			
			for (int j = 0; j < requestedColumns; j++) {
				if (j < array[0].length - 1) {
					row.append(array[0][j] + array[1][i] + "  ");
				} else {
					row.append(array[0][j] + array[1][i]);
				}
			}
			System.out.println(row);
			
		}

	}

}