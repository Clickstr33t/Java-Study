package settimana08.acquisti;

import java.util.Arrays;

import settimana08.acquisti.eccezioni.ProdottoNonValidoException;
import settimana08.acquisti.eccezioni.TroppiProdottiException;

public class Venditore {
	private String nome;
	private Prodotto[] prodotti;
	private double bilancio;
	
	public Venditore(String nome, int maxProdotti) {
		this.nome = nome;
		prodotti = new Prodotto[maxProdotti];
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

	@Override
	public String toString() {
		return Arrays.toString(prodotti);//per decidere il formato fai override di protodotto.toString 
	}
	
	public boolean contiene(Prodotto nome) {
		for (int i = 0; i < prodotti.length; i++) {
			if (nome.equals(prodotti[i])) {
				return true;
			}
		}
		return false;
	}
	
	public void aggiungi(Prodotto nome) {
		for (int i = 0; i < prodotti.length; i++) {
			if (prodotti[i] == null) {
				prodotti[i]=nome;
				return;
			}
		}
		throw new TroppiProdottiException(nome);
	}
	
	public void rimuovi (Prodotto nome) {
		for (int i = 0; i < prodotti.length; i++) {
			if (prodotti[i].equals(nome)) {
				prodotti[i] = null;
				return;
			}
		}
		throw new ProdottoNonValidoException();
	}
}
