package chapter07.E_06;

/*
 * Scrivete un programma he legga una swquenza di numeri interi, 
 * momrizzandola in un array, e ne calcoli la somma a elmenti alterni. 
 * Per esempio, se il programma viene eseguito fornendo questi dati:
 * 
 * 1 4 9 16 9 7 4 9 11
 * 
 * allora calcola:
 * 
 * 1 -4 +9 -16 +9 -7 +4 -9 +11 = -2
 */

public class E_06 {
	public static void main (String[] args) {
		int [] array = {1, 4, 9,16, 9, 7, 4, 9, 11};
		int sum = 0;
		for(int i = 0; i < array.length; i++) {
			if (i % 2 == 0) {
				sum = sum + array[i];
			} else {
				sum = sum - array[i];
			}
		}
		System.out.println("Totale: " + sum);
	}
}
