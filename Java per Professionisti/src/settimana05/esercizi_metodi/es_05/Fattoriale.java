package settimana05.esercizi_metodi.es_05;

import java.util.Scanner;

public class Fattoriale {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Inserisci il numero su cui calcolare il fattoriale: ");
		int num = s.nextInt();
		s.close();
		int fattoriale=1;
		
		for (int i=num; i>0; i--) {
			fattoriale *= i;
		}
		System.out.println("Il fattoriale di "+num+" è: "+fattoriale);
	}

}
