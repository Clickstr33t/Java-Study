package chapter07.E_22;

/*
 * Migliorate il programma dell'esercizio E_19 aggiungendo un'etichetta descrittiva 
 * a ciasciuna barra del diagramma, dopo aver chiesto all'utente il testo delle 
 * etichette e valori. Il diagramma visualizzato deve essere simile a questo:
 * 
 * 		  Egypt ***************
 * 	     France	**********	
 * 		  Japan *********	
 * 	    Uruguay ************
 * Switzwerland ****************
 *  
 */
public class E_22 {
	public static void main(String[] args) {
		String [] name = {"Egypt", "France", "Japan", "Uruguay", "Switzerland"};
		int [] values = {80,30,40,15,20};
		
		printArray(name, values);
	}
	
	public static void printArray (String[] name , int [] array) {
		double max = array[0];
		for (int x : array) {
			max = Math.max(max, x);
		}
		double ratio = 40 / max;
		for (int i = 0; i < array.length; i++) {
			String text = "";
			for (int j = 0; j < (array[i]*ratio) ; j++) {
				text = text + "*";
			}
			System.out.printf("%15s %s%n", name[i], text);
		}
	}
}
