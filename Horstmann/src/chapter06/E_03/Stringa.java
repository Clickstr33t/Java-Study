package chapter06.E_03;

import java.util.Scanner;

public class Stringa {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Inserisci Stringa: ");
		String text = s.nextLine();
		s.close();
		for (int i = 0; i < text.length(); i++) {
			String temp = text.substring(i, i+1);
			if (temp.equals(temp.toUpperCase())) {
				System.out.print(temp);
			}
		}
		
		System.out.print("\n");
		
		for (int i = 1; i < text.length(); i=i+2) {
				System.out.print(text.substring(i, i+1));
		}
		
		System.out.print("\n");
		int count = 0;
		String posizioni = "";
		for (int i = 0; i < text.length(); i++) {
				String temp = text.substring(i, i+1).toUpperCase();
				if (	temp.equals("A")||
						temp.equals("E")||
						temp.equals("I")||
						temp.equals("O")||
						temp.equals("U")||
						temp.equals("Y")) {
					System.out.print("_");
					count ++;
					posizioni += i+1 + " ";
				} else {
					System.out.print(text.substring(i, i+1));
				}
		}
		System.out.println("\nNumero di vocali: " + count);
		System.out.println("Posizione vocali: " + posizioni);
	}

}
