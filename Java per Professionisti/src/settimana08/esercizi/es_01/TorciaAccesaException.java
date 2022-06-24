package settimana08.esercizi.es_01;

public class TorciaAccesaException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public TorciaAccesaException() {
		super("Errore: impossibile accendere la torcia");
	}
}
