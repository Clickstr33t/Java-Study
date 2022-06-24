package chapter06.E_02;

import java.util.Scanner;

public class E_02 {
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		int num, min, max, somma;
		String stampa = "";
		System.out.print("Inserisci num: ");
		num = s.nextInt();
		max = num;
		min = num;
		somma = 0;
		int temp = -1;
		while (num != -1) {
			min = Math.min(num, min);
			max = Math.max(num, max);
			somma += num;
			if (num % 2 == 0) {
				System.out.println(num + " è PARI");
			} else {
				System.out.println(num + " è DIPARI");
			}
			System.out.println("Sommatoria: " + somma);
			if (num != temp) {
				stampa += num + " ";
			}
			temp = num;
			System.out.print("Inserisci num: ");
			num = s.nextInt();
		}
		s.close();
		System.out.println("Sequenza: " + stampa);
	}

}
