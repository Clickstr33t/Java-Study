package settimana08.raccoltaDifferenziata.rifiuti;

import settimana08.raccoltaDifferenziata.tipologieRifiuti.Carta;

public class CartoneDellaPizza implements Carta{
	
	private String nome;
	private double lato;
	private double altezza;
	
	public CartoneDellaPizza(String nome, double lato, double altezza) {
		this.nome = nome;
		this.lato = lato;
		this.altezza = altezza;
	}

	@Override
	public String getNome() {
		return this.nome;
	}

	@Override
	public double getVolume() {
		return Math.pow(lato, 2)*altezza;
	}

}
