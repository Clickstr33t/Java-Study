package chapter06.E_11;

import java.util.Scanner;

public class SubString {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Inserisci stringa: ");
		String text = s.next();
		s.close();
		for (int i = 0; i < text.length(); i++) {
			for (int j = 0; j < text.length()-i; j++) {
				System.out.println(text.substring(j, j+1+i));
			}
		}
		
	}

}
