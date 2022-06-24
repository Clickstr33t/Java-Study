package Chapter03.E03_17;

public class MothTester {
	public static void main(String[] args) {
		Moth andrea = new Moth(0);
		andrea.moveToLight(200);
		andrea.moveToLight(50);
		System.out.println("Valore atteso 75");
		System.out.println(andrea.getPosition());
	}

}
