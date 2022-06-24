package Chapter02.E02_09;

import java.lang.StringBuilder;

public class E02_09 {
	public static void main(String[] args) {
		String text = "desserts";
		StringBuilder invertedText = new StringBuilder().append(text).reverse();	
		System.out.println(invertedText.toString());
	}
}
