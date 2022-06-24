package settimana08.esercizi.es_04corretto;
/**
 * Interfaccia per la gestione di una sessione.
 * 
 * Il metodo "login" dati username e password rende true se sono corretti 
 * (e l'utente si è loggato all'account) o false altrimenti.
 * 
 * Il metodo "logout" permette di terminare la sessione corrente.
 *
 */
public interface Session {
	
	boolean login(String username, String password);
	void logout();
}
