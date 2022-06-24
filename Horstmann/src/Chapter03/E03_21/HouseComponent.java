package Chapter03.E03_21;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

public class HouseComponent extends JComponent
{  
   public void paintComponent(Graphics g)
   {  
      Graphics2D g2 = (Graphics2D) g;
      
      House House1 = new House(0,0,1);
      House House2 = new House(70,10,2);
      House House3 = new House(500,100,3);
      House House4 = new House(150,10,1);
      

      House1.draw(g2);
      House2.draw(g2);
      House3.draw(g2);
      House4.draw(g2);
   }
}

