package chapter07.E_10;

import java.util.Scanner;

/*
 * Progettate la classe DataSet che memorizzi una sequenza di valori di tipo double,
 * con un costruttore che riceve la lunghezza massima della sequenza:
 * 
 * public DataSet(int maximumNumberOfValues)
 * 
 * e un metodo:
 * 
 * public void add(double value)
 * 
 * che aggiunge un valore alla sequenza, se c'è ancora posto. 
 * 
 * Aggiungete altri metodi per calcolare:
 *  
 * - la somma, 
 * - il valore medio, 
 * - il valore massimo 
 * - il valore minimo della sequenza.
 */

/**
 * Allow to create an array with a specific lenght and perform varios operations.
 * @author Clickstr33t;
 *
 */
public class DataSet {
	private double[] array;
	private int currentPosition;
	
	
	/**
	 * Initialize an array with a specific length.
	 * @param maximumNumberOfValues Lenght of the array.
	 */
	public DataSet(int maximumNumberOfValues) {
		this.array = new double[maximumNumberOfValues];
		this.currentPosition = 0;
	}
	
	/**
	 * Progressive add a double type value to the array.
	 * @param value double type to add.
	 */
	public void add(double value) {
		if (currentPosition < array.length-1) {
			array[currentPosition] = value;
			currentPosition++;
		} else {
			System.out.println("L'array è completo, non puoi aggiungere altri elementi.");
		}
	}
	
	/**
	 * Calculate the sum of all array records.
	 * @return total of the sum.
	 */
	public double sum() {
		double total = 0;
		for (int i = 0; i < currentPosition; i++) {
			total = total + array[i];
		}
		return total;
	}
	
	/**
	 * Calculate the average from all the records
	 * @return average
	 */
	public double average () {
		double average = this.sum()/(this.currentPosition+1);
		return average;
	}
	
	/**
	 * Find the max value insert in the array.
	 * @return max value
	 */
	public double max() {
		double max = array[0];
		for (int i = 0; i < currentPosition; i++) {
			max = Math.max(max, array[i]);
		}
		return max;
	}
	
	/**
	 * Find the max value insert in the array.
	 * @return max value
	 */
	public double min() {
		double min = array[0];
		for (int i = 0; i < currentPosition; i++) {
			min = Math.min(min, array[i]);
		}
		return min;
	}
}
