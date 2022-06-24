package Chapter03.E03_24;
import javax.swing.*;

public class HelloViewer
{
   public static void main(String[] args)
   {
      JFrame frame = new JFrame();

      frame.setSize(1200, 800);
      frame.setTitle("Hello");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      HelloComponent component = new HelloComponent();
      frame.add(component);

      frame.setVisible(true);
   }
}

