package settimana08.raccoltaDifferenziata.impiantiSmaltimento;

import settimana08.raccoltaDifferenziata.eccezioni.DiscaricaPienaException;
import settimana08.raccoltaDifferenziata.tipologieRifiuti.Indifferenziato;

public class DiscaricaRifiutiSolidi {
	
	private double volumeOccupato;
	private final double volumeMassimoDepositabile;
	private Indifferenziato[] rifiuti;
	private int numeroMassimoRifiutiDepositabili;
	private int numeroRifiutiStoccati;
	
	
	//Crea una nuova discarica rifiuti solidi specificando i valori massimi relativi al numero e volume di rifiuti
	public DiscaricaRifiutiSolidi(
			int numeroMassimoRifiutiDepositabili,
			double volumeMassimoDepositabile) {
		this.volumeMassimoDepositabile = volumeMassimoDepositabile;
		this.numeroMassimoRifiutiDepositabili = numeroMassimoRifiutiDepositabili;
		this.rifiuti = new Indifferenziato[numeroMassimoRifiutiDepositabili];
	}
	
	public void smaltisci(Indifferenziato rifiuto) {
		
		// Verifica che il volume residuo dei rifiuti stoccabili consenta di depositare il nuovo rifiuto
		if (rifiuto.getVolume() + this.volumeOccupato > this.volumeMassimoDepositabile) {
				throw new DiscaricaPienaException(rifiuto, this.volumeMassimoDepositabile-this.volumeOccupato);
		}
		
		// Verifica che il numero totale di rifiuti stoccati consenta di depositare il nuovo rifiuto
		if (this.numeroRifiutiStoccati >= numeroMassimoRifiutiDepositabili) {
			throw new DiscaricaPienaException(rifiuto);
		}
		
		// Deposita il rifiuto nella discarica
		rifiuti[numeroRifiutiStoccati] = rifiuto;
		volumeOccupato += rifiuto.getVolume();
		numeroRifiutiStoccati++;
	}
	
}
