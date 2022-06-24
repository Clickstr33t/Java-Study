package chapter04.E04_07;

import java.util.Scanner;

public class Rectangle {
	public static void main(String[] args) {
		double a, b;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Inserisci il lato A: ");
		a = input.nextDouble();
		System.out.print("Inserisci il lato B: ");
		b = input.nextDouble();
		
		System.out.printf("%nArea:      %10.2f%n",a*b);
		System.out.printf("Perimetro: %10.2f%n",a*2+b*2);
		System.out.printf("Diagonale: %10.2f%n",Math.sqrt(a*a+b*b));
	}

}
