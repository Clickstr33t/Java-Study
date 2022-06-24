package settimana05.esercizi_metodi.es_09;

import java.util.Scanner;

public class GiornoDellAnno {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Inserisci il giorno: ");
		int day = s.nextInt();
		System.out.print("Inserisci il mese: ");
		int month = s.nextInt();
		s.close();
		
		int [] arrayDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 32};
		
		int dayOfTheYear=day;
		for (int i=0; i<month-1; i++) {
			dayOfTheYear += arrayDays[i];
		}
		System.out.println(dayOfTheYear);
	}

}
