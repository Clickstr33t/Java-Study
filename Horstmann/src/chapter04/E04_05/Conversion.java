package chapter04.E04_05;

import java.util.Scanner;

public class Conversion {
	public static void main(String[] args) {
		final double MILES_FOR_METERS = 0.00054;
		final double FEET_FOR_METERS = 3.28083;
		final double INCH_FOR_METERS = 39.37008;
		
		double metri;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Inserire lungezza in metri: ");
		
		metri = input.nextDouble();
		
		System.out.printf("%nMiles: %10.5f%n",metri*MILES_FOR_METERS);
		System.out.printf("Feet:  %10.5f%n",metri*FEET_FOR_METERS);
		System.out.printf("Inch:  %10.5f%n",metri*INCH_FOR_METERS);
		
	}

}
