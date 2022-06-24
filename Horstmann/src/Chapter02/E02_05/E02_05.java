package Chapter02.E02_05;

import java.awt.Rectangle;

public class E02_05 {
	public static void main(String[] args) {
		Rectangle boxArea = new Rectangle(0, 0, 7, 6);
		System.out.println(boxArea.getWidth() * boxArea.getHeight());
		Rectangle boxPerimeter = new Rectangle(0, 0, 7, 14);
		System.out.println(boxPerimeter.getWidth() *2 + boxPerimeter.getHeight()*2);
				
	}
}





