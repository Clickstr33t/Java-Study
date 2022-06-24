package chapter06.E_09;

import java.util.Scanner;

public class Reverse {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Inserisci stringa: ");
		String text = s.next();
		s.close();
		for (int i = text.length(); i > 0; i--) {
			System.out.print(text.substring(i-1, i));
		}
	}

}
