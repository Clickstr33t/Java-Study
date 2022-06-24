package settimana09.es_01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Esercizio {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		List<Integer> lista = new ArrayList<>();
		System.out.print("Inserisci un numero intero o Q per uscire: ");
		if (s.hasNextInt()) {
			while (s.hasNextInt()) {
				System.out.print("Inserisci un numero intero o Q per uscire: ");
				lista.add(s.nextInt());
			}
		}
		System.out.println(lista);
		
		int num = 0;
		s.next();
		
		System.out.print("\nInserisci il numero da rimuovere: ");
		while (!s.hasNextInt()) {
			s.next();
			System.out.print("Inserisci il numero da rimuovere: ");
		}
		num = s.nextInt();
		s.close();
		
		System.out.println(lista.size());
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i)==num) {
				lista.remove(i);
				i--; //DEVI DECREMENTARE I ALTRIMENTI NON CICLA TUTTE LE POSIZIONI
			}
		}
		
		System.out.println(lista);
	}
}
