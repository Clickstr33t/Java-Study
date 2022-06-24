package it.corso.java;

/**
 * Questa classe contiene il metodo main del progetto
 * 
 * <ul>
 * 	<li>Testo 1</li>
 *  <li>Testo 2</li>
 *  <li>Testo 3</li>
 * </ul>
 * 
 * @author Paolo Preite
 *
 */
public class Calcolatore {

	/**
	 * Metodo main
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * riga1 
		 * riga2
		 * riga3 
		 * ...
		 */
		Calcolatrice c = new Calcolatrice();
		Calcolatrice c1 = new Calcolatrice();
		
		double a = 10;
		double b = 50;
		/* testo */
		
		System.out.println(c.somma(a, b));
		System.out.println(c.sottrazione(a, b));
		System.out.println(c.moltiplicazione(a, b));
		System.out.println(c.divisione(a, b));

		c.somma(3, 5, 6);
		
		Calcolatrice.somma(6, 9, 9);
	}
}
