package chapter04.E04_15;

import java.util.Scanner;

public class Separator {
	public static void main(String[] args) {
		String num;
		Scanner input = new Scanner(System.in);
		System.out.print("Inserisci il numero: ");
		num = input.next();
		System.out.print(
				num.charAt(0)+" "
				+num.charAt(1)+" "
				+num.charAt(2)+" "
				+num.charAt(3)+" "
				+num.charAt(4)+" ");
	}

}
