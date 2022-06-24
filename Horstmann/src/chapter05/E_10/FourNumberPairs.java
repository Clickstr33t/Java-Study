package chapter05.E_10;

import java.util.Scanner;

public class FourNumberPairs {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Inserisci a:");
		int a = s.nextInt();
		System.out.print("Inserisci b:");
		int b = s.nextInt();
		System.out.print("Inserisci c:");
		int c = s.nextInt();
		System.out.print("Inserisci d:");
		int d = s.nextInt();
		System.out.println(a+" "+b+" "+c+" "+d);
		query(a, b, c, d);
		s.close();
	}
	public static void query(int a, int b, int c, int d) {
		if ((a==b  && a==c && a==d)||
			(a == b || a == c || a== d)
			&&(
				(b != a && (b ==c ||b==d))
				||(c != a && (c==d))
				)
			) 
		{
			System.out.println("two pairs");
		}else {
			System.out.println("not two pairs");
	}
	

		
	}
}
