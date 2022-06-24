package Chapter03.E03_24;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;


public class LetterO
{
	private int x, y, z;
	public LetterO(int x, int y, int z) {

		this.x=x;
		this.y=y;
		this.z = z==0 ? 1:z;
		
	}
   public void draw(Graphics2D g2)
   {
      
      Ellipse2D.Double Ellipse = new Ellipse2D.Double(x+0*z, y+0*z,5*z,10*z);
      g2.draw(Ellipse);
   }
}

