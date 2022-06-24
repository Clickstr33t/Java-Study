package settimana08.esercizi.es_01;

public class TestTorcia {
	public static void main(String[] args) {
		Torcia t = new Torcia("Duracell");
		
		t.accendi();
		
		// Lancia eccezione TorciaAccesaException
		//t.accendi();
		
		t.spegni();
		
		// Lancia eccezione TorciaSpentaException
		t.spegni();
		
	}

}
