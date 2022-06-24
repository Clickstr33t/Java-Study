package chapter05.E_19;

import java.util.Scanner;

public class DoubleRound {
	final static double EPSILON= 1E-2;
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.print("Inserisci il primo numero da confrontare: ");
		float a = s.nextFloat();
		System.out.print("Inserisci il secondo numero da confrontare: ");
		float b = s.nextFloat();
		if (a-b <= EPSILON){
			System.out.println("The are the same up to two decimal paces.");
		}else {
			System.out.println("They are different.");
		}
	}

}
