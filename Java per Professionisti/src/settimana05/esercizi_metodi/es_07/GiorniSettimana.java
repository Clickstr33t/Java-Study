package settimana05.esercizi_metodi.es_07;

import java.util.Scanner;

public class GiorniSettimana {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Inserisci un giorno della settimana da 1 a 7: ");
		int num = s.nextInt();
		s.close();
		System.out.println(dayOfTheWeek(num));
		System.out.println(callDayOfTheWeek(num));
		
	}
	
	public static String dayOfTheWeek(int num) {
		String day;
		switch (num) {
			case 1: day="Lunedi";
			break;
			case 2: day="Martedi";
			break;
			case 3: day="Mercoledi";
			break;
			case 4: day="Giovedi";
			break;
			case 5: day="Venerdi";
			break;
			case 6: day="Sabato";
			break;
			case 7: day="Domenica";
			break;
			default: day="Numero della settimana non valido";
			break;
		}				
		
		return day;
	}
	
	public static String callDayOfTheWeek(int num) {
		return dayOfTheWeek(num);
	}

}
