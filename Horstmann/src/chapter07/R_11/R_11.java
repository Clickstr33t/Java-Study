package chapter07.R_11;

public class R_11 {
	public static void main (String[] args) {
		int [] values = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int total = 0;
		
		//a. Riscrivere il seguente ciclo in forma estesa:
		for (int i = 0; i < values.length; i++) {
			total = total + values[i];
		}
		System.out.println("N: "+total);
		
		int test = 0;
		for (int x : values) {
			test = test + x;
		}
		System.out.println("E: "+test);
		
		//b. Riscrivere il seguente ciclo in forma estesa:
		total = 0;
		for (int i =1; i < values.length; i++) {
			total = total + values[i];
		}
		System.out.println("N: "+total);
		
		test = 0;
		int i = 0;
		for (int x : values) {
			if (i != 0) {
				test = test + x;
			}
			i++;
		}
		System.out.println("E: "+test);
		
		//c. Riscrivere il seguente ciclo in forma estesa:
		int target = 3;
		for (i = 0; i < values.length; i++) {
			if (values[i] == target) {
				System.out.println("N: "+i);
			}
		}
		
		i = 0;
		for (int x : values) {
			if (x == target) {
				System.out.println("E: "+i);
			}
			i++;
		}
		
	}
}
