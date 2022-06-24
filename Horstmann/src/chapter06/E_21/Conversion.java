package chapter06.E_21;

import java.util.Scanner;

public class Conversion {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Inserisci valore USD/JPY: ");
		int yen = s.nextInt();
		
		int num = 1;
		while (num > 0) {
			System.out.print("Inserisci importo in USD: ");
			num = s.nextInt();
			if (num > 0) {
				System.out.println(num + " USD corrisponodono a " + num * yen + " JPY");
			} else {
				System.out.println("Grazie per aver usato il sofware.");
			}
		}
		s.close();
	}

}
