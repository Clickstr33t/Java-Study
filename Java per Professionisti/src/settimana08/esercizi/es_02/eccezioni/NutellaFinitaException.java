package settimana08.esercizi.es_02.eccezioni;

public class NutellaFinitaException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public NutellaFinitaException() {
		super("Nutella finita te la sei mangiata tutta maiale!!!");
	}

}
