package chapter06.E_05;

import java.util.Scanner;

public class DataSet {
	private double average;
	private double smallest;
	private double largest;
	private double range;
	private double sum;
	private int count;

	public DataSet() {
		Scanner s = new Scanner(System.in);
		System.out.print("Inserisci numero per continuare o no per uscire: ");
		if (s.hasNextFloat()) {
			this.largest = s.nextDouble();
			this.smallest = this.largest;
			this.sum = this.largest;
			this.count++;
			System.out.print("Inserisci numero per continuare o no per uscire: ");
			while (s.hasNextFloat()) {
				System.out.print("Inserisci numero per continuare o no per uscire: ");
				int num = s.nextInt();
				smallest = Math.min(num, smallest);
				largest = Math.max(num, largest);
				this.count ++;
				this.sum += num;
			}
		}
		s.close();
		System.out.println("Inserimento completato.");
	}

	public double getAverage() {
		this.average = sum/count;
		return average;
	}

	public double getSmallest() {
		return smallest;
	}

	public double getLargest() {
		return largest;
	}

	public double getRange() {
		this.range = Math.abs(this.largest-this.smallest);
		return range;
	}
}
