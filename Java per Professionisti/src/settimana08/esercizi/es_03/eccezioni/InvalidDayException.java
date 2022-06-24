package settimana08.esercizi.es_03.eccezioni;

public class InvalidDayException extends RuntimeException{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidDayException (int d, int m) {
		super ("Errore: il numero " + d + " non rappresenta un giorno valido per il mese " + m);
	}

}
