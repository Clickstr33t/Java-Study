package chapter04.E04_18;

import java.util.Scanner;

public class Month {
	public static void main(String[] args) {
		final String MONTH_LIST = "January  February March    April    May      June     July     August   SeptemberOctober  November December ";
			Scanner input = new Scanner(System.in);
			System.out.print("Inserisci un mese a numero da 1 a 12: ");
			int month = input.nextInt();
			
			System.out.println(MONTH_LIST.substring(((month-1)*9), ((month-1)*9+9)));
	}
}
