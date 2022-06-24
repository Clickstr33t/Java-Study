package settimana05.esercizi_array_multidimensionali.ES_03;

public class Trasposta {
	public static void main(String[] args) {
		int [][] matrix = {
				{1,2},
				{3,4},
				{5,6}
		};
		printMatrix(matrix);

	}
	
	public static void printMatrix(int [][] input) {
		for (int i = 0; i < input[0].length; i++) {
			System.out.print("[ ");
			for (int j = 0; j < input.length; j++) {
				System.out.print(input[j][i]+" ");
			}
		System.out.print("]\n");
		}

	}

}
