package settimana04.esercizi_selezione.es_09;

public class ES_09 {
	public static void main(String[] args) {
		int a = Integer.parseInt(args [0]);
		int b = Integer.parseInt(args [1]);
		int c = Integer.parseInt(args [2]);
		int d = Integer.parseInt(args [3]);
		
		if (a == d) {System.out.println("a");}
		if (b == d) {System.out.println("b");}
		if (c == d) {System.out.println("c");}
		if (a + b + c == d) {System.out.println("a + b + c + d");}
		if (a + b == d) {System.out.println("a + b");}
		if (a + c == d) {System.out.println("a + c");}
		if (b + c == d) {System.out.println("b + c");}
	}
}
