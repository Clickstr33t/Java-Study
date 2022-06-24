package chapter07.E_18;

public class TableTest {
	public static void main (String[] args) {
		Table test = new Table(3,3);
		
		test.set(0, 0, 1);
		test.set(0, 1, 2);
		test.set(0, 2, 3);
		test.set(1, 0, 1);
		test.set(1, 1, 1);
		test.set(1, 2, 1);
		test.set(2, 0, 1);
		test.set(2, 1, 1);
		test.set(2, 2, 1);
		
		System.out.println(test.sum(1, false));

	}
}
