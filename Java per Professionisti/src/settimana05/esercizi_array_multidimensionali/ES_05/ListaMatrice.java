package settimana05.esercizi_array_multidimensionali.ES_05;

import java.util.Arrays;

public class ListaMatrice {
	public static void main(String[] args) {
		int [] array = {1, 50, 100, 1, 20, 40};
		int n = 2;
		int m = 3;
		int [][] matrix = new int[n][m];
		int [] R = new int [n];
		int [] C = new int [m];
		
		buildArray(matrix, array);
		
		System.out.println(Arrays.toString(matrix[0]));
		System.out.println(Arrays.toString(matrix[1]));
		
		createArray(matrix, R, C);
		System.out.println(Arrays.toString(R));
		System.out.println(Arrays.toString(C));
		
		
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
	
	public static void createArray(int [][] input, int[] sommaRighe, int [] sommaColonne) {
		for (int i = 0; i < input.length; i++) {
			for (int j = 0; j < input[i].length; j++) {
				sommaRighe[i] += input[i][j];
			}
		}
		
		for (int i = 0; i < input[0].length; i++) {
			for (int j = 0; j < input.length; j++) {
				sommaColonne[i] += input[j][i];
			}
		}
		
	}
}
