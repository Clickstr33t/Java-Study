package settimana08.raccoltaDifferenziata.rifiuti;

import settimana08.raccoltaDifferenziata.tipologieRifiuti.Alluminio;

public class LattinaCocaCola implements Alluminio{
	
	private String nome;
	private double raggio;
	private double altezza;
	
	public LattinaCocaCola(String nome, double raggio, double altezza) {
		this.nome = nome;
		this.raggio = raggio;
		this.altezza = altezza;
	}

	@Override
	public String getNome() {
		return this.nome;
	}

	@Override
	public double getVolume() {
		return Math.PI*Math.pow(raggio, 2)*altezza;
	}

}
