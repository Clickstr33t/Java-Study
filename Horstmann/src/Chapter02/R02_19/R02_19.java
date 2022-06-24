package Chapter02.R02_19;

import java.awt.Rectangle;

public class R02_19 {
	public static void main(String[] args) {
		Rectangle square1 = new Rectangle(20, 20, 40, 40);
		Rectangle square2 = square1;
		System.out.println(square1);
		System.out.println(square2);
	}

}
