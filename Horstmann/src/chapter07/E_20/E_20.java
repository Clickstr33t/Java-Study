package chapter07.E_20;

import java.util.Scanner;

/*
 * Risolvete l'esercizio E_20, disegnando le barre verticalmente, 
 * con la barra più alta costitutia da 20 asterischi.
 */
public class E_20 {
	public static void main(String[] args) {
		int [] array = {80,30,40,15};
		
		printArrayVertically(array);
		System.out.println();
		printArray(array);
	}
	
	public static void printArray (int [] array) {
		double max = array[0];
		for (int x : array) {
			max = Math.max(max, x);
		}
		double ratio = 40 / max;
		for (int x : array) {
			for (int i = 0; i < (x*ratio) ; i++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public static void printArrayVertically (int[] array) {
		double max = array[0];
		for (int x : array) {
			max = Math.max(max, x);
		}
		double ratio = 20 / max;
		for (int i = 0; i < (20); i++) {
			for (int x : array) {
				if (i<20-x*ratio) {
					System.out.print("  ");
				} else {
					System.out.print("* ");
				}
			}
			System.out.println();
		}
	}
}
