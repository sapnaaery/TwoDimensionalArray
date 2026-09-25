package day7;

public class TwoDimensionalArrays {

	public static void main(String[] args) {
		// Declare and initialize 2-dimensional arrays

		int matrix[][] = { { 10, 20, 13 }, { 12, 30, 25 }, { 56, 8, 31 }, { 5, 70, 43 } };

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}

	}

}
