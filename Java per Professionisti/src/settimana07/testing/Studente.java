package settimana07.testing;

public class Studente extends Persona{
	private int matricola;
	private String[] corsi;
	private int[] voti;
	
	public Studente (String nome, int eta, int matricola, String[] corsi, int[] voti) {
		
		super (nome, eta);
		
		this.matricola = matricola;
		this.corsi = corsi;
		this.voti = voti;
	}
	
	public boolean idoneoBorsaDiStudio() {
		int count = 0;
		int sum = 0;
		for (int i = 0; i < this.voti.length; i++) {
			count ++;
			sum += voti[i];
		}
		double average = sum/count;
		if (count >=3 && average > 27) {
			return true;
		} else {
			return false;
		}
	}
	
}
