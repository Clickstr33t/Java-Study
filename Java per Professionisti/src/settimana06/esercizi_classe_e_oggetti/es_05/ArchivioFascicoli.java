package settimana06.esercizi_classe_e_oggetti.es_05;

public class ArchivioFascicoli {
	private Fascicolo[] archivio;
	private int maxArchivio;
	private int curArchivio;

	public ArchivioFascicoli(int maxArchivio) {
		this.maxArchivio = maxArchivio;
		archivio = new Fascicolo[maxArchivio];
		curArchivio = 0;
	}
	
	public void aggiungiNuovoFascicolo (Fascicolo nuovoFascicolo) {
		if (curArchivio < maxArchivio) {
			archivio[curArchivio] = nuovoFascicolo;
			curArchivio++;
		}
		else {
			System.out.println("Errore: hai raggiungo il valore massimo dell'archivio");
		}
	}
	
	public void stampaFascicolo(int i) {
				System.out.printf("%3d)%-12s%-12s%-12s%-12s%-12s%-12s%n", 
					i, 
					archivio[i].getIdCriminale(),
					archivio[i].getNome(),
					archivio[i].getCognome(),
					archivio[i].getDataCarcarazione(),
					archivio[i].getDataScarcerazione(),
					archivio[i].getCrimineCommesso()
					);
	}
	
	public void stampaTuttiFascicoli() {
		for (int i = 0; i < curArchivio; i++) {
			stampaFascicolo(i);
		}
	}
	
	public void stampaFascicoliNomeCognome(String nome, String cognome) {
		for (int i = 0; i < curArchivio; i++) {
			if (archivio[i].getNome().equals(nome) && archivio[i].getCognome().equals(cognome)) {
				stampaFascicolo(i);
			}
		}
	}
	
	public void rimuoviFascicolo (int index) {
		int delta = 0;
		for (int i = 0; i < curArchivio; i++) {
			if (i == index) {
				delta =1;
			}
			archivio[i] = archivio [i+delta];
		}
		curArchivio--;
	}
}
