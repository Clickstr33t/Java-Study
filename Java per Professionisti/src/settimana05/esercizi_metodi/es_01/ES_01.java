package settimana05.esercizi_metodi.es_01;

import java.util.Scanner;

public class ES_01 {
	public static void main(String[] args) {
		int num;
		Scanner input = new Scanner(System.in);
		System.out.println("Inserisci un numero intero: ");
		num = input.nextInt();
		for (int i=num-1; i>=0; i--) {
			System.out.println(i);
		}
		
		input.close();
	}

}
