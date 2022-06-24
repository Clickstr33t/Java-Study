package settimana07.ereditarieta.e_03;

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
	@Override
	public String toString() {
		return "Codice: " + this.codice + "\nDescrizione: " + descrizione + "\nPrezzo: "+prezzo;
	}
	
	
	public boolean equals(Prodotto obj) {
		if (this.codice == obj.getCodice()) {
			return true;
		}
		else {
			return false;
		}
	}
	public int getCodice() {
		return codice;
	}
	public void setCodice(int codice) {
		this.codice = codice;
	}
	public String getDescrizione() {
		return descrizione;
	}
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	public double getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
	public double getPercetnIva() {
		return percetnIva;
	}
	public void setPercetnIva(double percetnIva) {
		switch ((int)percetnIva) {
			case 4: this.percetnIva = percetnIva;
			break;
			case 10: this.percetnIva = percetnIva;
			break;
			case 22: this.percetnIva = percetnIva;
			break;
			default: System.out.println("Inserisci un valore valido di IVA");
			break;
		}
	}
	
	

}
