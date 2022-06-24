package chapter05.E_18;

import java.util.Scanner;

public class CompareTo {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Inserisci a: ");
		String a = s.next();
		System.out.print("Inserisci b: ");
		String b = s.next();
		System.out.print("Inserisci c: ");
		String c = s.next();
		
		System.out.println(orderLexycally(a, b, c));
		
		s.close();
	}
	public static String orderLexycally(String a, String b, String c) {
		String text = "";
		if (a.compareTo(b) <=0 && a.compareTo(c)<=0) {
			text = a + " " + b + " " + c;
		}else if(a.compareTo(c) <=0 && c.compareTo(b)<=0) {
			text = a + " " + c + " " + b;
		}else if(b.compareTo(c) <=0 && c.compareTo(a)<=0) {
			text = b + " " + c + " " + a;
		}else if(b.compareTo(a) <=0 && a.compareTo(c)<=0) {
			text = b + " " + a+ " " + c;
		}else if(c.compareTo(a) <=0 &&  a.compareTo(b)<=0) {
			text = c + " " + a + " " + b;
		}else if(c.compareTo(b) <=0 &&  b.compareTo(a)<=0) {
			text = c + " " + b + " " + a;
		}
		return text;
	}
}
