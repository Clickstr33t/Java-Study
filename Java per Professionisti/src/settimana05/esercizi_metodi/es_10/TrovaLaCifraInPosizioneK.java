package settimana05.esercizi_metodi.es_10;

public class TrovaLaCifraInPosizioneK {
	public static void main(String[] args) {
		int a = 123456;
		int b = 4;
		
		a=(int)(a/Math.pow(10, b-1));
		int c = a%10;
		System.out.println(c);
	}

}
