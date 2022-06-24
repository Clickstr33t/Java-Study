package settimana05.esercizi_array_multidimensionali.ES_01;

public class StampaMatrice {
	public static void main(String[] args) {
		int  [][] matrix = {{3, 5, 7} ,{8, 4, 1}};
		printMatrix(matrix);
		
	}
	
	public static void printMatrix(int [][] input) {
		for (int i = 0; i < input.length; i++) {
			for (int j = 0; j < input[i].length; j++) {
				System.out.print(input[i][j]+" ");
			}
			System.out.print("\n");
		}
	}

}
