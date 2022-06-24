package settimana08.esercizi.es_01;

public class TorciaSpentaException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public TorciaSpentaException() {
		super ("Errore: impossibile spegnere la torcia");
	}
	
}
