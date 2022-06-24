package settimana06.esercizi_classe_e_oggetti.es_03;

public class ClasseStudente {
	private Studente[] studentiArray;
	private int maxArray;
	private int curArray;
	
	public ClasseStudente(int maxArray) {
		this.maxArray = maxArray;
		this.curArray = 0;
		studentiArray = new Studente[maxArray];
	}
	
	public void aggiungiStudente(Studente idStudente) {
		if (curArray < maxArray) {
			studentiArray[curArray] = idStudente;
			curArray++;
		}
		else {
			System.out.println("Errore: La classe è al completo");
		}
	}
	
	public boolean queryStudente (String nome, String cognome) {
		for (int i = 0 ; i < curArray; i++) {
			if (studentiArray[i].getCognome() == cognome && studentiArray[i].getNome() == nome) {
				return true;
			}
		} return false;
	}
	
	public int queryEta() {
		int counter = 0;
		for (int i = 0 ; i < curArray; i++) {
			if (studentiArray[i].getEta() > 20) {
				counter ++;
			}
		}
		return counter;
	}
	
	public int queryMedia() {
		int counter = 0;
			for (int i = 0; i < curArray; i++) {
				if (studentiArray[i].getEta() < 23 && studentiArray[i].getMediaVoti() >= 27) {
					counter ++;
				}
			}
		
		return counter;
	}

}
