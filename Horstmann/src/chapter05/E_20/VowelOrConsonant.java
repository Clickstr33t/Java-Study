package chapter05.E_20;

import java.util.Scanner;

public class VowelOrConsonant {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Inserisci una lettera: ");
		if (s.hasNext() && s.hasNextDouble()==false) {
			String letter = s.next().toUpperCase();
			if (letter.length()>1) {
				System.out.println("Devi inseririe solo UNA lettera");
			}else {
				if (	!letter.equals("A") &&
						!letter.equals("E") &&
						!letter.equals("I") &&
						!letter.equals("O") &&
						!letter.equals("U") &&
						!letter.equals("Y")) {
					System.out.println("Consonant");
				}else {
					System.out.println("Vowel");
				}
			}
		}else {
			System.out.println("Devi inserire una lettera.");
		}
		
		
		s.close();
	}

}
