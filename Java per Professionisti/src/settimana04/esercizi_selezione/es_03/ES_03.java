package settimana04.esercizi_selezione.es_03;

public class ES_03 {
	public static void main(String[] args) {
		int choise = Integer.parseInt(args[0]);
		
		System.out.print("MENU:\n1.Tiramisù\n2.Torta della notta\n3.Cheescacke alla nutella\n4.Macedonia\n\n");
		switch (choise){
		case 1: System.out.println("Hai scelto Tiramisù");
		break;
		case 2: System.out.println("Hai scelto Torta della nonna");
		break;
		case 3: System.out.println("Hai scelto Cheescacke alla nutella");
		break;
		case 4: System.out.println("Hai scelto Macedonia");
		break;
		default: System.out.println("Dolce non disponibile");
		break;
		}
	
	}
}
