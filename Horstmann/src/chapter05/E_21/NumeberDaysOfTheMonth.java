package chapter05.E_21;

import java.util.Scanner;

public class NumeberDaysOfTheMonth {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Inserisci il nome del mese da calcolare: ");
		String month = s.next().toUpperCase();
		System.out.println(getLeght(month));
		s.close();
	}
	public static int getLeght(String month) {
		if (	month.equals("GENNAIO")||
				month.equals("MARZO")||
				month.equals("MAGGIO")||
				month.equals("LUGLIO")||
				month.equals("AGOSTO")||
				month.equals("OTTOBRE")||
				month.equals("DICEMBRE")) {
			return 31;
		}else if(
				month.equals("APRILE")||
				month.equals("GIUGNO")||
				month.equals("SETTEMBRE")||
				month.equals("NOVEMBRE")) {
			return 30;
		}else if (
				month.equals("FEBBRAIO")){
			return 28;
		}else {
			System.out.println("Inserisci correttamente il nome del mese");
			return 0;
		}
			
				
	}

}
