package chapter07.E_17;

public class TableTest {
	public static void main (String[] args) {
		Table test = new Table(3,3);
		
		test.set(0, 0, 1);
		test.set(0, 1, 1);
		test.set(0, 2, 1);
		test.set(1, 0, 1);
		test.set(1, 1, 1);
		test.set(1, 2, 1);
		test.set(2, 0, 1);
		test.set(2, 1, 1);
		test.set(2, 2, 1);
		
		System.out.println(test.neighborAverage(0, 0));
		System.out.println(test.neighborAverage(0, 1));
		System.out.println(test.neighborAverage(0, 2));
		
		System.out.println("---");
		
		System.out.println(test.neighborAverage(1, 0));
		System.out.println(test.neighborAverage(1, 1));
		System.out.println(test.neighborAverage(1, 2));

		System.out.println("---");
		
		System.out.println(test.neighborAverage(2, 0));
		System.out.println(test.neighborAverage(2, 1));
		System.out.println(test.neighborAverage(2, 2));
	}
}
