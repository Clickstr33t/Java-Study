package settimana06.esercizi_valori_casuali.es_01;

import java.util.Random;
import java.util.Scanner;

public class Dado {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Random dado = new Random();
		int player1=0;
		int player2=0;
		int lancio=0;
		System.out.print("Inserisci il numero di lanci: ");
		int n = s.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.println("\nLANCIO "+i);
			lancio = dado.nextInt(5)+1; 
			player1 += lancio;
			System.out.println("Il player uno ha ottenuto " + lancio + " la somma è " + player1);
			lancio = dado.nextInt(5)+1; 
			player2 += lancio;
			System.out.println("Il player due ha ottenuto " + lancio + " la somma è " + player2);
		}
		if (player1==player2) {
			System.out.println("\nPAREGGIO");
		}else if (player1 > player2) {
			System.out.println("\nPLAYER 1 Vince");
		}else {
			System.out.println("\nPLAYER 1 Vince");
		}
	}
}
