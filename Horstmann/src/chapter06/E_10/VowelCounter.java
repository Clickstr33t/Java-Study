package chapter06.E_10;

import java.util.Scanner;

public class VowelCounter {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Inserisci stringa: ");
		String text = s.next();
		s.close();
		int count = 0;
		for (int i = 0; i < text.length(); i++) {
			if (	
					text.substring(i, i+1).toUpperCase().equals("A") 
					||
					text.substring(i, i+1).toUpperCase().equals("E")
					||
					text.substring(i, i+1).toUpperCase().equals("I")
					||
					text.substring(i, i+1).toUpperCase().equals("O")
					||
					text.substring(i, i+1).toUpperCase().equals("U")
					||
					text.substring(i, i+1).toUpperCase().equals("Y")
				) 
				{
					count++;
				}
		}
		System.out.println("Vowel: " + count);
	}

}
