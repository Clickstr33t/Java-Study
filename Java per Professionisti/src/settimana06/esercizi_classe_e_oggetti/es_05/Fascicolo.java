package settimana06.esercizi_classe_e_oggetti.es_05;

public class Fascicolo {
	private String idCriminale;
	private String nome;
	private String cognome;
	private String dataCarcerazione;
	private String dataScarcerazione;
	private String crimineCommesso;
	
	
	public Fascicolo(String idCriminale, String nome, String cognome, String dataCarcerazione, String dataScarcerazione,
			String crimineCommesso) {
		this.idCriminale = idCriminale;
		this.nome = nome;
		this.cognome = cognome;
		this.dataCarcerazione = dataCarcerazione;
		this.dataScarcerazione = dataScarcerazione;
		this.crimineCommesso = crimineCommesso;
	}
	public String getIdCriminale() {
		return idCriminale;
	}
	public void setIdCriminale(String idCriminale) {
		this.idCriminale = idCriminale;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public String getDataCarcarazione() {
		return dataCarcerazione;
	}
	public void setDataCarcarazione(String dataCarcarazione) {
		this.dataCarcerazione = dataCarcarazione;
	}
	public String getDataScarcerazione() {
		return dataScarcerazione;
	}
	public void setDataScarcerazione(String dataScarcerazione) {
		this.dataScarcerazione = dataScarcerazione;
	}
	public String getCrimineCommesso() {
		return crimineCommesso;
	}
	public void setCrimineCommesso(String crimineCommesso) {
		this.crimineCommesso = crimineCommesso;
	}
	
	
}
