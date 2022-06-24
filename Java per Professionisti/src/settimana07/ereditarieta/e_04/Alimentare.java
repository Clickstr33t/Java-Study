package settimana07.ereditarieta.e_04;

public class Alimentare extends Prodotto{
	
	private String[] ingredienti;
	private int giornoScadenza;
	private int meseScadenza;
	private int annoScadenza;
	
	public Alimentare(int codice, String descrizione, double prezzo,  
			String [] ingredienti, int giornoScadenza, int meseScadenza, int annoScadenza) {
		
		super (codice, descrizione, prezzo, 4);
		
		this.ingredienti = ingredienti;
		this.giornoScadenza = giornoScadenza;
		this.meseScadenza = meseScadenza;
		this.annoScadenza = annoScadenza;
	}
	
	public  boolean verificaSeScaduto(int giorno, int mese, int anno) {
		if (anno < annoScadenza) {
			return false;
		} else if (anno == annoScadenza) {
			if (mese < meseScadenza) {
				return false;
			} else if (mese == meseScadenza) {
				if (giorno <= giornoScadenza) {
					return false;
				} else {
					return true;
				}
			} else {
				return true;
			}
		} else {
			return true;
		}
	}
}
