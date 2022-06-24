package settimana08.acquisti;

import settimana08.acquisti.eccezioni.TroppiProdottiException;

public class Cliente {
	String nome;
	double bilancio;
	Prodotto[] prodotti;
	
	public Cliente(String nome, double bilancio, int NumerMassimoProdotti) {
		this.nome = nome;
		this.bilancio = bilancio;
		this.prodotti = new Prodotto[NumerMassimoProdotti];
	}

	public double getBilancio() {
		return bilancio;
	}

	public void setBilancio(double bilancio) {
		this.bilancio = bilancio;
	}

	public String getNome() {
		return nome;
	}
	
	public boolean spazioDisponile() {
		for (int i = 0; i < prodotti.length; i++) {
			if (prodotti[i] == null) {
				return true;
			}
		}
		return false;
	}
	
	public void compraProdotto(Prodotto p) {
		if (spazioDisponile()) {
			for (int i = 0; i < prodotti.length; i++) {
				if (prodotti[i]==null) {
					prodotti[i]=p;
					return;
				}
			}
		} else {
			throw new TroppiProdottiException(p);
		}
	}

}
