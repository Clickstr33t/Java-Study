package settimana08.esercizi.es_01;

public class Torcia {
	private String nome;
	private boolean accesa;
	
	public Torcia (String nome) {
		this.nome = nome;
		this.accesa = false;
	}
	
	public void accendi() {
		if (this.accesa) {
			throw new TorciaAccesaException();
		}
		
		this.accesa = true;
		System.out.println("Torcia Accesa");
	}
	
	public void spegni() {
		if (!this.accesa) {
			throw new TorciaSpentaException();
		}
		
		this.accesa = false;
		System.out.println("Torcia Spenta");
	}

	public String getNome() {
		return nome;
	}
	
	
}
