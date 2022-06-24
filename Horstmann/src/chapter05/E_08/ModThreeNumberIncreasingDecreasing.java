package chapter05.E_08;

import java.util.Scanner;

public class ModThreeNumberIncreasingDecreasing {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Inserisci a:");
		int a = s.nextInt();
		System.out.print("Inserisci b:");
		int b = s.nextInt();
		System.out.print("Inserisci c:");
		int c = s.nextInt();
		System.out.println(a+" "+b+" "+c);
		System.out.print("\nVuoi ordinare i dati in modo standard o secondario: ");
		String choise = s.next();
		if (choise.equals("standard")) {
			standard(a, b, c);
		}else {
			secondary(a, b, c);
		}
		
		s.close();
	}
	public static void standard(int a, int b, int c) {
		if (a < b && b < c) {
			System.out.println("increasing");
		}else if (a>b && b>c){
			System.out.println("decreasing");
		}else {
			System.out.println("neither");
		}
	}
	
	public static void secondary(int a, int b, int c) {
		if (a==b && b==c) {
			System.out.print("increasing and decreasing");
		}
		else if (a <= b && b <= c) {
			System.out.println("increasing");
		}else if (a>=b && b>=c){
			System.out.println("decreasing");
		}else {
			System.out.println("neither");
		}
		
	}
}
