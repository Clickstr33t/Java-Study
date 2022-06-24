package settimana04.esercizi_iterazione.es_06;

public class ES_06 {
	public static void main(String[] args) {
		int a = 11;
		if (a%2==0) {
			System.out.println("Inserisci un numero dispari!");
		}else {		
		for (int i=0; i<a; i=i+2) {
			
			for (int z=0; z<(a-i)/2; z++) {
				System.out.print(" ");
			}
			for (int k=0; k<=i; k++) {
				
				System.out.print("X");
			}
			
			System.out.print("\n");
		}
	
		for (int i=a-2; i>0; i=i-2) {
			
			for (int z=0; z<=(a-2-i)/2; z++) {
				
				System.out.print(" ");
			}
			for (int k=0; k<i; k++) {
				
				System.out.print("X");
			}
			
			System.out.print("\n");
		}
	}
	}
}
