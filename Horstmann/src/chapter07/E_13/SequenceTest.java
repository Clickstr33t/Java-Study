package chapter07.E_13;

public class SequenceTest {
	public static void main (String[] args) {
		Sequence test1 = new Sequence(6);
		test1.set(0, 1);
		test1.set(1, 1);
		test1.set(2, 2);
		test1.set(3, 3);
		test1.set(4, 4);
		test1.set(5, 5);
		
		Sequence test2 = new Sequence(6);
		test2.set(0, 1);
		test2.set(1, 1);
		test2.set(2, 2);
		test2.set(3, 3);
		test2.set(4, 4);
		test2.set(5, 5);
		
		
		System.out.println("Same Values: "+test1.sameValues(test2));
		System.out.println("\nEquals: "+ test1.equals(test2));
		
		System.out.print("\ntest1: ");
		for (int i = 0; i < test1.size(); i++) {
			System.out.print("|"+test1.get(i)+"|");
		}
		
		System.out.print("\n\ntest2: ");
		for (int i = 0; i < test2.size(); i++) {
			System.out.print("|"+test2.get(i)+"|");
		}
	}
}
