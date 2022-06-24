package settimana05.esercizi_metodi.es_06;

import java.util.Scanner;

public class Doppio {
	public static void main(String[] args) {
		System.out.println(doppio());
	}
	
	public static int doppio() {
		Scanner s = new Scanner(System.in);
		System.out.print("Inserisci il numero da raddoppiare: ");
		int num = s.nextInt();
		s.close();
		return num*2;
	}

}
