package chapter06.E_05;

public class Test {
	public static void main(String[] args) {
		DataSet prova = new DataSet();
		System.out.println("Media: " + prova.getAverage());
		System.out.println("Expected: 25");
		System.out.println("Min: " + prova.getSmallest());
		System.out.println("Expected: 10");
		System.out.println("Max: " + prova.getLargest());
		System.out.println("Expected: 40");
		System.out.println("Range: " + prova.getRange());
		System.out.println("Expected: 30");
	}

}
