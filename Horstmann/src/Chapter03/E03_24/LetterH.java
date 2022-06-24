package Chapter03.E03_24;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;


public class LetterH
{
	private int x, y, z;
	public LetterH(int x, int y, int z) {

		this.x=x;
		this.y=y;
		this.z = z==0 ? 1:z;
		
	}
   public void draw(Graphics2D g2)
   {
      
      Point2D.Double r1 = new Point2D.Double(x+0*z, y+0*z);
      Point2D.Double r2 = new Point2D.Double(x+0*z, y+10*z);
      Point2D.Double r3 = new Point2D.Double(x+0*z, y+5*z);
      Point2D.Double r4 = new Point2D.Double(x+5*z, y+5*z);
      Point2D.Double r5 = new Point2D.Double(x+5*z, y+0*z);
      Point2D.Double r6 = new Point2D.Double(x+5*z, y+10*z);

      Line2D.Double left = new Line2D.Double(r1, r2);
      Line2D.Double middle = new Line2D.Double(r3, r4);
      Line2D.Double right = new Line2D.Double(r5, r6);
   
      g2.draw(left);
      g2.draw(middle);
      g2.draw(right);
   }
}

