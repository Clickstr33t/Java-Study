package settimana04.esercizi_selezione.es_04;

public class ES_04 {
	public static void main(String[] args) {
		int choise = Integer.parseInt(args[0]);
		boolean check = false;
		
		if (choise%3 == 0 && choise%5 != 0 &&choise%7 != 0) {
			check=true;
		}else if (choise%3 != 0 && choise%5 == 0 &&choise%7 != 0) {
			check=true;
		}else if (choise%3 != 0 && choise%5 != 0 &&choise%7 == 0) {
			check=true;
		}
		System.out.println(check);
	}

}
