package chapter07.E_01;

import java.util.Arrays;
import java.util.Scanner;

public class E_01 {
	public static void main(String[] args) {
		/*
		 * Scrivere un ciclo he acquisisca dieci numeri e un altro cilco che li 
		 * visualizzi in ordine inverso rispetto all'ordine in cui sono stati forntiti.
		 */
		Scanner s = new Scanner(System.in);
		int[] array = new int[10];
		int i = 0;
		System.out.print("Inserisci numero: ");
		while(s.hasNextInt() && i < array.length) {
			array[i] = s.nextInt();
			i++;
			if (i >= array.length)break;
			System.out.print("Inserisci numero: ");
		}
		System.out.println(Arrays.toString(array));
		
		System.out.print("[");
		for (i = array.length-1; i >= 0; i--) {
			if (i==0) {
				System.out.print(array[i]);
			} else {
				System.out.print(array[i] + ", ");
			}
		}
		System.out.print("]");
		
		s.close();
	}
}
