package chapter06.E_01;

import java.util.Scanner;

public class E_01 {
	public static void main(String[] args) {
		int somma = 0;
		String stampa = "";
		
		/* Somma di tutti i numeri pari da 2 a 100 */
		
		for (int i = 2; i <= 100 ; i ++) {
			if (i % 2 == 0) {
				stampa = stampa + i + "+";
				somma += i;
			}
		}
		System.out.println(stampa.substring(0, stampa.length()-1));
		System.out.println("TOTALE = " +  somma + "\n");
		
		/* Somma di tutti i quadrati perfetti da 1 a 100 */
		
		stampa = "";
		somma = 0;
		
		for (int i = 1; Math.pow(i, 2) <= 100 ; i ++) {
				stampa = stampa + (int)Math.pow(i, 2) + "+";
				somma += i;
		}
		
		System.out.println(stampa.substring(0, stampa.length()-1));
		System.out.println("TOTALE = " +  somma + "\n");
		
		/* Tutte le potenze da 2^0 a 2^20 */
		
		stampa ="";
		for (int i = 0; i <= 20 ; i ++) {
			stampa = stampa + (int)Math.pow(2, i) + " ";
			somma += i;
		}
		
		System.out.println(stampa.substring(0, stampa.length()-1));
		
		
		/* Stampa di tutti i numeri dispari compresi tra a e b */
		
		stampa = "";
		Scanner s = new Scanner(System.in);
		System.out.print("Inserisci il range inferiore: ");
		int a = s.nextInt();
		System.out.print("Inserisci il range superiore: ");
		int b = s.nextInt();
		for (int i = a; i <= b; i++) {
			if (i % 2 != 0) {
				stampa += i + " ";
			}
		}
		System.out.println(stampa);
		
		/* Stampa di tutte le cifre dispari di un numero */
		System.out.print("Inserisci un numero lungo intero: ");
		int number = s.nextInt();
		int temp = number;
		stampa = "";
		do {
			if (number % 2 !=0) {
				stampa += number % 10 + " ";
			}
		number = number / 10;
		}while (number > 0) ;
		System.out.println(stampa);
		
		
		/* V2 Stampa di tutte le cifre dispari di un numero */
		stampa = "";
		number = temp;
		somma = 0;
		while (number > 0) {
			temp = (int)Math.log10(number);
			int num = (int)(number / Math.pow(10, temp));
			if (num % 2 != 0) {	
				stampa +=  num +  " + ";
				somma += num;
			}
			number = number - (int)Math.pow(10, temp)*num;
		}
		System.out.println(stampa.substring(0,stampa.length()-2) + " = " + somma);
	}
}
