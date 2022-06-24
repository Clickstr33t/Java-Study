package chapter04.E04_22;

public class SodaCanTester {
	public static void main(String[] args) {
		SodaCan test = new SodaCan(100, 50);
		System.out.printf("Surface : %.2f\n", test.getSurface());
		System.out.printf("Volume : %.2f\n", test.getVolume());
	}

}
