package Chapter02.E02_15;

import java.awt.geom.Point2D;

public class E02_15  {
	public static void main(String[] args ) {
	     Point2D.Double coordinate1 = new Point2D.Double (3,4);
	     Point2D.Double coordinate2 = new Point2D.Double (-3,-4);
	     System.out.println(coordinate1.distance(coordinate2));
	}
}
