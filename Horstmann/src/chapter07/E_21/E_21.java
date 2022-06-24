package chapter07.E_21;

/*
 * Migliorate il programma dell'eserizio E_20 in modo che possa gestire correttamente
 * anche i valori negativi. 
 */
public class E_21 {
	public static void main(String[] args) {
		int [] array = {1,10,20,20};
		
		printArray(array);
	}
	
	public static void printArray (int [] array) {
		
		//Calcola il minimo ed il massimo
		double max = array[0];
		double min = array[0];
		for (int x : array) {
			max = Math.max(max, x);
			min = Math.min(min, x);
		}
		//Calcola il valore assoluto del minimo
		if (min >= 0) {
			min = 0;
		} else {
			min = Math.abs(min);
		}
		//Calcola ratio per scala del grafico
		double ratio = 40 / (max+min);
		
		// Se ho solo valori positivi
		if (min == 0) {
			//Ciclo delle righe dell'istogramma
			for (int x : array) {
				//Ciclo per ogni singola barra
				for (int i = 0; i < 40+1 ; i++) {
					if (i==0) {
						System.out.print("|");
					} else if (i <= x * ratio) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
				System.out.println("");
			}
		} else {
			//Ciclo delle righe dell'istogramma
			for (int x : array) {
				//Ciclo per ogni singola barra
				for (int i = (int)(-min*ratio); i <= (int)(max*ratio)+1 ; i++) {
					if (i==0) {
						System.out.print("|");
					} else if (i <= x * ratio && i > 0) {
						System.out.print("*");
					} else if (i > x * ratio && i  > 0) {
						System.out.print(" ");
					} else if (i >= x * ratio && i < 0) {
						System.out.print("*");
					} else if (i < x * ratio && i < 0) {
						System.out.print(" ");
					}
				}
				System.out.println("");
			}
		}
	}
}
