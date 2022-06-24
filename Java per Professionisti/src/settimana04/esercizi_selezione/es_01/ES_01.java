package settimana04.esercizi_selezione.es_01;

public class ES_01 {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		if (a==b) {
			System.out.println("a e b sono uguali!");
		}
		else if (a>b) {
			System.out.println("a è maggiore di b!");
		}else{
			System.out.println("b è maggiore di a!");
		}				
	}
}
