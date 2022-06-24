package Chapter02.E02_04;

import java.awt.Rectangle;

public class E02_04{
	public static void main(String[] args) {
		Rectangle box = new Rectangle(0, 0, 10, 10);
		System.out.println("Altezza: "+box.getHeight()
							+" Larghezza: "+box.getWidth()
							+" Perimetro:"+(box.getHeight()*2 + box.getWidth()*2));
	}
}
