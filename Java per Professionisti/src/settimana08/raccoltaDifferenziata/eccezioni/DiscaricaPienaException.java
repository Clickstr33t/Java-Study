package settimana08.raccoltaDifferenziata.eccezioni;

import settimana08.raccoltaDifferenziata.tipologieRifiuti.Indifferenziato;

public class DiscaricaPienaException extends RuntimeException{
	
	public DiscaricaPienaException (Indifferenziato r) {
		super ("Discarica piena: il rifiuto " + r + " non pu� essere smaltito nella discarica perch� ha raggiunto "
				+ "il numero massimo di riufiuti totali stoccabili.");
	}
	
	public DiscaricaPienaException (Indifferenziato r, double volumeOccupato) {
		super ("Discarica piena: il volume (" + r.getVolume() + " cm3) del rifiuto" + r + " � superiore allo spazio "
				+ "residuo (" + volumeOccupato + " cm3) della discarica.");
	}

}
