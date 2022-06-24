package it.corso.java;


/**
 * Classe che implementa le operazioni aritmetiche.<br>
 * 
 * I metodi implementati consentono di effettuare le seguenti operazioni:
 * <ul>
 * 	<li>Somma</li>
 * <li>Sottrazione</li>
 * <li>Moltiplicazione</li>
 * <li>Divisione</li>
 * </ul>
 * 
 * @author Paolo Preite
 * @since 1.0
 * 
 */
public class Calcolatrice {
	
	/**
	 * 
	 * @param a
	 * @param b
	 * @param c
	 * @return Il metodo ritorna la somma tra a, b, c
	 */
	public static double somma(double a, double b, double c) {
		Calcolatrice d = new Calcolatrice();
		double somma = d.somma(a, b);
		
		somma += c;
		
		return somma;
	}
	
	/**
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public double somma(double a, double b) {
		return a+b;
	}

	public int somma(int a, int b) {
		return a+b;
	}
	
	public double sottrazione(double a, double b) {
		return a-b;
	}
	
	public double moltiplicazione(double a, double b) {
		return a*b;
	}
	
	public double divisione(double a, double b) {
		if(b == 0) {
			System.out.println("ATTENZIONE: divisione per 0!!!");
		}
		return a/b;
	}
	
	
	public int sottrazione(int a, int b) {
		return a-b;
	}
	
	public int moltiplicazione(int a, int b) {
		return a*b;
	}
	
	public int divisione(int a, int b) {
		if(b == 0) {
			System.out.println("ATTENZIONE: divisione per 0!!!");
		}
		return a/b;
	}
}
