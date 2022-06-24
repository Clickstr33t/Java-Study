package chapter07.R_06;

import java.util.Arrays;
import java.util.Random;

public class R_06 {
	private static final int RANDOM_RANGE = 100;
	public static void main(String[] args) {
		/*
		 * Scrivete un ciclo che riempa l'array values con dieci numeri casuali compresi
		 * tra 1 e 100. Poi scrivete l codice per due cicli annidiati che riempiano l'array
		 * values con dieci numeri casuali compresi tra 1 e 100 ma tutti diversi tra loro.
		 */
		int[] values = new int[10];
		Random r = new Random();
		
		for (int i = 0; i < values.length; i++) {
			int random = r.nextInt(RANDOM_RANGE)+1;
			for (int j = 0; j<i; j++) {
				if (values[j] == random) {
					random = r.nextInt(RANDOM_RANGE)+1;
					j=-1;
				}
			}
			values[i]=random;
		}
		
		System.out.println(Arrays.toString(values));
	}
}
