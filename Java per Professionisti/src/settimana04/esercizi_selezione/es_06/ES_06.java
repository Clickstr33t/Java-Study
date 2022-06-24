package settimana04.esercizi_selezione.es_06;

public class ES_06 {
	public static void main(String[] args) {
		int choise = Integer.parseInt(args[0]);
		
		switch (choise) {
		case 1: System.out.println("Lunedi");
		break;
		case 2: System.out.println("Martedi");
		break;
		case 3: System.out.println("Mercoledi");
		break;
		case 4: System.out.println("Giovedi");
		break;
		case 5: System.out.println("Venerdi");
		break;
		case 6: System.out.println("Sabato");
		break;
		case 7: System.out.println("Domenica");
		break;
		default: System.out.println("Valore settimanale non valido");
		break;
		}
	
	}

}
