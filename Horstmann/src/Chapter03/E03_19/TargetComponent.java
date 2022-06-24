package Chapter03.E03_19;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

public class TargetComponent extends JComponent
{
	public void paintComponent(Graphics g)
	{
		Graphics2D g2 =  (Graphics2D) g;
		
		Target disegno = new Target();
		
		disegno.draw(g2);
	}

}
