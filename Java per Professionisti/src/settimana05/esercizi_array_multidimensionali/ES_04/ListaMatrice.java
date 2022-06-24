package settimana05.esercizi_array_multidimensionali.ES_04;

import java.util.Arrays;

public class ListaMatrice {
	public static void main(String[] args) {
		int [] array = {1, 50, 100, 1, 20, 40};
		int n = 2;
		int m = 3;
		int [][] matrix = new int[n][m];
		
		buildArray(matrix, array);
		
		System.out.println(Arrays.toString(matrix[0]));
		System.out.println(Arrays.toString(matrix[1]));
	}
	
	public static void buildArray(int [][] input , int[] list){
		int z = 0;
		for (int i = 0; i < input.length; i++) {
			for (int j = 0; j < input[i].length; j++) {
				input[i][j] = list[z];
				z++;
			}
		}
	}
}
