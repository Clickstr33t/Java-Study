package settimana08.acquisti.eccezioni;

import settimana08.acquisti.Prodotto;

public class TroppiProdottiException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	public TroppiProdottiException(Prodotto p) {
		super ("Errore: non � possibile inserire il prodotto " + p.getNome() + " perch� � stata raggiunta la dimensione massima del deposito.");
	}

}
