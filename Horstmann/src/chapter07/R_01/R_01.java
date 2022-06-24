package chapter07.R_01;

import java.util.Arrays;

public class R_01 {
	public static void main(String[] args) {
		
		//Dichiarare un array predisposto per contenere dieci numeri interi.
		int [] array = new int[10];
		
		// Inseririre il numero 17 all'inizio dell'array
		array[0] = 17;
		
		System.out.println(Arrays.toString(array));
		
		// Inserire il numero 29 
		
		array[array.length-1] = 29;
		
		System.out.println(Arrays.toString(array));
		
		// Assegnate -1 a tutti gli altri
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] == 0) {
				array[i] = -1;
			}
		}
		System.out.println(Arrays.toString(array));
		
		// Aggiungere 1 a tutti gli elementi dell'array
		
		for (int i = 0; i < array.length; i++) {
			array[i] ++;
		}
		
		System.out.println(Arrays.toString(array));
		
		// Visualizza tutti gli elementi dell'array 1 per riga
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
		// Visualizza tutti gli elementi in una riga separati da una virgola
		
		for (int i = 0; i < array.length; i++) {
			if (i == array.length-1) {
				System.out.print(array[i]);
			} else {
				System.out.print(array[i] + ", ");
			}
		}
	}

}
