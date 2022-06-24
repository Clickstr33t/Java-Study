package settimana07.ereditarieta.e_02;

/**
 * Un prodotto con relativa descrizione codice e prezzo comprensivo di IVA.
 * @author Clickstreet
 *
 */
public class Prodotto {
	private int codice;
	private String descrizione;
	private double prezzo;
	private double percetnIva;
	
	/**
	 * Inizializza tutte le variabili inserendo una descrizione.
	 * @param codice Codice prodotto.
	 * @param descrizione Descrizione prodotto.
	 * @param prezzo Prezzo IVA compresa.
	 * @param percentIva Percentuale IVA prodotto.
	 */
	public Prodotto (int codice, String descrizione, double prezzo, double percentIva) {
		this.codice = codice;
		this.descrizione = descrizione;
		this.prezzo = prezzo;
		this.percetnIva = percentIva;
	}
	/**
	 * Inizializza tutte le variabili con una descrizione vuota
	 * @param codice Codice prodotto.
	 * @param prezzo Prezzo IVA compresa.
	 * @param percentIva Percentua IVA prodotto.
	 */
	public Prodotto (int codice, double prezzo, double percentIva) {
		this.codice = codice;
		this.descrizione = "";
		this.prezzo = prezzo;
		this.percetnIva = percentIva;
	}
	/**
	 * Restituisce il prezzo base senza iva.
	 * @return prezzo base.
	 */
	public double scorporoIva() {
		return this.prezzo/(100+percetnIva)*100;
	}
	

}
