package chapter06.E_06;

import java.util.Scanner;

public class Minimo {
	public static void main(String[] args) {
		boolean primoValore = true;
		int min = 0;
		Scanner s = new Scanner (System.in);
		System.out.print("Quanti numeri vuoi inserire?");
		int ins = s.nextInt();
		for (int i = 1; i <=ins; i++) {
			System.out.print("Inserisci il numero: ");
			int num = s.nextInt();
			if (primoValore = true) {
				min = num;
				primoValore = false;
			} else {
				min = Math.min(min, num);
			}
		}
		System.out.println(min);
		s.close();
	}

}
