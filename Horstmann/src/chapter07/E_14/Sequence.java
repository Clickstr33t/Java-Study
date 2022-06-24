package chapter07.E_14;

/*
 * Aggiungete il metodo
 * 
 * public boolean isPermutation (Sequence other)
 * 
 * che verifichi se due sequenze contengono gli stessi valori con le stesse molteplicità,
 * indipendentemente dall'ordine. Ad esempio la sequenza:
 * 
 * 1 4 9 16 9 7 4 9 11
 * 
 * è una permutazionei della sequenza:
 * 
 * 11 1 4 9 16 9 7 4 9 
 * 
 * mentre la sequenza
 * 
 * 1 4 9 16 9 7 4 9 11
 * 
 * non è una permutazione della sequenza 
 * 
 * 11 11 7 9 16 4 1 4 9 
 * 
 * probabilmente avrete bisogno di qualche metodo ausiliario
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
	
	public boolean isPermutation (Sequence other) {
		int[] temp = new int[other.size()];
		int tempLenght = temp.length;
		//creo una copia di other in un array temp
		for (int i = 0; i < other.size(); i++) {
			temp[i] = other.get(i);
		}
		// elimino uno ad uno i valori della sequenza dall'array temporaneo
		if (this.size() != other.size()) {
			return false;
		}
		for (int i = 0; i < this.size(); i++) {			// con i ciclo this
			for (int j = 0; j < tempLenght; j++) {		// con j ciclo temp	
				if (temp[j] == this.get(i)) {
					// Riorganizzo l'array temp
					for (int z = j+1; z < tempLenght; z++) {
						temp[z-1]=temp[z];
					}
					tempLenght--; 						// diminuisco la grandeza
					break;								// passo al prossimo caratter
				}
				//se ho ciclato tutto temp e non trovo un match return false
				if (j == tempLenght-1) {				
					return false;
				}
			}
		}
		return true;
	}
}
