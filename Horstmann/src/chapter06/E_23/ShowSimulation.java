package chapter06.E_23;

import java.util.Random;

public class ShowSimulation {
	public static void main(String[] args) {
		Random gen = new Random();
		double count = 0;
		double winA = 0;
		double winB = 0;
		while (count < 1000) {
			int car = gen.nextInt(3);
			int choise = gen.nextInt(3);
			int change = 3;
			if (choise == car) {
				while (change == 3) {
					int random = gen.nextInt(3);
					if (random != choise) {
						change = random;
					}
				}
			} else {
				change = car;
			}
			if (car == choise) {
				winA++;
			}
			if (car == change) {
				winB++;
			}
			count++;
		}
		double percentVictory = winA/count*100;
		System.out.println("Senza cambio : " + percentVictory);
		percentVictory = winB/count*100;
		System.out.println("Con il Cambio: " + percentVictory);
	}

}
