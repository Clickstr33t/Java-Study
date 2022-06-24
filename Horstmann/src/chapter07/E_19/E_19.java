package chapter07.E_19;

import java.util.Scanner;

/*
 * Scrivete un programma che legga una sequenza di valori in ingresso 
 * e visualizzi un diagramma a barre corrispondente ai valori acquisito, 
 * simile a questo:
 * 
 * ************
 * **********************
 * *****************
 * *************
 * ********
 * 
 * Potete ipotizzare che i valori siano tutti positivi. 
 * Per prima cosa individuate il valore massimo:
 * la barra corrispondende a quel valore deve avere 40 asterischi 
 * e le altre devono avere un numero di asterischi proporzionale al loro valore 
 * rispetto a tale valore massimo.
 * 
 */
public class E_19 {
	public static void main(String[] args) {
		int [] array = {80,30,40,15};
		
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
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
