package chapter07.E_24;

public class SequenceTest {
	public static void main (String[] args) {
		Sequence test1 = new Sequence();
		Sequence test2 = new Sequence();
		
		test1.add(0);
		test1.add(1);
		test1.add(2);
		test1.add(3);
		
		test2.add(4);
		test2.add(5);
		test2.add(6);
		test2.add(7);
		
		System.out.println("test1: " + test1.toString());
		System.out.println("test2: " + test2.toString());
		
		System.out.println("merge test: " + test1.merge(test2).toString());
	}
}
