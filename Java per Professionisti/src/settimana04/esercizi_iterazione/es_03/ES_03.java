package settimana04.esercizi_iterazione.es_03;

public class ES_03 {
	public static void main(String[] args) {
		for (int i=1; i<101; i++) {
			if (i%10==0) {
			System.out.println(i+"  ");
			}else if (i<10){
			System.out.print(i+"    ");	
			}else {
			System.out.print(i+"   ");
			}
		}
	}

}
