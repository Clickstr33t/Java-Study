package settimana05.esercizi_metodi.es_02;

import java.util.Scanner;

public class ES_02 {
	public static void main(String[] args) {
		String a,b;
		Scanner input = new Scanner(System.in);
		System.out.print("Inserisci il primo numero: ");
		a = input.next();
		System.out.print("Inserisci il secondo numero: ");
		b = input.next();
		if (Double.parseDouble(a)==Double.parseDouble(b)) {
			System.out.println("TRUE");
		}else {
			System.out.println("FALSE");
		}
		input.close();
	}

}
