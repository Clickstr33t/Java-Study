package settimana08.acquisti;

import settimana08.acquisti.eccezioni.CreditoInsufficienteException;
import settimana08.acquisti.eccezioni.ProdottoNonValidoException;
import settimana08.acquisti.eccezioni.TroppiProdottiException;

public class Broker {
	
	public void scambia (Venditore venditore, Cliente cliente, Prodotto prodotto) {
		
		if (prodotto == null) throw new ProdottoNonValidoException();
		
		if (!cliente.spazioDisponile()) throw new TroppiProdottiException(prodotto);
		
		if (!venditore.contiene(prodotto)) throw new ProdottoNonValidoException();
		
		if (cliente.getBilancio()<prodotto.getPrezzo()) 
			throw new CreditoInsufficienteException(prodotto, cliente, venditore);
		
		//Tutti i controlli sono superati il broker esegue lo scambio
		cliente.setBilancio(cliente.getBilancio()-prodotto.getPrezzo());
		venditore.setBilancio(venditore.getBilancio()+prodotto.getPrezzo());
		cliente.compraProdotto(prodotto);
		venditore.rimuovi(prodotto);
	}

}
