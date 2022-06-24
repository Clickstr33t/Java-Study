package settimana06.esercizi_valori_casuali.es_02;

import java.util.Random;
import java.util.Scanner;

public class Indovina {
	public static void main(String[] args) {
		Random generator = new Random();
		Scanner s = new Scanner(System.in);
		System.out.print("Player 1 inserisci il numero: ");
		int player1 = s.nextInt();
		System.out.print("Player 2 inserisci il numero: ");
		int player2 = s.nextInt();
		int number = generator.nextInt(99)+1;
		int distanza1 = Math.abs(player1 - number);
		int distanza2 = Math.abs(player2 - number);
		System.out.println("IL NUMERO ESTRATTO E' "+number);
		if (distanza1 == distanza2) {
			System.out.println("Player1: "+ player1 + " Player2: "+ player2 + " - PAREGGIO");
		} else if (distanza1 < distanza2) {
			System.out.println("Player1: "+ player1 + " Player2: "+ player2 + " - VINCE PLAYER 1");	
		} else {
			System.out.println("Player1: "+ player1 + " Player2: "+ player2 + " - VINCE PLAYER 2");
		}
		System.out.println("");
		s.close();
	}

}
