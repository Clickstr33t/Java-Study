package settimana05.esercizi_array.ES_04;

import java.util.Scanner;

public class MediaArray {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Inserisci la grandezza dell'array: ");
		int size = s.nextInt();
		int [] array = new int [size];
		initializeArray(array, s);
		System.out.println("\nAverage: "+averageArray(array));
		System.out.println("Under average: "+underAverage(array));
		System.out.println("Aboce average: "+aboveAverage(array));
		
	}
	
	public static int input (Scanner s) {
		return s.nextInt();
	}
	
	public static void initializeArray (int [] array, Scanner s) {
		for (int i = 0; i < array.length; i++) {
			System.out.print("Inserisci numero in posizione "+i+":");
			array[i] = input(s);
		}
	}
	
	public static double averageArray (int[] array) {
		double sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		return sum/array.length;
	}
	
	public static String underAverage (int[] array) {
		String text = "[";
		double average = averageArray(array);
		for (int i = 0; i < array.length; i++) {
			if (array[i] < average) {
				text = text + array[i] +", ";
			}
		}
		text = text.substring(0, text.length()-2)+"]";
		return text;
	}
	
	public static String aboveAverage (int[] array) {
		String text = "[";
		double average = averageArray(array);
		for (int i = 0; i < array.length; i++) {
			if (array[i] > average) {
				text = text + array[i] +", ";
			}
		}
		text = text.substring(0, text.length()-2)+"]";
		return text;
	}

}
