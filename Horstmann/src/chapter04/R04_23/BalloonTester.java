package chapter04.R04_23;

public class BalloonTester {
	public static void main(String[] args) {
		Balloon test = new Balloon();
		test.addAir(100);
		System.out.println(test.getVolume());
		System.out.println(test.getSurfaceArea());
		System.out.println(test.getRadius());
		test.addAir(100);
		System.out.println(test.getVolume());
		System.out.println(test.getSurfaceArea());
		System.out.println(test.getRadius());
		}
}
