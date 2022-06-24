package chapter06.E_08;

import java.util.Scanner;

public class Pritnln {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Inserisci stringa: ");
		String text = s.next();
		s.close();
		for (int i = 0; i < text.length(); i++) {
			System.out.println(text.substring(i, i+1));
		}
	}

}
