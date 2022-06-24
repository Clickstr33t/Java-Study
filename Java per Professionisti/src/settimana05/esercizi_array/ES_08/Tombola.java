package settimana05.esercizi_array.ES_08;

public class Tombola {
	public static void main(String [] args) {
		int [] schedina = {21, 22, 23, 24, 25, 26, 27, 28, 29, 11};
		int [] schedinaVincente = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		analisiSchedina(schedina, schedinaVincente);
		
	}
	
	public static void analisiSchedina (int[] a, int[] b) {
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j=0; j < b.length; j++)
				if (a[i] == b [j]) {
					count++;
				}
		}
		if (count <= 1) {
			System.out.println("Mi dispiace, hai perso!");
		}else if (count == 2) {
			System.out.println("Hai fatto AMBO");
		}else if (count == 3) {
			System.out.println("Hai fatto TERNO");
		}else if (count == 4) {
			System.out.println("Hai fatto QUATERNA");
		}else if (count < 10) {
			System.out.println("Hai fatto CINQUINA");
		}else {
			System.out.println("Hai fatto TOMBOLA");
		}
	}

}
