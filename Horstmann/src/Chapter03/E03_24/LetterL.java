package Chapter03.E03_24;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;


public class LetterL
{
	private int x, y, z;
	public LetterL(int x, int y, int z) {

		this.x=x;
		this.y=y;
		this.z = z==0 ? 1:z;
		
	}
   public void draw(Graphics2D g2)
   {
      
      Point2D.Double r1 = new Point2D.Double(x+0*z, y+0*z);
      Point2D.Double r2 = new Point2D.Double(x+0*z, y+10*z);
      Point2D.Double r3 = new Point2D.Double(x+0*z, y+10*z);
      Point2D.Double r4 = new Point2D.Double(x+5*z, y+10*z);
      

      Line2D.Double left = new Line2D.Double(r1, r2);
      Line2D.Double bottom = new Line2D.Double(r3, r4);
   
      g2.draw(left);
      g2.draw(bottom);
   }
}

