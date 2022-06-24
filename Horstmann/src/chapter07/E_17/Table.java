package chapter07.E_17;

/*
 * Aggiungete alla classe Table un metodo che calcoli il valore medio 
 * tra gli otto valori adiacenti nelle diverse direzioni (come visualizzato 
 * nella Figura 15 del Paragrafo 7.6.3) a un determinato elmento della tabella:
 * 
 * public double neighborAverage(int row, int column)
 * 
 * Se l'elemento in esame si trova in bordo della tabella considerate soltanto 
 * gli elmenti adiacenti che appartengono effettivamente alla tabella stessa: 
 * ad esempio, se row e column valgono 0, esistono soltanto tre elementi adiacenti.
 * 
 */

public class Table {
	private int [][] values;
	
	public Table(int rows, int columns) {
		values = new int[rows][columns];
	}
	public void set(int i, int j, int n) {
		values[i][j]=n;
	}
	
	public double neighborAverage(int row, int column) {
		int total = 0;
		int count = 0;
		// N
		if (row > 0) {
			total = total + values[row-1][column];
			count++;
		} 
		// S
		if (row < values.length-1) {
			total = total + values[row+1][column];
			count++;
		} 
		// W
		if (column > 0) {
			total = total + values[row][column-1];
			count++;
		}
		// E
		if (column < values[0].length-1) {
			total = total + values[row][column+1];
			count++;
		}
		// NW
		if (row > 0 && column >0) {
			total = total + values[row-1][column-1];
			count++;
		} 
		// NE
		if (row > 0 && column < values[0].length-1) {
			total = total + values[row-1][column+1];
			count++;
		} 
		// SW
		if (row < values.length-1 && column > 0) {
			total = total + values[row+1][column-1];
			count++;
		} 
		// SE
		if (row < values.length-1 && column < values[0].length-1) {
			total = total + values[row+1][column+1];
			count++;
		}
		return total/count;
	}
}
