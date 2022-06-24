package chapter07.E_23;

import java.util.ArrayList;

/*
 * Aggiungere il metodo
 * 
 * public Sequence append(Sequence other)
 * 
 * che crei una nuova sequenza, ottenuta aggiungendo il contenuto della sequenza other
 * in fondo a quello della sequenza in esame, senza modificare nessuna delle due.
 * Se ad esempio,
 * 
 * a è la sequenza:
 * 
 * 1 4 9 16
 * 
 * e b è la sequenza:
 * 
 * 9 7 4 9 11
 * 
 * allora l'invocazione a.append(b) restiuisce la sequenza:
 * 
 * 1 4 9 16 9 7 4 9 11
 * 
 * senza modificare a o b
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
}
