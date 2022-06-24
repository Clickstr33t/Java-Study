package chapter06.E_04;

public class R_04 {
	public static void main (String[] args) {
		int number = 32677;
		int sum = 0;
		do {
			if (number % 2 != 0) {
				int value = number % 10;
				System.out.print(value + " ");
				sum += value;
			}
			number = number /10;
		}
		while (number >= 1);
		System.out.println("\nSomma: " + sum);
	}
}
