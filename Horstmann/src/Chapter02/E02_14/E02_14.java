package Chapter02.E02_14;

import java.util.Random;

public class E02_14 {
	public static void main(String[] args) {
		double priceRandom = new Random().nextDouble(10.00, 19.95);
		System.out.println(priceRandom);
	}
}
