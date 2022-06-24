package chapter04.R04_19;

import java.util.Scanner;

public class Log10 {
	public static void main(String[] args) {

		int firstNum, lastNum, num;
		
		Scanner input =  new Scanner(System.in);
		
		System.out.print("Inserisci il numero da analizzare: ");
		num = input.nextInt();
				
		firstNum = num /(int)Math.pow(10,(int)Math.log10(num));
		lastNum = num % 10;
		
		System.out.println("Considerando il numero "+ num 
							+ " la prima cifra è: " + firstNum
							+ " l'ultima cifra è: " + lastNum);
	}

}
