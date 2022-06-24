package settimana06.esercizi_valori_casuali.esercitazioni;

import java.util.Random;

public class Dadi {
	public static void main(String[] args) {
		int num = new Random().nextInt(5)+1;
		System.out.println(num);
	}

}
