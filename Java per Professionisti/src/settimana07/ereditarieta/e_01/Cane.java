package settimana07.ereditarieta.e_01;

public class Cane extends Animale{
	
	public Cane (String nome) {
		super (nome);
	}

	@Override
	public void verso() {
		System.out.println("bau");
	}
}
