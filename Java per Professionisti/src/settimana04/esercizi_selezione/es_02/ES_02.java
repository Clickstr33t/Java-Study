package settimana04.esercizi_selezione.es_02;

public class ES_02 {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);
		int d = Integer.parseInt(args[3]);
		int maggiore =a;
		int minore = a;
		
		
		if (b>a && b>c && b>d) {
			maggiore =b;
		}else if(c>a && c>b && c>d) {
			maggiore = c;
		}else if(d>a && d>b && d>c) {
			maggiore = d;
		}
		
		if (b<a && b<c && b<d) {
			minore=b;
		}else if (c<a && c<b && c<d) {
			minore=c;
		}else if (d<a && d<b && d<c) {
			minore=d;
		}

		
		System.out.println("Maggiore = "+maggiore);
		System.out.println("Minore = "+ minore);
	}

}
