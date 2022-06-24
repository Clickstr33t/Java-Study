package chapter05.E_03;

import java.util.Scanner;

public class NumeroCifre {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Inserisci un numero:");
		double num = s.nextDouble();
		
		if (num==0) {
			System.out.print("Zero");
		}else if(num<0){
			System.out.print("Negativo");
		}else if (num>0) {
			System.out.print("Positivo");
		}
		
		if (Math.abs(num) < 1) {
			System.out.print(" small");
		}else if (Math.abs(num) > 1000000) {
			System.out.print(" large");
		}
		s.close();
	}
}
