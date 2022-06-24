package chapter04.E04_06;

import java.util.Scanner;

public class Circle {
	public static void main(String[] args) {
		double ray;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Inserisci il raggio: ");
		ray = input.nextDouble();
		
		System.out.printf("%nArea:          %10.2f%n", Math.PI*ray*ray);
		System.out.printf("Circonferenza: %10.2f%n", Math.PI*ray*2);
		System.out.printf("Area Sfera:    %10.2f%n", 4*Math.PI*ray*ray);
		System.out.printf("Volume Sfera:  %10.2f%n", 4*(Math.PI*Math.pow(ray, 3)/3));
	}

}
