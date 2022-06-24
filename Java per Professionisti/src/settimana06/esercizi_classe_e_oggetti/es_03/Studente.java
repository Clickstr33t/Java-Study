package settimana06.esercizi_classe_e_oggetti.es_03;

public class Studente {
	private String nome;
	private String cognome;
	private int eta;
	private double mediaVoti;

	public Studente (String nome, String cognome, int eta, double mediaVoti) {
		this.nome = nome;
		this.cognome = cognome;
		this.eta = eta;
		this.mediaVoti = mediaVoti;
	}
	
	public void stampaStudente () {
		System.out.println(nome + "" + cognome + "" + eta + "" + mediaVoti);
	}

	public String getNome() {
		return nome;
	}

	public String getCognome() {
		return cognome;
	}

	public int getEta() {
		return eta;
	}

	public double getMediaVoti() {
		return mediaVoti;
	}
}
