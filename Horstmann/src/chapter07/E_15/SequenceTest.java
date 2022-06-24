package chapter07.E_15;

public class SequenceTest {
	public static void main (String[] args) {
		Sequence test1 = new Sequence(6);
		test1.set(0, 1);
		test1.set(1, 2);
		test1.set(2, 3);
		test1.set(3, 4);
		test1.set(4, 5);
		test1.set(5, 6);
		
		Sequence test2 = new Sequence(6);
		test2.set(0, 1);
		test2.set(1, 1);
		test2.set(2, 1);
		test2.set(3, 1);
		
		Sequence test3 = test1.sum(test2);
		
		Sequence test4 = test2.sum(test1);
		
				
		System.out.print("\ntest3: ");
		for (int i = 0; i < test3.size(); i++) {
			System.out.print("|"+test3.get(i)+"|");
		}
		
		System.out.print("\n\ntest4: ");
		for (int i = 0; i < test4.size(); i++) {
			System.out.print("|"+test4.get(i)+"|");
		}
	}
}
