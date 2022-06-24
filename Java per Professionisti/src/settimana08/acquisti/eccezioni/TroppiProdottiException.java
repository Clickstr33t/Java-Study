package settimana08.acquisti.eccezioni;

import settimana08.acquisti.Prodotto;

public class TroppiProdottiException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	public TroppiProdottiException(Prodotto p) {
		super ("Errore: non è possibile inserire il prodotto " + p.getNome() + " perchè è stata raggiunta la dimensione massima del deposito.");
	}

}
