package Chapter03.E03_19;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.Color;

public class Target {
		
		
		public void draw(Graphics2D g2)
		{
			Ellipse2D.Double Circle1 = new Ellipse2D.Double(0, 0, 100, 100);
			g2.setColor(Color.BLACK);
			g2.fill(Circle1);
			
			Ellipse2D.Double Circle2 = new Ellipse2D.Double(10, 10, 80, 80);
			g2.setColor(Color.WHITE);
			g2.fill(Circle2);
			
			Ellipse2D.Double Circle3 = new Ellipse2D.Double(15, 15, 70, 70);
			g2.setColor(Color.BLACK);
			g2.fill(Circle3);
			
			Ellipse2D.Double Circle4 = new Ellipse2D.Double(25, 25, 50, 50);
			g2.setColor(Color.WHITE);
			g2.fill(Circle4);
			
			Ellipse2D.Double Circle5 = new Ellipse2D.Double(30, 30, 40, 40);
			g2.setColor(Color.BLACK);
			g2.fill(Circle5);
					
		}

}
