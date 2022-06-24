package settimana05.esercitazioni;

import java.util.Scanner;

public class DivideEtImpera {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int size = Integer.parseInt(args[0]);
		int[] array = new int [size];
		int scelta = 0;
		
		System.out.println("Questo programma ti permette di gestire un array di "+ size+" elementi. Inizializza i suoi valori.");
		inizializzaArray(s, array);
		
		do {
			System.out.println("Il programma ti permette di svolgere diverse operazioni.");
			System.out.println("1) Sovrascrivi una posizione.");
			System.out.println("2) Sovrascrivi tutto l'array.");
			System.out.println("3) Stampa una posizione.");
			System.out.println("4) Stampa un intervallo di valori.");
			System.out.println("5) Stampa tutto l'array.");
			System.out.println("6) Inverti l'array.");
			System.out.println("0) Esci.");
			System.out.print("Inserisci il numero dell'operazione che vuoi svolgere:");
			scelta = acquisisciIntero(s);
			
			switch (scelta) {
				case 1: 
					System.out.print("Inserisci il nuovo valore: ");
					int valore = acquisisciIntero(s);
					System.out.print("Inserisci l'indice della posizione che vuoi sostituire: ");
					int posizione = acquisisciIntero(s);
					sovrascriviPosizione(array, valore, posizione);
				break;
				case 2:
					sovrascriviArray(s, array);
				break;
				case 3:
					System.out.print("Inserisci l'indice della posizione che vuoi stampare: ");
					posizione = acquisisciIntero(s);
					stampaPosizione(array, posizione);
					System.out.println();
				break;
				case 4: 
					System.out.print("Inserisci il primo valore dell'intervallo: ");
					int min = acquisisciIntero(s);
					System.out.print("Inserisci il secondo valore dell'intervallo: ");
					int max = acquisisciIntero(s);
					stampaIntervallo(array, min, max);
				break;
				case 5:
					stampaArray(array);
				break;
				case 6: 
					invertiArray(array);
				break;
				case 0:
					System.out.println("Uscita dal programma.");
				break;
				default:
					System.out.println("Errore: Valore non valido.");
				break;
			}
			
		}
		while (scelta!=0);
	}


	public static int acquisisciIntero(Scanner s) {
		return s.nextInt();
	}
	
	public static void inizializzaArray (Scanner s, int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println("Inserisci il valore di posizione "+ i +": ");
			array[i] = acquisisciIntero(s);
		}
	}
	
	public static void sovrascriviPosizione (int[] array, int valore, int posizione) {
		if ((posizione >= 0) && (posizione < array.length)) {
			array [posizione] = valore;
		}
	}
	
	public static void sovrascriviArray (Scanner s, int[] array) {
		for (int i=0; i<array.length; i++) {
			System.out.println("Inserisci il valore di posizione "+ i + ":");
			int temp = acquisisciIntero(s);
			sovrascriviPosizione(array, temp, i);
		}
	}
	
	public static void stampaPosizione(int[] array, int posizione) {
		if ((posizione >= 0) && (posizione <= array.length)) {
			System.out.println(array[posizione] + " ");
		}
	}
	
	public static void stampaIntervallo(int[] array, int min, int max) {
		if ((min <= max) && (min >=0) && (max < array.length)) {
			for (int i=min; i<=max; i++) {
					stampaPosizione(array, i);
			}
			System.out.println();
		}
	}
	
	public static void stampaArray(int[] array) {
		stampaIntervallo(array, 0, array.length-1);
		System.out.println();
	}
	
	public static void invertiArray(int[] array) {
		int size = array.length;
		
		for (int i = 0; i <size/2; i++) {
			int temp = array[i];
			array[i] = array[size - i - 1];
			array[size - i - 1] = temp;
		}
		
	}
}
