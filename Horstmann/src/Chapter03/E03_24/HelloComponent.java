package Chapter03.E03_24;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

public class HelloComponent extends JComponent
{  
   public void paintComponent(Graphics g)
   {  
      Graphics2D g2 = (Graphics2D) g;
      
      LetterH Letter1 = new LetterH(10,10,1);
      Letter1.draw(g2);
      
      LetterE Letter2 = new LetterE(20,10,1);
      Letter2.draw(g2);
      
      LetterL Letter3 = new LetterL(30,10,1);
      Letter3.draw(g2);
      
      LetterL Letter4 = new LetterL(40,10,1);
      Letter4.draw(g2);
      
      LetterO Letter5 = new LetterO(50,10,1);
      Letter5.draw(g2);
   }
}

