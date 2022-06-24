package chapter04.E04_03;

import java.util.Scanner;

public class Input {
	public static void main(String[] args) {
		double a;
		double b;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Inserisci il primo numero: ");
		a = input.nextDouble();
		System.out.print("Inserisci il secondo numero: ");
		b = input.nextDouble();
		
		System.out.printf("\nSum:        %10.2f%n",a+b);
		System.out.printf("Difference: %10.2f%n",a-b);
		System.out.printf("Product:    %10.2f%n",a*b);
		System.out.printf("Average:    %10.2f\n",(a+b)/2);
		System.out.printf("Distance:   %10.2f\n",Math.abs(a-b));
		System.out.printf("Maximum:    %10.2f\n",Math.max(a, b));
		System.out.printf("Minimum:    %10.2f\n",Math.min(a, b));
	}
	
	

}
