package chapter07.E_25;

import java.util.ArrayList;

/*
 * Aggiungere il metodo
 * 
 * public Sequence mergeSorted(Sequence other)
 * 
 * che fonda due sequenze ordinate, generando una sequenza.
 * Usate un indice per ciascuna sequenza, per tenere traccia della posizione gia elaborata.
 * Ad ogni passo aggiungete allla sequenza in construzione l'elemento minimo tra quelli non
 * ancora elaborati, prendendolo da una delle due sequenze di partenza e incrementando
 * l'indice di conseguenza.
 * 
 * Se, ad esempio, a è la sequenza:
 * 
 * 1 4 9 16
 * 
 * e b è la sequenza:
 * 
 * 4 7 9 9 11
 * 
 * allora l'invocazione a.mergeSorted(b) restituisce la sequenza
 * 
 * 1 4 4 7 9 9 9 11 16
 * 
 * senza modificare a o bi. in caso di sequenze non originariamente ordinate fondete
 * i più lunghi prefissi ordinati di a e b.
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
	
	public Sequence mergeSorted(Sequence other) {
		Sequence merge = new Sequence();
		for (int j = 0, z = 0; j + z < (this.getSize() + other.getSize()); ) {
			if (j < this.getSize() && z < other.getSize()) {
				if (this.get(j) < other.get(z)) {
					merge.add(this.get(j));
					j++;
				} else {
					merge.add(other.get(z));
					z++;
				}
			} else if (j < this.getSize()){
				merge.add(this.get(j));
				j++;
			} else {
				merge.add(other.get(z));
				z++;
			}
		}
		return merge;
	}
}
