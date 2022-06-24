package settimana05.esercizi_array.ES_05;

import java.util.Scanner;

public class ArrayDistanza {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Inserisci la grandezza dell'array: ");
		int size = (int)s.nextFloat();
		float [] array = new float[size];
		initializeArray(array, s);
		int posizione = nearestArray(array, s);
		System.out.print(array[posizione]);
		s.close();
	}
	
	public static float input (Scanner s) {
		return s.nextFloat();
	}
	
	public static void initializeArray (float[] array, Scanner s) {
		for (int i = 0; i < array.length; i++) {
			System.out.print("Inserisci il valore in posizione "+i+":");
			array[i]=s.nextFloat();
		}
	}
	
	public static int nearestArray (float[] array, Scanner s) {
		System.out.print("Inserisci il valore di riferimento K: ");
		float k = input(s);
		float distance = Math.abs(array[0]-k);
		int position = 0;
		for (int i = 1; i < array.length; i++) {
			if (Math.abs(array[i]-k)<distance) {
				distance = Math.abs(array[i]-k);
				position = i;
			}
		}
		return position;
	}

}
