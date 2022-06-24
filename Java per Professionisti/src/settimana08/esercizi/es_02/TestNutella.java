package settimana08.esercizi.es_02;

public class TestNutella {
	public static void main(String[] args) {
		BarattoloNutella nuovo = new BarattoloNutella(
				"Nutella",
				new String[] {"Zucchero", "Olio di palma", "Cacao magro", "Latte Scremato", "Vanillina"},
				"Una volta consumato buttare il barattolo nel vetro, il coperchio nella plastica",
				450);
		System.out.println(nuovo.getCalories100());
		System.out.println(nuovo.getTotalCalories());
		System.out.println(nuovo.getWeight());
		
		System.out.println("\nMangia 400g");
		nuovo.getNutella(400);
		System.out.println(nuovo.getCalories100());
		System.out.println(nuovo.getTotalCalories());
		System.out.println(nuovo.getWeight());
		
		//nuovo.getNutella(60);		// Lancia un eccezione nutella finita
	}

}
