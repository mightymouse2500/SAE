package kontrollstrukturen;

public class Schachbrett2 {

	public static void main(String[] args) {
		String[][] array = { {"a", "b", "c", "d", "e", "f", "g", "h" },{"1", "2", "3", "4", "5", "6", "7", "8" } };
		
		for (int i = 0; i < array[1].length; i++) {
			StringBuilder row = new StringBuilder();
			
			for (int j = 0; j < array[0].length; j++) {
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