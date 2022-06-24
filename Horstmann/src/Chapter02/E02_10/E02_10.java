package Chapter02.E02_10;

import java.awt.Color;

public class E02_10 {
	public static void main(String[] args) {
		Color test = new Color(50, 100, 150);
		System.out.println(test);
		test = test.brighter();
		System.out.println(test);
		
	}
}
