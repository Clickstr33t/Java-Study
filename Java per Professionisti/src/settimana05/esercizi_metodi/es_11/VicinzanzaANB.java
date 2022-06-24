package settimana05.esercizi_metodi.es_11;

public class VicinzanzaANB {
	public static void main(String[] args) {
		int a = 76;
		int b = 13;
		int n = 23;
		
		int distA = (a - n) < 0 ? -1*(a-n) : (a-n);
		int distB = (b - n) < 0 ? -1*(b-n) : (b-n);
		
		System.out.println("Distanza A: "+distA);
		System.out.println("Distanza B: "+distB);
		
		if (distA==distB) {
			System.out.println("Pareggio");
		}
		else if (distA>distB) {
			System.out.println("Vince B");
		}
		else {
			System.out.println("Vince A");
		}
	}

}
