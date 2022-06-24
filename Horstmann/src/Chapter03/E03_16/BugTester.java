package Chapter03.E03_16;

public class BugTester {
	public static void main(String[] args) {
		Bug andrea = new Bug(100);
		andrea.move();
		andrea.move();
		andrea.turn();
		andrea.move();
		System.out.println("Valore atteso 101");
		System.out.println(andrea.getPosition());
	}

}
