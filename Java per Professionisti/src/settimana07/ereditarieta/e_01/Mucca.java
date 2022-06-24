package settimana07.ereditarieta.e_01;

public class Mucca extends Animale{
	
	public Mucca(String nome) {
		super (nome);
	}

	@Override
	public void verso(){
		System.out.println("muuu");
	}
}
