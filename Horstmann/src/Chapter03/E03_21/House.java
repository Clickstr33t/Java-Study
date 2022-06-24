package Chapter03.E03_21;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;


public class House
{
	private int x, y, z;
	public House(int x, int y, int z) {

		this.x=x;
		this.y=y;
		this.z = z==0 ? 1:z;
		
	}
   public void draw(Graphics2D g2)
   {
      Rectangle body = new Rectangle(x+10*z, y+60*z, 100*z, 110*z); 
      Rectangle door = new Rectangle(x+30*z, y+90*z, 20*z, 80*z); 
      Rectangle window = new Rectangle(x+70*z, y+80*z, 20*z, 20*z); 
      
      Point2D.Double r1 = new Point2D.Double(x+10*z, y+60*z);
      Point2D.Double r2 = new Point2D.Double(x+60*z, y+0*z);
      Point2D.Double r3 = new Point2D.Double(x+110*z, y+60*z);

      Line2D.Double left = new Line2D.Double(r1, r2);
      Line2D.Double right = new Line2D.Double(r2, r3);
   
      g2.draw(body);
      g2.draw(door);
      g2.draw(window);
      g2.draw(left);      
      g2.draw(right);      
   }
}

