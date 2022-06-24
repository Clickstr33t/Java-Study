package chapter06.E_22;

import java.util.Scanner;

public class Conversion {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Inserisci valore USD/JPY: ");
		double yen = s.nextInt();
		
		System.out.println("\nCONVERSIONE JPY >>> USD");
		double num = 1;
		while (num > 0) {
			System.out.print("Inserisci importo in USD: ");
			num = s.nextInt();
			if (num > 0) {
				System.out.println(num + " USD corrisponodono a " + num * yen + " JPY");
			} else {
				System.out.println("\nCONVERSIONE JPY >>> USD");
			}
		}
		
		num = 1;
		while (num > 0) {
			System.out.print("Inserisci importo in JPY: ");
			num = s.nextInt();
			if (num > 0) {
				System.out.println(num + " JPY corrisponodono a " + num / yen + " USD");
			} else {
				System.out.println("Grazie per aver usato il sofware.");
			}
		}
		s.close();
	}

}
