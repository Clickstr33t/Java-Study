package chapter07.E_16;

import java.util.Arrays;
import java.util.Random;

/*
 * Scrivete un programma che generi una sequenza di 20 valori casuali compresi tra 0 e 99,
 * memorizzandola in un array, poi visualizzi la sequenza generata, la ordini e
 * la visualizzi di nuovo, ordinata. Usate il metodo sort della libreria standard di JAVA
 */

public class E_16 {
	public static void main (String[] args) {
		int[] array = new int[20];
		Random r = new Random();
		
		
		for (int i = 0; i < array.length; i++) {
			array[i] = r.nextInt(100);
		}
		System.out.println(Arrays.toString(array));
		
		Arrays.sort(array);
		
		System.out.println(Arrays.toString(array));
	}
}
