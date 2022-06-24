package Chapter02.E02_03;

import java.awt.Rectangle;

public class E02_03 {
	public static void main(String[] args) {
		Rectangle box = new Rectangle(0, 0, 10, 10);
		System.out.println("Altezza: "+box.getHeight()
							+" Larghezza: "+box.getWidth()
							+" Area:"+box.getHeight() * box.getWidth());
	}
}
