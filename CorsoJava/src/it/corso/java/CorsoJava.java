package it.corso.java;

import java.io.File;

import it.corso.java.ciclo.ForWhileDoWhile;
import it.corso.java.interruzione.BreakContinue;

public class CorsoJava {
	public int b = 5;
	public static String stampa = "CIAO!";
	
	public static void main(String[] args) {
		BreakContinue bc = new BreakContinue();
		bc.esempioContinue2(10, 20);
		
//		ForWhileDoWhile ciclo = new ForWhileDoWhile();
//		ciclo.itera(0, 20);
//		ciclo.itera(20, 20);
		
//		ciclo.iteraDoWhile(0, 20);
//		ciclo.iteraDoWhile(20, 20);

//		ciclo.iteraFor(10);

//		String[] stringhe = new String[] {"testo 1", "testo 2", "testo 3", "testo 4", "testo 5"};
//		
//		ciclo.iteraFor(stringhe);
		
//		IfElseSwitchCase.getInstance().recuperaTesto(2);
		
//		IfElseSwitchCase.getInstance().isNull("test");
//		
//		IfElseSwitchCase.getInstance().recuperaIlMaggiore(3, 8, 6);
//		
//		System.out.println(test.recuperaIlMaggiore(2, 3, 5));
//		
//		String text = null;
//		System.out.println(test.isNull(text));
//		
		
//		CorsoJava c = new CorsoJava();
//		//c.esempioStringa();
//		
//		String d = c.concatena();
//		
//		System.out.println(d);
//		
		
//		System.out.println("Ciao!!");
//		
//		CorsoJava c1 = new CorsoJava();
//		c1.b = 10;
//		
//		CorsoJava c2 = new CorsoJava();
//		c2.b = 10;
//		System.out.println(c2.stampa);
//		
//		System.out.println(CorsoJava.stampa);
//		
//		
//		CorsoJava c3; /* dichiarazione */
//		
//		c3 = new CorsoJava(); /* inizializzazione */
//		c3.b = 20;
//		
//		CorsoJava c4 = new CorsoJava(); /* dichiarazione e inizializzazione */
//		
//		int val1 = 0;
//		
//		System.out.println(val1);
//
//		double d = 0;
//		System.out.println(d);
		
		
//		String test = "prova di stampa";
//		
//		byte[] testAr = test.getBytes();
//		
//		for(int i = 0; i < testAr.length; i++) {
//			System.out.println(testAr[i]);
//		}
		
//		byte a = 100;
//		byte b = 20;
//		byte c = 30;
//		
//		System.out.println((byte)(a+b+c));
		
		
		int val1 = 10;
		int val2 = 20;
		
//		Calcolatrice c = new Calcolatrice();
//		int somma = c.somma(val1, val2);
//		int sottrazione = c.sottrazione(val1, val2);
//		int moltiplicazione = c.moltiplicazione(val1, val2);
//		int divisione = c.divisione(val1, val2);
//		
//		
//		System.out.println(somma);
//		System.out.println(sottrazione);
//		System.out.println(moltiplicazione);
//		System.out.println(divisione);
//		
//		float a = 100.45f;
//		float b = -10.30f;
//		
//		float sommaf = a+b;
//		
//		System.out.println(sommaf);
//		
//		double ad = 100.45;
//		double bd = -10.30;
//		
//		double sommad = ad+bd;
//		
//		System.out.println(sommad);
		
//		char c1 = 'a';
//		char c2 = 'b';
//		
//		int c3 = c1+c2;
//		
//		System.out.println(c3);
//		
//		
//		String test = "prova";
//		
//		System.out.println(test+c1);
		
		
	}
	
	public void esempioStringa() {
		String s1 = "";
		String s2 = "Lorem ipsum...";
		String s3 = new String();
		String s4 = new String("test,,,");
		
		String test = s2+s4;
		
		System.out.println(test);
		
		String test2 = s4.concat(s2);
		
		System.out.println(test2);
		
		
		/* trasformazione minuscolo */
		System.out.println(s2.toLowerCase());
		
		/* trasformazione maiuscolo */
		System.out.println(s2.toUpperCase());
		
		String s5 = " prova trim  ";
		System.out.println(s5);
		
		System.out.println(s5.trim());
		
		String t = "Questo è il corso Java AVANZATO";
		
		/* replace */
		String t1 = t.replace("ava", "!");
		System.out.println(t1);
		
		/* replaceAll */
		String t2 = t.replaceAll("[a-nA-N]+", "4");
		System.out.println(t2);
		
		/* replaceFirst */
		String t3 = t.replaceFirst("[a-n]+", "P");
		System.out.println(t3);

		int l = t.length();
		if(l > 5) {
			String t4 = t.substring(5);
			System.out.println(t4);			
		} else {
			String t4 = t.substring(0);
			System.out.println(t4);
		}
		
		String t5 = t.substring(0, 5);
		System.out.println(t5);
		
		
		t1 = "Paolo Preite";
		t2 = "paolo preite";
		
		System.out.println(t1.equals(t2));
		System.out.println(t1.equalsIgnoreCase(t2));
		
		String[] tArr = t1.split(" ");
		
		for(int i = 0; i < tArr.length; i++) {
			System.out.println(tArr[i]);
		}
		
		System.out.println(t1.startsWith("Pao"));
		System.out.println(t1.endsWith("Pao"));
		
		System.out.println(t1.charAt(3));
	}
	
	public String concatena(String stringa1, String stringa2, double c, File file) {
		
		return stringa1.concat(stringa2);
	}
	
	public String concatena(String... vars) {
		String out = "";
		
		for(int i = 0; i < vars.length; i++) {
			out += vars[i];
		}
		
		return out;
	}
}
