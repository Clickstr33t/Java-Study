package Chapter03.E03_15;

public class LetterTest {
	public static void main(String[] args) {
		Letter andrea = new Letter("Papa Francesco", "Satana");
		andrea.addLine("1. Mannagga Belzebu!");
		andrea.addLine("2. Mi vogliono far fuori!");
		System.out.println(andrea.getText());
	}

}
