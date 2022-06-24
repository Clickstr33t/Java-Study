package settimana08.raccoltaDifferenziata.rifiuti;

import settimana08.raccoltaDifferenziata.tipologieRifiuti.Compostabile;

public class NoceDiCocco implements Compostabile{
	
	private String nome;
	private double raggio;
	
	public NoceDiCocco(String nome, double raggio) {
		this.nome = nome;
		this.raggio = raggio;
	}

	@Override
	public String getNome() {
		return this.nome;
	}

	@Override
	public double getVolume() {
		return 4*Math.PI*Math.pow(raggio, 3);
	}

}
