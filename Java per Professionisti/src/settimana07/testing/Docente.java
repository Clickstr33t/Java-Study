package settimana07.testing;

public class Docente extends Lavoratore{
	private String[] corsi;
	
	public Docente(String nome, int eta, int anniServizio, double stipendio, String[] corsi) {
		
		super (nome, eta, anniServizio, stipendio);
		
		this.corsi = corsi;
	}

}
