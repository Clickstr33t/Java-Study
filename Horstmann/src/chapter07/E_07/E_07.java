package chapter07.E_07;

import java.util.Arrays;

/*
 * Scrivete un programma che legga una sequenza di numeri interi, 
 * memorizzandola in un array, e ne inverta l'ordine. 
 * Per esempio, se il programma viene eseguito fornendo questi dati: 
 * 
 * 1 4 9 16  9 7 4 9 11
 */

public class E_07 {
	public static void main (String[] args) {
		int [] array = {1, 4, 9,16, 9, 7, 4, 9, 11};
		System.out.println(Arrays.toString(array));
		for(int i = 0; i < array.length/2; i++) {
			int temp = array[i];
			array[i] = array[array.length-1-i];
			array[array.length-1-i]=temp;
		}
		System.out.println(Arrays.toString(array));
	}
}
