package chapter04.E04_13;

import java.util.Scanner;

import chapter04.E04_03.Input;

public class Number {
	public static void main(String[] args) {
		String num;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Inserisci un numero compreso tra 1,000 e 999,999 (con il separatore \",\"): ");
		num = input.next();
		System.out.println(num.substring(0, num.length()-4) + num.substring(num.length()-3));
	}

}
