package Chapter03.E03_25;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.BasicStroke;
import javax.swing.JComponent;
import java.awt.Color;


public class OlympicRingComponent extends JComponent
{  
   public void paintComponent(Graphics g)
   {  
      Graphics2D g2 = (Graphics2D) g;
      
      BasicStroke bs = new BasicStroke(5); //Creare un bordo
      g2.setStroke(bs);			//Impostare l'elemento Graphics2d.setStroke a bs
      
      OlympicRing Ring1 = new OlympicRing(10,10,3);
      g2.setColor(Color.BLUE);
      Ring1.draw(g2);
      
      OlympicRing Ring2 = new OlympicRing(90,10,3);
      g2.setColor(Color.BLACK);
      Ring2.draw(g2);
      
      OlympicRing Ring3 = new OlympicRing(170,10,3);
      g2.setColor(Color.RED);
      Ring3.draw(g2);
      
      OlympicRing Ring4 = new OlympicRing(50,60,3);
      g2.setColor(Color.YELLOW);
      Ring4.draw(g2);
      
      OlympicRing Ring5 = new OlympicRing(130,60,3);
      g2.setColor(Color.GREEN);
      Ring5.draw(g2);
      
   }
}

