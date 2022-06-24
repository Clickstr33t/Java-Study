package settimana08.esercizi.es_04.eccezioni;

public class LoginException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public LoginException() {
		super ("Errore: non hai effettuato il login");
	}
}
