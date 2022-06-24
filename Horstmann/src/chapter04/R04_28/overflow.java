package chapter04.R04_28;

public class overflow {
	public static void main(String[] args) {
		//Problema di arrotondamento
		System.out.println(2.0 - 1.1);
		//Nessun problema di arrotondametno
		System.out.println(1.0E6 * 1.0E6);
		/*
		 * problema di overflow un int è limitato a circa a 2x10^9 
		 * si risolve con un castl (long) o con un numero letterale
		 */
		System.out.println((long)65536*65536);
		System.out.println(65536L*65536L);
		//??
		System.out.println(1_000_000L * 1_000_000L);
	}

}
