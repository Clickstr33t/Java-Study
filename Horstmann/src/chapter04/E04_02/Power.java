package chapter04.E04_02;

import java.util.Scanner;

public class Power {
	public static void main(String[] args) {
		double num;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Inserisci il numero: ");
		num = input.nextDouble();
		
		System.out.println("Numero ^2: "+ num*num);
		System.out.println("Numero ^3: "+ num*num*num);
		System.out.println("Numero ^4: "+ Math.pow(num, 4));
		
		
	}

}
