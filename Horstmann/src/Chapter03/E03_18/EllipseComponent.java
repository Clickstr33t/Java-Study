package Chapter03.E03_18;
import javax.swing.JComponent;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import	java.awt.Graphics;
import java.awt.Color;

public class EllipseComponent extends JComponent
{
	public void paintComponent(Graphics g) 
	{
		Graphics2D g2 = (Graphics2D) g;
		
		Ellipse2D.Double main = new Ellipse2D.Double(0,0,getWidth(),getHeight());
		g2.setColor(Color.BLUE);
		g2.fill(main);
		g2.draw(main);		
	}
}
