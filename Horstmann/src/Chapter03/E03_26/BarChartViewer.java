package Chapter03.E03_26;
import javax.swing.*;

public class BarChartViewer
{
   public static void main(String[] args)
   {
      JFrame frame = new JFrame();

      frame.setSize(1200, 800);
      frame.setTitle("Bar Chart");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      BarChartComponent component = new BarChartComponent();
      frame.add(component);

      frame.setVisible(true);
   }
}

