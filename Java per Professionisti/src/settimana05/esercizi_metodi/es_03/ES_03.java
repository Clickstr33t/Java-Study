package settimana05.esercizi_metodi.es_03;

import java.util.Scanner;

public class ES_03 {
	public static void main(String[] args) {
		int a, b, c;
		Scanner input = new Scanner(System.in);
		System.out.print("Inserisci il valore di a: ");
		a = input.nextInt();
		System.out.print("Inserisci il valore di b: ");
		b = input.nextInt();
		System.out.print("Inserisci il valore di c: ");
		c = input.nextInt();
		input.close();
		System.out.println("Max: " + getMax(a, b, c));
		System.out.println("Min: " + getMin(a, b, c));
	}
	public static int getMax(int a, int b, int c) {
		int max = Math.max(Math.max(a, b),c);
		return max;
	}
	
	public static int getMin(int a, int b, int c) {
		int min = Math.min(Math.min(a, b),c);
		return min;
	}

}
