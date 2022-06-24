package chapter07.E_11;

/*
 *   Scrivete motodi che risolvano i problemi seguenti per un array di numeri interi,
 *   fornendo un programma di collaudo per ciascun metodo.
 *   I metodi vanno inseriti a completamento della classe ArrayMethods:
 *  
 *   a. Scambiare tra loro il primo e l'ultimo elemento dell'array.
 *  
 *   b. Far scorrere tutti gli elemnti di una posizione"verso destra", 
 *   spostando l'ultimo elemento nella prima posizione. 
 *   Ad esempio, l'array 1 4 9 16 25 deve diventare 25 1 4 9 16.
 *  
 *   c. Sostituire con 0 tutti gli elementi pari.
 *  
 *   d. Sostituire ciascune elmento, tranne il primo e l'ultimo, 
 *   con il più grande dei due elmenti adiacienti.
 *  
 *   e. Eliminare l'elemento centrale dell'array se questo ha dimensione dispari,
 *   altrimenti eliminare i due elementi centrali.
 *   
 *   f. Spostare tutti gli elementi pari all'inizio dell'array, preservando però 
 *   l'ordinamento relativo tra gli elmenti, se si esclude la condizione imposta.
 *   
 *   g. Restituite il secondo valore maggiore dell'array, cioè il valore massimo 
 *   tra quelli inferiori al valore massimo presente nell'array.
 *  
 *   h. Restituite true se e solo se l'array è ordinato in senso crescente.
 *   
 *   i. Restituite true se e solo se l'array contiene due elmenti adiacenti duplicati.
 *   
 *   j. Restitutite true se e solo se l'array contiene elementi duplicanti (non
 *   necessariamente adiacenti) 
 *   
 *  
 */


public class ArrayMethods {
	private int[] values;
	
	public ArrayMethods (int[] initialValues) {
		values = initialValues;
	}
	
	// a.
	public void swapFirstAndLast() {
		int temp = this.values[0];
		values[0] = values[values.length-1];
		values[values.length-1] = temp;
	}
	
	// b.
	public void shiftRight() {
		int temp = values[0];
		for (int i = 1; i < values.length; i++) {
			values[i-1] = values [i];
		}
		values[values.length-1] = temp;
	}

	// c.
	public void evenToZeros() {
		for (int i = 0; i < values.length; i++) {
			if (values[i] %2 == 0) {
				values[i] = 0;
			}
		}
	}
	
	// d.
	
	// e.
	public void removeCenter() {
		if (values.length % 2 == 0) {
			values[values.length/2] = 0;
			values[values.length/2 - 1] = 0;
		} else {
			values[values.length/2] = 0;
		}
	}
	
	// f.
	public void moveEvenLeft() {
		int temp [] = new int[values.length];
		int i = 0;
		for (int x : values) {
			if (x % 2 == 0) {
				temp[i] = x;
				i++;
			}
		}
		for (int x : values) {
			if (x % 2 != 0) {
				temp[i] = x;
				i++;
			}
		}
		values = temp;
	}
	
	// g.
	public int secondMaxValue() {
		int max = values[0];
		int temp = max;
		for (int x : values) {
			if (x > max) {
				temp = max;
				max = x;
			}
		}
		return temp;
	}
	
	// h.
	public boolean crescentOrder() {
		for (int i = 1; i < values.length; i++) {
			if (values[i-1]> values[i]) {
				return false;
			}
		}
		return true;
	}
	
	// i.
	public boolean twoNearElements() {
		for (int i = 1; i < values.length; i++) {
			if (values[i-1] == values[i]) {
				return true;
			}
		}
		return false;
	}
	
	// j.
	public boolean duplicate() {
		for (int i = 0; i < values.length; i++) {
			for (int j = 0; j < values.length; j++) {
				if(i==j) {
					continue;
				} else {
					if (values[i] == values[j]) {
						return true;
					} else {
						return false;
					}
				}
			}
		}
		return false;
	}
	
	public int[] getValues() {
		return values;
	}
}
