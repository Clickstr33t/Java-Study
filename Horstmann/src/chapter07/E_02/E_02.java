package chapter07.E_02;

import java.util.Arrays;
import java.util.Random;

/*
 * Scrivete un programma che inizializzi un array con dieci numeri interi casuali e,
 * poi, visualizzi quattro righe di informazioni, contenenti:
 * 1- Tutti gli elementi di indice pari;
 * 2- Tutti gli elmenti di valore pari;
 * 3- Tutti gli elmenti in ordine inverso;
 * 4- Soltanto il prime e l'ultimo elemento.
 */

public class E_02 {
	public static void main(String[] args) {
		int [] array = new int[10];
		Random r = new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] = r.nextInt(100)+1;
		}
		System.out.println("Array: "+Arrays.toString(array));
		
		String pari = "";
		String indicePari = "";
		String inverso = "";
				
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				pari = pari + array[i] + ", ";
			}
			if (i % 2 == 0) {
				indicePari = indicePari + array[i] + ", ";
			}
			
			inverso = array[i] + ", " + inverso;
		}
		System.out.println("1: "+ pari.substring(0,pari.length()-2));
		System.out.println("2: "+ indicePari.substring(0,indicePari.length()-2));
		System.out.println("3: "+ inverso.substring(0,inverso.length()-2));
		System.out.println("4: "+ array[0]+ ", "+array[array.length-1]);
	}
}
