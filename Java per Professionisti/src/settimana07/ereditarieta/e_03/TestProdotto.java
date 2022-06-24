package settimana07.ereditarieta.e_03;

public class TestProdotto {
	public static void main(String[] args) {
		Prodotto scarpe = new Prodotto(1, 100, 26);
		Prodotto scarpeLIDL = new Prodotto(2, "LIDL", 300, 20);
		Prodotto scarpeGeneriche = new Prodotto(1, "Generiche", 100, 26);
		
		System.out.printf("%1.2f%n", scarpe.scorporoIva());
		System.out.printf("%1.2f%n", scarpeLIDL.scorporoIva());
		System.out.println(scarpe.toString());
		System.out.println(scarpeLIDL.toString());
		System.out.println(scarpe.equals(scarpeLIDL));
		System.out.println(scarpe.equals(scarpeGeneriche));
		System.out.println(scarpe.getPercetnIva());
		scarpe.setPercetnIva(39);
		System.out.println(scarpe.getPercetnIva());
		scarpe.setPercetnIva(22);
		System.out.println(scarpe.getPercetnIva());
	}

}
