package chapter07.E_08;

import java.util.Arrays;
import java.util.Random;

/*
 * Scrivete un programma che produca 10 permutazioni casuale dei numeri da 1 a 10. 
 * Per generare una permutazione casuale, rimepite un array con i numeri da 1 a 10, 
 * facendo in modo che non ve ne siano due uguali. 
 * Potreste farlo in modo brutale, generando numeri casuali fino a quando 
 * non viene prodotto un valore nonn ancora presente nell'array, 
 * ma si trata di una soluzione inefficiente. 
 * Seguite invece, questo algoritmo:
 * 
 * Ripeti 10 volte
 * 		Crea un secondo array e riempilo co i numeri da 1 a 10;
 * 		Scegli a caso un elemento dal secondo array.
 * 		Eliminalo dal secondo array e aggiungilo alla permutazione.
 */

public class E_08 {
	public static void main (String[] args) {
		int [] permutazione = new int[10];
		int [] array = {1,2,3,4,5,6,7,8,9,10};
		for (int i = 0; i < permutazione.length; i++) {
			int random = new Random().nextInt(array.length);
			permutazione[i] = array[random];
			int temp[] = new int[array.length-1];
			for (int j = 0, z = 0; z < array.length-1; j++, z++) {
				if (random == j) {
					j++;
				}
				temp [z] = array[j];  
			}
			array = temp;
			System.out.println(Arrays.toString(array));
		}
		System.out.println(Arrays.toString(permutazione));
	}
}
