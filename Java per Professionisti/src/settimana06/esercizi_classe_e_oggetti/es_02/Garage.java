package settimana06.esercizi_classe_e_oggetti.es_02;
/**
 * La classe modella un garage che ospita un numero massimo di macchine.
 */
public class Garage {

	// Attributi
	private Car[] cars;		// Array di macchine
	private int maxSize;	// Numero massimo di macchine nel garage
	private int curSize;	// Numero attuale di macchine nel garage
	
	// Costruttori
	public Garage(int maxSize) {
		this.maxSize = maxSize;		// La dimensione massima è scelta dal chiamante
		curSize = 0;				// All'inizio il garage è sempre vuoto
		cars = new Car[maxSize];	// Inizializza l'array
	}
	
	// Metodi
	/*
	 * Aggiunge una nuova macchina all'array, se c'è spazio
	 */
	public void addCar(Car c) {
		if(curSize < maxSize) {
			cars[curSize] = c;
			curSize ++;
		}
		else {
			System.out.println("Error: no space available!");
		}
	}
	
	/*
	 * Stampa tutte le macchine presenti nel garage
	 */
	public void printCars(int year) {
		for(int i=0; i<curSize; i++) {
			if(cars[i].getYear() == year)
				cars[i].printCar();
		}
	}
}



