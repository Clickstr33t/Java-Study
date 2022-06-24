package settimana04.esercizi_iterazione.es_04;

public class ES_04 {
	public static void main(String[] args) {
		int i = 0;
		do {
			System.out.println(Integer.parseInt(args[0])*i);
			i++;
		}
		while(i<=10);
	}

}
