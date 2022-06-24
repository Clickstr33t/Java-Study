package Chapter03.E03_26;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.BasicStroke;
import java.awt.Color;
import javax.swing.JComponent;
import javax.swing.plaf.FontUIResource;

import java.awt.Color;
import java.awt.Font;


public class BarChartComponent extends JComponent
{  
   public void paintComponent(Graphics g)
   {  
      Graphics2D g2 = (Graphics2D) g;
      
      BasicStroke bs = new BasicStroke(5); //Creare un bordo
      g2.setStroke(bs);			//Impostare l'elemento Graphics2d.setStroke a bs
      
      Font Carattere = new Font("Test",0,50); //Crea un nuovo font
      g2.setFont(Carattere);
      
      g2.drawString("Golden Gate", 100,100);
      g2.drawString("Brooklyn", 100,200);
      g2.drawString("Delaware Memorial", 100,300);
      g2.drawString("Mackinac", 100,400);
      
      Rectangle Rectangle1 = new Rectangle(600,50,420,50);
      g2.setColor(Color.BLUE);
      g2.fill(Rectangle1);
         
      Rectangle Rectangle2 = new Rectangle(600,150,159,50);
      g2.setColor(Color.RED);
      g2.fill(Rectangle2);
      
      Rectangle Rectangle3 = new Rectangle(600,250,215,50);
      g2.setColor(Color.GREEN);
      g2.fill(Rectangle3);
      
      Rectangle Rectangle4 = new Rectangle(600,350,380,50);
      g2.setColor(Color.ORANGE);
      g2.fill(Rectangle4);
      

   }
}

