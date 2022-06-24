package settimana05.esercizi_array.ES_02;

import java.util.Arrays;
import java.util.Scanner;

public class GeneraEInvertiArray {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Inserisci il numero di elementi che deve contenere l'array: ");
		int n = input(s);
		int[] array = new int[n];
		initializeArray(s, array, n);
		System.out.println(Arrays.toString(array));
		invertArray(array);
		System.out.println(Arrays.toString(array));
		s.close();
	}
	
	public static int input(Scanner s) {
		return s.nextInt();
	}
	
	public static void initializeArray (Scanner s, int[] array, int lenghtArray) {
		for (int i=0; i<lenghtArray;i++) {
			System.out.print("Inserisci posizione "+i+ ":");
			array[i] = input(s);
		}
	}
	
	public static void invertArray (int[] array) {
		for (int i=0;i<array.length/2;i++) {
			int temp = array[i];
			array[i]=array[array.length-1-i];
			array[array.length-1-i]=temp;
		}
	}
}
