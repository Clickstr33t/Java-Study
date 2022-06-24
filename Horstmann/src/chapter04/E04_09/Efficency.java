package chapter04.E04_09;

import java.util.Scanner;

public class Efficency {
	public static void main(String[] args) {
		double milesPerGalls, priceForOneGalls;
		double fuellNecessary=0;
		double fuellAvailable=0;
		
		
		Scanner input = new Scanner(System.in);
		System.out.print("Inserisci quantità di carburate presente (Galloni): ");
		fuellAvailable = input.nextDouble();
		System.out.print("Inserisci efficienza motore (Miglia/Gallone): ");
		milesPerGalls = input.nextDouble();
		System.out.print("Inserisci prezzo del carburante (Price/Gallone): ");
		priceForOneGalls = input.nextDouble();
		
		fuellNecessary = 100/milesPerGalls;
		
		if (fuellNecessary>fuellAvailable) {
		System.out.println("\nPer percorrere 100 Miles ti servono altri " +
				(fuellNecessary-fuellAvailable) + 
				" galloni, al costo di "+
				((fuellNecessary-fuellAvailable)*priceForOneGalls) +
				"$.");
		}else if(fuellNecessary<fuellAvailable)
		{System.out.println("Per percorrere 100 Miles spendi " +
				(fuellNecessary*priceForOneGalls) + 
				"$ e con i rimanenti galloni puoi percorrere altre "+
				((fuellAvailable-fuellNecessary)*milesPerGalls) +
				" miglia.");
		}else {
		System.out.println("Per percorrere 100 Miles spendi " +
				(fuellNecessary*priceForOneGalls) + 
				"$ e non rimangono + galloni nel serbatoio.");	
		}
	}
}
