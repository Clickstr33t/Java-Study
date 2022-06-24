package chapter07.E_12;

/*
 * Aggiungete il metodo
 * 
 * public boolean equals(Sequence other)
 * 
 * che verifichi se due sequenze contengono gli stessi valori, nello stesso ordine.
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
		if (values.length != other.size()) {
			return false;
		}
		for (int i = 0; i < values.length; i++) {
			if (values[i] != other.get(i)) {
				return false;
			}
		}
		return true;
	}
}
