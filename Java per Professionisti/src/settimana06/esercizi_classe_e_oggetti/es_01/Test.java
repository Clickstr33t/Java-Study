package settimana06.esercizi_classe_e_oggetti.es_01;

import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {
		String continueWhile;
		Scanner s = new Scanner(System.in);
		do {
			continueWhile = "?";
			System.out.print("Inserisci il giorno: ");
			int day = s.nextInt();
			System.out.print("Inserisci il mese: ");
			int month = s.nextInt();
			System.out.print("Inserisci l'anno: ");
			int year = s.nextInt();
			System.out.print("\n");
			Date test = new Date(day,month,year);
			do {if (!continueWhile.equals("?")) {
				System.out.print("\nDevi scrivere YES o NO: \n");
				}
				System.out.print("\nInserire altre date? YES/NO: ");
				continueWhile = s.next().toUpperCase();
			}while(!continueWhile.equals("YES") && !continueWhile.equals("NO"));
		}while(continueWhile.equals("YES"));
		s.close();
		System.out.print("\nGrazie per aver utilizzato il nostro Software!");
	}
}
