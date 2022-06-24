package settimana06.esercizi_classe_e_oggetti.es_02;
/**
 * La classe testa il codice delle classi Car e Garage.
 */
public class TestGarage {

	public static void main(String[] args) {
		
		// Dichiarazione di due oggetti
		Car macchina;
		Car altraMacchina;

		// Inizializzazione degli oggetti
		macchina = new Car("Fiat", "Punto", "AA000AA", 2020);
		altraMacchina = new Car("Citroen", "C1", "BB111BB", 2019);
		
		/* Per utilizzare i metodi dell'oggetto scriviamo 
		 * nome dell'oggetto punto nome del metodo.
		 * Se il metodo accetta valori in input li passiamo
		 * tra parentesi tonde.
		 */
		
		macchina.printCar(); 	// Stampa lo stato iniziale della Car
		macchina.turnOn();		// Accende l'automobile
		macchina.printCar();	// Stampa lo stato aggiornato
		
		// Creiamo un garage che ospita massimo due automobili
		Garage g = new Garage(2); 
		g.addCar(macchina);			// Aggiungiamo la prima macchina
		g.addCar(altraMacchina);	// Aggiungiamo la seconda macchina
		
		g.printCars(2019);			// Stampiamo tutte le macchine del 2020
	}
}
