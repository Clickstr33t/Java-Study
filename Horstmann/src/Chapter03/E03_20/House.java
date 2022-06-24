package Chapter03.E03_20;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;


public class House
{

   public void draw(Graphics2D g2)
   {
      Rectangle body = new Rectangle(10, 60, 100, 110); 
      Rectangle door = new Rectangle(30, 90, 20, 80); 
      Rectangle window = new Rectangle(70, 80, 20, 20); 
      



      Point2D.Double r1 = new Point2D.Double(10, 60);
      Point2D.Double r2 = new Point2D.Double(60, 0);
      Point2D.Double r3 = new Point2D.Double(110, 60);

      Line2D.Double left = new Line2D.Double(r1, r2);
      Line2D.Double right = new Line2D.Double(r2, r3);
   
      g2.draw(body);
      g2.draw(door);
      g2.draw(window);
      g2.draw(left);      
      g2.draw(right);      
   }
}

