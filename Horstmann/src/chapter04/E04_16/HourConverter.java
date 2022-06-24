package chapter04.E04_16;

import java.util.Scanner;

public class HourConverter {
	public static void main(String[] args) {
		int first, second;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Inserisci il primo orario: ");
		first = input.nextInt();
		System.out.print("Inserisci il secondo orario: ");
		second = input.nextInt();
		
		int difference = Math.abs(first-second);
		
		String differenceString = String.valueOf(difference);
		System.out.println(differenceString.substring(0, differenceString.length()-2)
							+ " hours "  
							+ differenceString.substring(differenceString.length()-2)
							+ " minutes");
	}

}
