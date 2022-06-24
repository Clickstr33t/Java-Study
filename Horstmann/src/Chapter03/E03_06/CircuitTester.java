package Chapter03.E03_06;

public class CircuitTester 
{
	public static void main(String[] args)
	{
		Circuit test = new Circuit();
		System.out.println("Expected: 0 e 0 e 0");
		System.out.println(test.getLampState());
		System.out.println(test.getFirstSwitch());
		System.out.println(test.getSecondSwitch());
		test.setFirstSwitch();
		System.out.println("Expected: 1 e 1 e 0");
		System.out.println(test.getLampState());
		System.out.println(test.getFirstSwitch());
		System.out.println(test.getSecondSwitch());
		test.setFirstSwitch();
		System.out.println("Expected: 0 e 0 e 0");
		System.out.println(test.getLampState());
		System.out.println(test.getFirstSwitch());
		System.out.println(test.getSecondSwitch());
		test.setSecondSwitch();
		System.out.println("Expected: 1 e 0 e 1");
		System.out.println(test.getLampState());
		System.out.println(test.getFirstSwitch());
		System.out.println(test.getSecondSwitch());
		test.setSecondSwitch();
		System.out.println("Expected: 0 e 0 e 0");
		System.out.println(test.getLampState());
		System.out.println(test.getFirstSwitch());
		System.out.println(test.getSecondSwitch());
		
	}
}
