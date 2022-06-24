package settimana08.acquisti;

import java.util.Objects;

public class Prodotto {
	private String nome;
	private double prezzo;
	
	public Prodotto (String nome, double prezzo) {
		this.nome = nome;
		this.prezzo = prezzo;
	}

	public String getNome() {
		return nome;
	}

	public double getPrezzo() {
		return prezzo;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome, prezzo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		
		Prodotto other = (Prodotto) obj;
		
		return Objects.equals(nome, other.nome)
				&& Double.doubleToLongBits(prezzo) == Double.doubleToLongBits(other.prezzo);
	}

	@Override
	public String toString() {
		return "(" + nome + ", " + prezzo + ")";
	}

	
	
	

}
