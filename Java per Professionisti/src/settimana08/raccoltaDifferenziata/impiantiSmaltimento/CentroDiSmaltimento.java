package settimana08.raccoltaDifferenziata.impiantiSmaltimento;

import settimana08.raccoltaDifferenziata.tipologieRifiuti.*;

public class CentroDiSmaltimento {
	
	private String nome;
	private String indirizzo;
	
	private CentroRiciclaggioAlluminio centroAlluminio;
	private CentroRiciclaggioCarta centroCarta;
	private CentroRiciclaggioPlastica centroPlastica;
	private CentroRiciclaggioVetro centroVetro;
	private DiscaricaRifiutiSolidi discarica;
	private ImpiantoDiCompostaggio impianto;
	
	private static int totaleRifiutiSmaltiti;
	private static double volumeRifiutiSmaltiti;
	
	public CentroDiSmaltimento (
								String nome, 
								String indirizzo,
								CentroRiciclaggioAlluminio centroAlluminio,
								CentroRiciclaggioCarta centroCarta,
								CentroRiciclaggioPlastica centroPlastica,
								CentroRiciclaggioVetro centroVetro,
								DiscaricaRifiutiSolidi discarica,
								ImpiantoDiCompostaggio impianto
								) {
		this.nome = nome;
		this.indirizzo = indirizzo;
		this.centroAlluminio = centroAlluminio;
		this.centroCarta = centroCarta;
		this.centroPlastica = centroPlastica;
		this.centroVetro = centroVetro;
		this.discarica = discarica;
		this.impianto = impianto;
	}

	public static int getTotaleRifiutiSmalititi() {
		return totaleRifiutiSmaltiti;
	}

	public static double getVolumeRiufiutiSmaltiti() {
		return volumeRifiutiSmaltiti;
	}
	
	public void smaltisci(Rifiuto[] rifiuti) {
		
		for (Rifiuto r : rifiuti) {
			smaltisci(r);
		}
	}
	
	public void smaltisci (Rifiuto r) {
		if (r instanceof Indifferenziato) discarica.smaltisci((Indifferenziato)r); //Cast del rifiuto al tipo corretto
		else if (r instanceof Compostabile) impianto.smaltisci((Compostabile) r);
		else if (r instanceof Alluminio) centroAlluminio.smaltisci((Alluminio) r);
		else if (r instanceof Carta) centroCarta.smaltisci((Carta) r);
		else if (r instanceof Plastica) centroPlastica.smaltisci((Plastica) r);
		else if (r instanceof Vetro) centroVetro.smaltisci((Vetro) r);
		
		//Aggiornamento degli attributi statici relativi alle 
		totaleRifiutiSmaltiti++;
		volumeRifiutiSmaltiti += r.getVolume();
	}
	
	
}
