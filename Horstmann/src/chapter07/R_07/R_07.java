package chapter07.R_07;

public class R_07 {
	public static void main(String[] args) {
		/*
		 * Scrivete un ciclo che calcoli contemporaneamente  il valore massimo e il valore
		 * minimo inn un array di numeri.
		 */
		int[] array = {3, 6, 23, 56, 28, 80, 99};
		int max = array[0];
		int min = array[0];
		for (int i = 1; i < array.length; i++) {
			max = Math.max(max, array[i]);
			min = Math.min(min, array[i]);
		}
		System.out.println("MAX: "+ max);
		System.out.println("MIN: "+ min);
	}

}
