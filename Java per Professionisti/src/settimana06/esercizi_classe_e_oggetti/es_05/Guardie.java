package settimana06.esercizi_classe_e_oggetti.es_05;

public class Guardie {
	
	private  SchedaAnagrafica[] guardie;
	private  int maxGuardie;
	private  int curGuardie;

	public Guardie (int maxArray) {
		this.maxGuardie = maxArray;
		guardie = new SchedaAnagrafica[maxArray];
		curGuardie = 0;
	}
	
	public void aggiungiNuovaGuardia (SchedaAnagrafica nuovaGuardia) {
		if (curGuardie<maxGuardie) {
			guardie[curGuardie] = nuovaGuardia;
			curGuardie++;
		}
		else {
			System.out.println("Errore: valore massimo raggiunto");
		}
	}
	
	public void rimuoviGuardia(int index) {
		int delta = 0;
		for (int i = 0; i < curGuardie; i++) {
			if (i==index) {
				delta = 1;
			}
			guardie[i]= guardie[i+delta];
		}
		curGuardie--;
	}
	
	public void stampaGuardie() {
		for (int i = 0; i < curGuardie; i++) {
			System.out.printf("%3d)%-15s%-15s%-15s%-15s%n", i, guardie[i].getNome(), guardie[i].getCognome(), guardie[i].getDataNascita(),guardie[i].getNumeroTelefono());
		}
	}
	
	public int numeroGuardie() {
		return curGuardie +1;
	}
}
