package chapter05.E_05;

import java.util.Scanner;

public class FirstAndSecondHalf {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Inserisci una stringa:");
		String text = s.next();
		String first = text.substring(0, text.length()/2);
		String second = text.substring(text.length()-text.length()/2);
		System.out.println(first);
		System.out.println(second);		
		if (first.equals(second)) {
			System.out.println("first and second half are the same");
		}else {
			System.out.println("first and second half are different");
		}
		s.close();
	}
}
