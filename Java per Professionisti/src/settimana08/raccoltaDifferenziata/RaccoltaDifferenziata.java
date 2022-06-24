package settimana08.raccoltaDifferenziata;

import settimana08.raccoltaDifferenziata.impiantiSmaltimento.CentroDiSmaltimento;
import settimana08.raccoltaDifferenziata.impiantiSmaltimento.CentroRiciclaggioAlluminio;
import settimana08.raccoltaDifferenziata.impiantiSmaltimento.CentroRiciclaggioCarta;
import settimana08.raccoltaDifferenziata.impiantiSmaltimento.CentroRiciclaggioPlastica;
import settimana08.raccoltaDifferenziata.impiantiSmaltimento.CentroRiciclaggioVetro;
import settimana08.raccoltaDifferenziata.impiantiSmaltimento.DiscaricaRifiutiSolidi;
import settimana08.raccoltaDifferenziata.impiantiSmaltimento.ImpiantoDiCompostaggio;
import settimana08.raccoltaDifferenziata.rifiuti.CartoneDellaPizza;
import settimana08.raccoltaDifferenziata.rifiuti.LattinaCocaCola;
import settimana08.raccoltaDifferenziata.rifiuti.NoceDiCocco;
import settimana08.raccoltaDifferenziata.rifiuti.RifiutoIndifferenziato;
import settimana08.raccoltaDifferenziata.tipologieRifiuti.Rifiuto;

public class RaccoltaDifferenziata {
	
	CentroDiSmaltimento centroSmaltimento1, centroSmaltimento2;
	
	private void inizializzaImpiantiSmaltimento() {
		
		CentroRiciclaggioAlluminio centroAlluminio =  new CentroRiciclaggioAlluminio();
		CentroRiciclaggioCarta centroCarta = new CentroRiciclaggioCarta();
		CentroRiciclaggioPlastica centroPlastica = new CentroRiciclaggioPlastica();
		CentroRiciclaggioVetro centroVetro = new CentroRiciclaggioVetro();
		DiscaricaRifiutiSolidi discarica = new DiscaricaRifiutiSolidi(2, 100);
		ImpiantoDiCompostaggio impianto = new ImpiantoDiCompostaggio();
		
		centroSmaltimento1 =  new CentroDiSmaltimento("Centro Smaltimento Rifiuti", "Via Italia 1",
				centroAlluminio, centroCarta, centroPlastica, centroVetro,
				discarica, impianto);
		
		centroSmaltimento2 = new CentroDiSmaltimento("Un mondo migliore", "Via Moltopulita 100",
				centroAlluminio, centroCarta, centroPlastica, centroVetro,
				discarica, impianto);
	}
	
	private void  eseguiTest() {
		
		// Creazione rifiuti
		Rifiuto cartone = new CartoneDellaPizza("cartone", 40, 5);	// Nome, Lato, Altezza
		Rifiuto lattina = new LattinaCocaCola("lattina", 5, 10);	// Nome, Raggio, Altezza
		Rifiuto noce = new NoceDiCocco("noce", 10);					// Nome, Raggio
		Rifiuto secco1 = new RifiutoIndifferenziato("secco1", 30);	// Nome, Volume
		Rifiuto secco2 = new RifiutoIndifferenziato("secco2", 85);	// Nome, Volume
		Rifiuto secco3 = new RifiutoIndifferenziato("secco3", 27);	// Nome, Volume
		Rifiuto secco4 = new RifiutoIndifferenziato("secco4", 24);	// Nome, Volume
		
		// Smaltisce il cartone nel primo centro di smaltimento
		centroSmaltimento1.smaltisci(cartone);
		
		// Smaltisce lattina e noce nel secondo centro di smaltimento
		centroSmaltimento2.smaltisci(new Rifiuto[] {lattina, noce});
		
		// Verifica lo stato dei rifiuti smaltiti in tutti i centro
		assert CentroDiSmaltimento.getTotaleRifiutiSmalititi() == 3;
		assert CentroDiSmaltimento.getVolumeRiufiutiSmaltiti() == cartone.getVolume() + lattina.getVolume() + noce.getVolume();
		
		// Prova a smaltire i rifiuti indifferenziati, la  discarica accetta massimo 2 riufiuti ed un volume totale di 100
		centroSmaltimento1.smaltisci(secco1);
		//centroSmaltimento2.smaltisci(secco2);			//Lancia eccezione rifuto troppo voluminoso
		centroSmaltimento2.smaltisci(secco3);
		// centroSmaltimento1.smaltisci(secco4);			//Lancia eccezione discarica troppi rifiuti
		
		System.out.println("Test terminato");
	}
	
	public static void main(String[] args) {
		
		// Creando un oggetto di questa classe possiamo evitarei metodi statici
		RaccoltaDifferenziata r = new RaccoltaDifferenziata();
		
		// Inizializza gli oggetti che rappresentano i centri di smaltimento, compostaggio, riciclaggio e stoccaggio
		r.inizializzaImpiantiSmaltimento();
		
		// Esegui test
		r.eseguiTest();
	}

}
