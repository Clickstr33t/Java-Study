package chapter05.E_04;

import java.util.Scanner;

public class FirstAndLastLetter {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Inserisci una stringa:");
		String text = s.next();
		char first = text.charAt(0);
		char second = text.charAt(text.length()-1);
		System.out.println(first);
		System.out.println(second);		
		if (first == second) {
			System.out.println("first and last letter are the same");
		}else {
			System.out.println("first and last letter are different");
		}
		s.close();
	}
}
