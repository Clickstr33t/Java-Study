package settimana08.acquisti.eccezioni;

import settimana08.acquisti.Cliente;
import settimana08.acquisti.Prodotto;
import settimana08.acquisti.Venditore;

public class CreditoInsufficienteException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	public CreditoInsufficienteException(Prodotto p, Cliente c, Venditore v) {
		super (c.getNome() + " non possiede soldi a sufficienza per acquistare "+ p.getNome() +" al prezzo di " + p.getPrezzo() + " dal venditore "+ v.getNome());
	}

}
