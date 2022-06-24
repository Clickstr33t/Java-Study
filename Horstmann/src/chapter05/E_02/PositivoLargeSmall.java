package chapter05.E_02;

import java.util.Scanner;

public class PositivoLargeSmall {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Inserisci una stringa:");
		String text = s.next();
		
		if (text.charAt(0)==text.charAt(text.length()-1)) {
			System.out.println("first and last letter same");
		}else {
			System.out.println("first and last letter different");
		}
		
		s.close();
	}
}
