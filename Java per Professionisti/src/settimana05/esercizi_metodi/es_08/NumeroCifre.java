package settimana05.esercizi_metodi.es_08;

import java.util.Scanner;

public class NumeroCifre {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Inserisci un numero compreso tra 0 e 9999: ");
		double num = s.nextDouble();
		s.close();
		System.out.println(logMethod(num));
		System.out.println(stringMethod(num));
	}
	
	public static int logMethod(double num) {
		int digits = (int)Math.log10(num)+1;
		return digits;
	}
	
	public static int stringMethod(double num) {
		String digits = String.valueOf((int)num);
		return digits.length();
	}

}