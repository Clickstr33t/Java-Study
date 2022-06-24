package settimana08.esercizi.es_04.interfacce;

public interface Session {
	
	/**
	 * Effettua il logout
	 * @return Credenziali corrette
	 */
	public boolean login(String user, String password);
	
	/**
	 * Effettua il logout
	 */
	public void logout();
}
