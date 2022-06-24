package chapter05.E_22;

import java.util.Scanner;

public class Paycheck {
	private String name;
	private double dollarsForHours;
	
	public Paycheck (String name, double dollarsForHours) {
		this.name = name;
		this.dollarsForHours = dollarsForHours;
	}
	
	public double calculateSalary() {
		double DFH = this.dollarsForHours;
		double salary;
		Scanner s = new Scanner (System.in);
		System.out.print("Inserisci le ore lavorate di "+name+":");
		double hours = s.nextDouble();
		s.close();
		if (hours <0) {
			salary=0;
		}
		else if (hours <=40 ) {
			salary = hours*DFH;
		}else{
			salary = 40*DFH + ((hours-40)*DFH*2.5);
		}
		return salary;
	}

}
