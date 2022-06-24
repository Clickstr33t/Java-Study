package settimana05.esercizi_metodi.es_03;

import java.util.Scanner;

public class ES_3V {
	public static void main(String[] args) {
		
				
		Scanner s = new Scanner(System.in);
		System.out.print("Inserisci la dimensione dell'array: ");
		int size = s.nextInt();
				
		int[] array = new int [size];
		for (int i=0; i<size; i++) {
			System.out.print("Inserisci numero in posizione "+ i+": ");
			array[i] = s.nextInt();
		}

		System.out.println("Max: " + getMax(array));
		System.out.println("Min: " + getMin(array));
		
		s.close();
	}
	
	public static int getMax(int[] array) {
		int max = array[0];
		for (int i=0; i<array.length; i++) {
			max=Math.max(max, array[i]);
		}
		return max;
	}
	
	public static int getMin(int[] array) {
		int min = array[0];
		for (int i=0; i<array.length; i++) {
			min=Math.min(min, array[i]);
		}
		return min;
	}
	
	public static void input(Scanner input) {
		input.nextInt();
	}
}
