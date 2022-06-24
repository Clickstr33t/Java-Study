package chapter07.E_09;

import java.util.Arrays;

/*
 * Scrivete un metodo che implementi l'algoritmo sviluppato nel paragrafo 7.5
 */

public class E_09 {
	public static void main (String[] args) {
		int [] array = {1,2,3,4,5,6,7,8,9,10};
		System.out.println(Arrays.toString(array));
		if (array.length % 2 == 0) {
			for (int i = 0; i < array.length/2; i++) {
				int temp = array[i];
				array[i] = array[array.length/2 + i];
				array [array.length/2 + i] = temp;
			}
			System.out.println(Arrays.toString(array));
		} else {
			for (int i = 0; i < array.length/2; i++) {
				int temp = array[i];
				array[i] = array[array.length/2 +1 + i];
				array [array.length/2 +1 + i] = temp;
			}
			System.out.println(Arrays.toString(array));
		}
	}
	
	

}
