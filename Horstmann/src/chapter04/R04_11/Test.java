package chapter04.R04_11;

public class Test {
	public static void main(String[] args) {
		String s = "Esercizio";
		/*1*/
		System.out.println(s.charAt(0));
		/*2*/
		System.out.println(String.valueOf(s.charAt(0))+String.valueOf(s.charAt(s.length()-1)));
		/*3*/
		System.out.println(s.substring(1,s.length()-1));
		/*4*/
		System.out.println(s.substring(0, s.length()/2));
		/*5*/
		if (s.length()%2==0) {
			System.out.println(s.substring(s.length()/2));			
		}else {
			System.out.println(s.substring(s.length()/2+1));			
		}
		/*7*/
		if (s.length()%2==0) {
			System.out.println(s.substring(s.length()/2-1, s.length()/2+1));			
		}else {
			System.out.println(s.substring(s.length()/2, s.length()/2+1));			
		}
		
	}

}
