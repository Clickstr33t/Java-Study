package chapter07.E_24;

import java.util.ArrayList;

/*
 * Aggiungete il seguente metodo:
 * 
 * public Sequence merge (Sequence other)
 * 
 * che restituisca una sequenza i cui elementi siano presi alternativamente 
 * dalle due sequenze elaborate. Se una delle due sequenze è più corta dell'altra, 
 * dopo aver terminato l'alternanza bisogna aggiungere al risultato gli elmenti 
 * rimasti nella sequenza oiù lunga. 
 * 
 * Se, ad esempio, a è la sequenza:
 * 
 * 1 4 9 16
 * 
 * e b è la sequenza
 * 
 * 9 7 4 9 11
 * 
 * allora l'invocazione a.merge(b) restituisce la sequenza
 * 
 * 1 9 4 7 9 4 16 9 11
 * 
 * senza modificare a o b.
 */

public class Sequence {
	private ArrayList<Integer> values;
	
	public Sequence() {
		values = new ArrayList<Integer>();
	}	
		
	public void add(int n) {
		values.add(n);
	}
	
	public String toString() {
		return values.toString();
	}
	
	public int getSize() {
		return values.size();
	}
	
	public int get(int i) {
		return values.get(i);
	}

	public Sequence append(Sequence other) {
		Sequence merge = new Sequence();
		for (int i = 0; i < this.getSize(); i++) {
			merge.add(this.get(i));
		}
		for (int i = 0; i < other.getSize(); i++) {
			merge.add(other.get(i));
		}
		return merge;
	}
	
	public Sequence merge (Sequence other) {
		Sequence merge = new Sequence();
		for (int i = 0; i< Math.max(this.getSize(), other.getSize()); i++) {
			if (i < this.getSize()) {
				merge.add(this.get(i));
			}
			if (i < other.getSize()) {
				merge.add(other.get(i));
			}
		}
		return merge;
	}
}
