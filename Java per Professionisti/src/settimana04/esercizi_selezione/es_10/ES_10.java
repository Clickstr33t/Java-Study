package settimana04.esercizi_selezione.es_10;

public class ES_10 {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		String operazione = args[2];
		
		switch (operazione) {
		case "somma": System.out.println(a + b);
		break;
		
		case "sottrazione": System.out.println(a - b);
		break;

		case "moltiplicazione": System.out.println(a * b);
		break;
		
		case "divisione": System.out.println(a / b);
		break;
		
		case "modulo": System.out.println(a % b);
		break;
		
		case "potenza": System.out.println(Math.pow(a, b));
		break;
		
		case "media": System.out.println((a + b)/2);
		break;
		
		default: System.out.println("Inserisci un operazione valida");
		break;
		}
		
		
	}
}
