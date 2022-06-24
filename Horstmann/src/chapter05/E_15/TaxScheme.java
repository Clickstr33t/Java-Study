package chapter05.E_15;

import java.util.Scanner;

public class TaxScheme {
	
	static final double TAX1 = 50000 / 100 *1;
	static final double TAX2 = (75000 - 50000) / 100 *2;
	static final double TAX3 = (100000 - 75000) / 100 *3;
	static final double TAX4 = (250000 - 100000) / 100 *4;
	static final double TAX5 = (500000 - 250000) / 100 *5;
	
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("inserisci il reddito: ");
		double reddit = Math.abs(s.nextDouble());
		System.out.print(getTaxation(reddit));
		s.close();
	}
	public static double getTaxation(double reddit) {
		double taxation = 0;
		if (reddit > 0 && reddit<=50000) {
			taxation = reddit /100 *1;
		}else if(reddit > 50000 && reddit<=75000){
			taxation = (reddit - 50000) /100 *2 
					+ TAX1;
		}else if(reddit > 75000 && reddit<=100000){
			taxation = (reddit - 75000) /100 *3 
					+ TAX1 + TAX2;
		}else if(reddit > 100000 && reddit<=250000){
			taxation = (reddit - 100000) /100 *4 
					+ TAX1 + TAX2 + TAX3;
		}else if(reddit > 250000 && reddit<=500000){
			taxation = (reddit - 250000) /100 *5 
					+ TAX1 + TAX2 + TAX3 + TAX4;
		}else if(reddit > 500000){
			taxation = (reddit - 500000) /100 *6 
					+ TAX1 + TAX2 + TAX3 + TAX4 + TAX5;
		}
		
		return taxation;
	}
}
