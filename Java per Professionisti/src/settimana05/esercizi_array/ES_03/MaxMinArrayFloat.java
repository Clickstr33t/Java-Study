package settimana05.esercizi_array.ES_03;

import java.util.Scanner;

public class MaxMinArrayFloat {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Inserisci la grandezza dell'array: ");
		int size = s.nextInt();
		float [] array = new float[size];
		arrayInitialize(s, array);
		System.out.println("Max: "+getMax(array));
		System.out.println("Min: "+getMin(array));
		
		
	}
	
	public static float inputFloat(Scanner s) {
		return s.nextFloat();
	}
	
	public static void arrayInitialize (Scanner s, float[] array) {
		for (int i=0; i<array.length; i++) {
			System.out.print("Inserisci un valore float in posizione: "+i+":");
			array[i]=s.nextFloat();
		}
	}
	
	public static float getMax(float[] array) {
		float max=array[0];
		for (int i=1; i<array.length; i++) {
			if (array[i]>max) {
				max=array[i];
			}
		}
		return max;
	}
	
	public static float getMin(float[] array) {
		float min=array[0];
		for (int i=1; i<array.length; i++) {
			if (array[i]<min) {
				min=array[i];
			}
		}
		return min;
	}

}
