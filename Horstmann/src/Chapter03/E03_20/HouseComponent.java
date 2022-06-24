package Chapter03.E03_20;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

public class HouseComponent extends JComponent
{  
   public void paintComponent(Graphics g)
   {  
      Graphics2D g2 = (Graphics2D) g;
      House House1 = new House();

      House1.draw(g2);
   }
}

