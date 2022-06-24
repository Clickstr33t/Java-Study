package chapter07.E_18;

/*
 * Aggiungete alla classe Table il metodo
 * 
 * public double sum(int i, boolean horizontal)
 * 
 * che restituisca la somma degli elementi della riga i-esima 
 * ( se il valore di horizontal è true) 
 * o della colonna i-esima 
 * (se il valore di horizontal è false).
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
	
	public double sum(int i, boolean horizontal) {
		int total = 0;
		
		if (horizontal) {
			for (int j = 0; j < values[0].length; j++) {
				total = total + values[i][j];
			}
		} else {
			for (int j = 0; j < values.length; j++) {
				total = total + values[j][i];
			}
		}
		
		return total;
	}
}
