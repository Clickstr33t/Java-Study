package Chapter03.E03_13;

public class CarTester {
	public static void main(String[] args) {
		Car andrea = new Car(1);
		andrea.addGas(100);
		andrea.drive(50);
		System.out.println(andrea.getGasInTank());
		andrea.addGas(150);
		System.out.println(andrea.getGasInTank());
	}

}
