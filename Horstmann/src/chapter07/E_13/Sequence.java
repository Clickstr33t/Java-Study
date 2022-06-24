package chapter07.E_13;

/*
 * Aggiungete il metodo
 * 
 * public boolean sameValues (Sequence other)
 * 
 * che verifichi se due sequenze contengono gli stessi valori, indipendentemente dall'ordine
 * ed ignorando la presenza di valori duplicati.
 * Ad esempio, le due sequenze.
 * 
 * 1 4 9 16 9 7 4 9 11 
 * 
 * e
 * 
 * 11 11 7 9 16 4 1 
 * 
 * devono essere considerate uguali. 
 * Probabilmente avrete bisogno di qualche metodo ausiliario
 */
public class Sequence {
	private int[] values;
	
	public Sequence (int size) {
		values = new int[size];
	}
	
	public void set(int i, int n) {
		values[i] = n;
	}
	
	public int get (int i) {
		return values[i];
	}
	
	public int size() {
		return values.length;
	}
	
	public boolean equals (Sequence other) {
		if (this.size() != other.size()) {
			return false;
		}
		for (int i = 0; i < this.size(); i++) {
			if (this.get(i) != other.get(i)) {
				return false;
			}
		}
		return true;
	}
	
	public boolean sameValues (Sequence other) {
		for (int i = 0; i < this.size(); i++) {
			for (int j = 0; j < other.size(); j++) {
				if (this.get(i)==other.get(j)) {
					break;
				}
				if (j == other.size()-1) {
					return false;
				}
			}
		}
		return true;
	}
}
