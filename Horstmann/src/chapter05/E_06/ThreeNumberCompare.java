package chapter05.E_06;

import java.util.Scanner;

public class ThreeNumberCompare {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Inserisci a:");
		int a = s.nextInt();
		System.out.print("Inserisci b:");
		int b = s.nextInt();
		System.out.print("Inserisci c:");
		int c = s.nextInt();
		System.out.println(a+" "+b+" "+c);
		s.close();
		
		if (a == b && b==c) {
			System.out.println("All the same");
		}else if (a!=b && a!=c && b!=c){
			System.out.println("All different");
		}
	}
}
