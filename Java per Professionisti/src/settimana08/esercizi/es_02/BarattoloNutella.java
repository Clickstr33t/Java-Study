package settimana08.esercizi.es_02;

import settimana08.esercizi.es_02.eccezioni.NutellaFinitaException;
import settimana08.esercizi.es_02.interfacce.Alimento;

public class BarattoloNutella implements Alimento{

	private String descrizione;
	private String[] ingredienti;
	private String istruzioniSmaltimento;
	private double grammi;
	private final double CAL100 = 530;
	
	public BarattoloNutella (String descrizione, String[] ingredienti,
							String istruzioniSmaltimento, double grammi) {
		this.descrizione = descrizione;
		this.ingredienti = ingredienti;
		this.istruzioniSmaltimento = istruzioniSmaltimento;
		this.grammi = grammi;
	}
	
	public double getNutella(double grammi) {
		if (this.grammi < grammi) {
			throw new NutellaFinitaException();
		}
		
		this.grammi -= grammi;
		return this.grammi;
	}
	
	@Override
	public double getWeight() {
		return this.grammi;
	}

	@Override
	public double getCalories100() {
		return CAL100;
	}

	@Override
	public double getTotalCalories() {
		return grammi/100*CAL100;
	}
}
