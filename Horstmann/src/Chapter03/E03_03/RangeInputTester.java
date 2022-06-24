package Chapter03.E03_03;

public class RangeInputTester
{
	public static void main(String[] args) 
	{
		RangeInput selettore = new RangeInput();
		System.out.println("Expected value 70");
		System.out.println(selettore.display());
		selettore.up();
		selettore.up();
		selettore.up();
		selettore.up();
		selettore.up();
		selettore.up();
		selettore.up();
		selettore.up();
		selettore.up();
		selettore.up();
		selettore.up();
		System.out.println("Expected value 80");
		System.out.println(selettore.display());
		selettore.down();
		selettore.down();
		System.out.println("Expected value 78");
		System.out.println(selettore.display());

	}
}