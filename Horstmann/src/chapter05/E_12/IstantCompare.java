package chapter05.E_12;

import java.sql.Time;
import java.util.Scanner;

public class IstantCompare {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Inserisci ora istante 1: ");
		int ora1 = s.nextInt();
		System.out.print("Inserisci minuti instante 1: ");
		int min1 = s.nextInt();
		System.out.print("Inserisci ora istante 2: ");
		int ora2 = s.nextInt();
		System.out.print("Inserisci minuti instante 2: ");
		int min2 = s.nextInt();
		Time istant = new Time(ora1, min1,0);
		Time other = new Time(ora2, min2, 0);
		System.out.println(istant.compareTo(other));
		
		s.close();
	}

}
