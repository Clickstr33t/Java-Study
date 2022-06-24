package settimana08.esercizi.es_03.eccezioni;

public class InvalidYearException extends RuntimeException{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidYearException () {
		super ("Errore: l'anno non può essere negativo");
	}

}
