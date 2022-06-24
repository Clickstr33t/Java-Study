package Chapter03.E03_14;

public class ProductTester {
	public static void main(String[] args) {
		Product toaster = new Product("Toaster", 200);
		Product computer = new Product("Computer", 1000);
		toaster.reducePrice(5);
		computer.reducePrice(5);
		System.out.println(toaster.getPrice());
		System.out.println(computer.getPrice());
	}

}
