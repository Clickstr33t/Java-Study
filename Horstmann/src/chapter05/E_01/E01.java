package chapter05.E_01;

import java.util.Scanner;

public class E01 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Inserisci un numero intero:");
		int num = s.nextInt();
		
		if (num%2==0) {
			System.out.println("Il numero è pari!");
		}else {
			System.out.println("Il numero è dispari!");
		}
		s.close();
	}
}
