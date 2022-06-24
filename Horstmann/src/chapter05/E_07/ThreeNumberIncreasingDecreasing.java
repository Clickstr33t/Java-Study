package chapter05.E_07;

import java.util.Scanner;

public class ThreeNumberIncreasingDecreasing {
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
		
		if (a < b && b < c) {
			System.out.println("increasing");
		}else if (a>b && b>c){
			System.out.println("decreasing");
		}else {
			System.out.println("neither");
		}
	}
}
