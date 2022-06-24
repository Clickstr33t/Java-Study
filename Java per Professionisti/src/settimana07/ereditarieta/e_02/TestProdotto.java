package settimana07.ereditarieta.e_02;

public class TestProdotto {
	public static void main(String[] args) {
		Prodotto scarpe = new Prodotto(1, 100, 26);
		Prodotto scarpeLIDL = new Prodotto(2, "LIDL", 300, 20);
		
		System.out.printf("%1.2f%n", scarpe.scorporoIva());
		System.out.printf("%1.2f", scarpeLIDL.scorporoIva());
	}

}
