package settimana07.testing;

public class Lavoratore extends Persona{
	private int anniServizio;
	private double stipendio;
	
	private double stipendioMinimo = 100.00;
	
	public Lavoratore() {
		this.stipendio = stipendioMinimo;
	}
	
	public Lavoratore (String nome, int eta, int anniServizio, double stipendio) {
		super (nome, eta);
		this.anniServizio = anniServizio;
		if (stipendio < stipendioMinimo) {
			this.stipendio = this.stipendioMinimo;
		} else {
			this.stipendio = stipendio;
		}
	}

	public int getAnniServizio() {
		return anniServizio;
	}

	public double getStipendio() {
		return stipendio;
	}

	public double getStipendioMinimo() {
		return stipendioMinimo;
	}
	
	public double guadagnoTotale() {
		return 12 * this.anniServizio * this.stipendio;
	}

}
