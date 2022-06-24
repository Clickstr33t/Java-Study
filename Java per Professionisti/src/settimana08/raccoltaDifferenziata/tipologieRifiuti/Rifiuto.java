package settimana08.raccoltaDifferenziata.tipologieRifiuti;

public interface Rifiuto {
	
	/**
	 * Rende il nome del rifiuto.
	 * @return nome del rifiuto
	 */
	public String getNome();
	
	/**
	 * Rende il volume occupato dal rifiuto calcolato in cm3
	 * @return volume del rifiuto
	 */
	public double getVolume();
	
}
