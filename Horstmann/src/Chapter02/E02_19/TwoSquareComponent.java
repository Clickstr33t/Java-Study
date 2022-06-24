package Chapter02.E02_19;

import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.Rectangle;
import java.awt.Color;

public class TwoSquareComponent extends JComponent{
	
	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D)g;
		
		Rectangle box = new Rectangle (100,100, 100,100);
		Color violet = new Color(143, 0, 255);
		g2.setColor(Color.PINK);
		g2.fill(box);
		
		box.translate(25,25);
		box.setSize(50,50);
		g2.setColor (violet);
		g2.fill(box);
		
		box = new Rectangle (100, 225, 100, 25);
		g2.setColor(Color.BLUE);
		g2.fill(box);
		
		g2.setColor(Color.RED);
		g2.drawString("ANDREA",130, 245);
		
	}
}
