package Chapter03.E03_22;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.Color;

/**
   This component draws two car shapes.
*/
public class CarComponent extends JComponent
{  
   public void paintComponent(Graphics g)
   {  
      Graphics2D g2 = (Graphics2D) g;
      int z = 6; //MODIFICANDO QUESTO VALORE DECIDI LA DIMENZIONE DELLA SECONDA MACCHINA
      Car car1 = new Car(0, 0);
      g2.setColor(Color.RED);
      car1.draw(g2, 1);

      int x = getWidth() - 60*z;
      int y = getHeight() - 30*z;

      Car car2 = new Car(x, y);
      g2.setColor(Color.BLUE);

      
      car2.draw(g2, z);      
   }
}

