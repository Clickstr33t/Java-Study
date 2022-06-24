package settimana07.ereditarieta.e_04;

public class NonAlimentare extends Prodotto{
	
	private String [] materiali;
	
	public NonAlimentare (int codice, String descrizione, double prezzo,
			String[] materiali) {
		super (codice, descrizione, prezzo, 22);
		
		this.materiali = materiali;
	}
}
