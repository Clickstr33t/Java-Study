package settimana06.esercizi_classe_e_oggetti.es_05;

public class Criminali {
	
	private SchedaAnagrafica[] criminali;
	private int maxCriminali;
	private int curCriminali;
	private	int morti = 0;
	private int evasi = 0;
	
	public Criminali (int maxArray) {
		this.maxCriminali = maxArray;
		criminali = new SchedaAnagrafica[maxArray];
		curCriminali = 0;
		morti = 0;
		evasi = 0;
	}
	
	public void aggiungiNuovoCriminale (SchedaAnagrafica nuovoCriminale) {
		if (curCriminali<maxCriminali) {
			criminali[curCriminali] = nuovoCriminale;
			curCriminali++;
		}
		else {
			System.out.println("Errore: numero massimo raggiunto.");
		}
		
	}
	
	public void rimuoviCriminale(int index) {
		int delta = 0;
		for (int i = 0; i < curCriminali; i++) {
			if (i==index) {
				delta = 1;
			}
			criminali[i]=criminali[i+delta];
		}
		curCriminali--;
	}
	
	public void stampaCriminali() {
		for (int i = 0; i < curCriminali; i++) {
			System.out.printf("%3d)%-15s%-15s%-15s%-15s%n", i, criminali[i].getNome(), criminali[i].getCognome(), criminali[i].getDataNascita(),criminali[i].getNumeroTelefono());
		}
	}
	
	public int numeroCriminali() {
		return curCriminali;
	}

	public int getMorti() {
		return morti;
	}

	public void setMorti() {
		this.morti++;
	}

	public int getEvasi() {
		return evasi;
	}

	public void setEvasi() {
		this.evasi++;
	}
	
	
}
