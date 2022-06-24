package settimana08.esercizi.es_04.eccezioni;

public class StringLongException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public StringLongException() {
		super ("Errore: il post deve essere inferiore a 280 caratteri");
	}
}
