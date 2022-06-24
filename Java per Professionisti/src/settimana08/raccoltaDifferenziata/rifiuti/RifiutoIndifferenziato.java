package settimana08.raccoltaDifferenziata.rifiuti;

import settimana08.raccoltaDifferenziata.tipologieRifiuti.Indifferenziato;

public class RifiutoIndifferenziato implements Indifferenziato{
	
	private String nome;
	private double volume;
	
	public RifiutoIndifferenziato(String nome, double volume) {
		this.nome = nome;
		this.volume = volume;
	}

	@Override
	public String getNome() {
		return this.nome;
	}

	@Override
	public double getVolume() {
		return volume;
	}

	@Override
	public String toString() {
		return this.getNome();
	}
	
	

}
