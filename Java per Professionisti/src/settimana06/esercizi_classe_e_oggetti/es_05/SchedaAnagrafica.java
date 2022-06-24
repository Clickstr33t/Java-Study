package settimana06.esercizi_classe_e_oggetti.es_05;

public class SchedaAnagrafica {
	private String nome;
	private String cognome;
	private String dataNascita;
	private String numeroTelefono;
	
	public SchedaAnagrafica (String nome, String cognome, String dataNascita, String numeroTelefono) {
		this.nome = nome;
		this.cognome = cognome;
		this.dataNascita = dataNascita;
		this.numeroTelefono = numeroTelefono;
	}
	
	public String getNome() {
		return nome;
	}

	public String getCognome() {
		return cognome;
	}

	public String getDataNascita() {
		return dataNascita;
	}

	public String getNumeroTelefono() {
		return numeroTelefono;
	}
	
	public void setNome (String nome) {
		this.nome = nome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public void setDataNascita(String dataNascita) {
		this.dataNascita = dataNascita;
	}

	public void setNumeroTelefono(String numeroTelefono) {
		this.numeroTelefono = numeroTelefono;
	}
}

