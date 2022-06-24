package settimana06.esercizi_classe_e_oggetti.es_02;
/**
 * La classe modella un'automobile.
 * Una classe è sempre composta da: Attributi, Costruttori, Metodi.
 */
public class Car {

	/*
	 * Attributi
	 * 
	 * Definiscono le caratteristiche fondamentali di un oggetto.
	 * Nel nostro esercizio tutte le automobili hanno:
	 */
	private String brand;	// Marca
	private String model;	// Modello
	private String plate;	// Targa
	private int year;		// Anno
	private boolean isOn;	// true se la macchina è accesa
	
	/*
	 * Costruttori
	 * 
	 * Il 'Costruttore' è un particolare metodo richiamato quando
	 * si crea un oggetto, serve a inizializzare i valori dei suoi
	 * attributi. Una classe può avere più di un costruttore.
	 * Nel nostro esercizio la classe ha un solo costruttore che 
	 * stabilisce che le macchine appena create sono sempre spente
	 * e tutti gli altri valori devono essere scelti dal chiamante.
	 */
	public Car(String brand, String model, String plate, int year) {
		this.brand = brand;
		this.model = model;
		this.plate = plate;
		this.year = year;
		this.isOn = false;
	}
		
	/*
	 * Metodi
	 * 
	 * I metodi definiscono il comportamento di un oggetto,
	 * le azioni che possiamo fare con esso.
	 */
	
	/*
	 * Accende l'automobile ma se è già accesa 
	 * stampa un messaggio di errore  
	 */
	public void turnOn() {
		if(this.isOn) {
			System.out.println("Error: can not turn on the car!");
		} else {
			this.isOn = true;
		}
	}
	
	/*
	 * Spegne l'automobile ma se è già spenta 
	 * stampa un messaggio di errore  
	 */
	public void turnOff() {
		if(this.isOn) {
			this.isOn = false;
		} else {
			System.out.println("Error: can not turn off the car!");
		}
	}
	
	/*
	 * Stampa il contenuto di tutti i campi della macchina. 
	 */
	public void printCar() {
		System.out.println(
				brand + " " + model + " " + plate + " " +
				year + " " + isOn
				);
	}
	
	/*
	 * Permette all'utente di leggere il valore 
	 * dell'atttibuto privato 'year'.
	 * I metodi che permettono di leggere il valore di
	 * un attributo vengono chiamati 'getter'.
	 * 
	 * Tipicamente aggiungiamo un metodo getter per ogni 
	 * attributo che vogliamo sia leggibile da un'altra classe
	 * e non creiamo alcun getter per gli attributi che non 
	 * vogliamo siano visibili esternamente.
	 */
	public int getYear() {
		return this.year;
	}
	
	/*
	 * Permette all'utente di sovrascrivere il valore
	 * dell'attributo 'year'.
	 * I metodi che permettono di sovrascrivere il
	 * valore di un attributo vengono chiamati 'setter'.
	 * 
	 * Scriviamo un metodo setter per ogni attributo che
	 * vogliamo sia scrivibile da un'altra classe:
	 * nel corpo del metodo possiamo inserire tutti i 
	 * controlli che vogliamo (ad esempio se l'utente ha
	 * passato un anno non compreso tra 1900 e 2020 non
	 * modifichiamo l'attributo).
	 * 
	 * Spesso non vogliamo che una classe esterna possa
	 * modificare un attributo e quindi non creiamo il
	 * relativo metodo setter.
	 */
	public void setYear(int year) {
		this.year = year;
	}
}



