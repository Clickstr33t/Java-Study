package settimana06.esercizi_valori_casuali.esercitazioni;

public class Stringhe {
	public static void main(String[] args) {
		String prova = "Nel mezzo del cammin di nostra vita mi ritrovai"
				+ " per una selva oscura ché la diritta via era smarrita";
		System.out.println(prova.length());
		System.out.println(prova.indexOf("é"));
		System.out.println(prova.replaceAll("é", "e'"));
		System.out.println(prova.trim().length()-prova.trim().replaceAll(" ", "").length()+1);
		
		/*lui lo ha risolto creando un array e poi visualizzando la lunghezza dell'array*/
		String array [] = prova.split(" ");
		System.out.println(array.length);
	}

}
