package Chapter03.E03_21;
import javax.swing.*;

public class HouseViewer
{
   public static void main(String[] args)
   {
      JFrame frame = new JFrame();

      frame.setSize(1200, 800);
      frame.setTitle("House");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      HouseComponent component = new HouseComponent();
      frame.add(component);

      frame.setVisible(true);
   }
}

