package settimana08.esercizi.es_03.eccezioni;

public class InvalidMonthException extends RuntimeException{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidMonthException (int month) {
		super ("Errore: il numero " + month + " non rappresenta un mese valido");
	}

}
