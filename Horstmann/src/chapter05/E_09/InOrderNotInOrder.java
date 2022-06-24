package chapter05.E_09;

import java.util.Scanner;

public class InOrderNotInOrder {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Inserisci a:");
		int a = s.nextInt();
		System.out.print("Inserisci b:");
		int b = s.nextInt();
		System.out.print("Inserisci c:");
		int c = s.nextInt();
		System.out.println(a+" "+b+" "+c);
		query(a, b, c);
		s.close();
	}
	public static void query(int a, int b, int c) {
		if ((a <= b && b <= c)||(a>=b && b>=c)) {
			System.out.println("in order");
		}else {
			System.out.println("not in order");
	}
	

		
	}
}
