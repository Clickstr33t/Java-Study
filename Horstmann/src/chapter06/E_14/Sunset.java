package chapter06.E_14;
import java.awt.Color;

public class Sunset
{
   public static void main(String[] args)
   {
      Picture pic = new Picture();
      pic.load("src\\chapter06\\R_14\\queen-mary.png");
      for (int x = 0; x < pic.getWidth(); x++)
      {
         for (int y = 0; y < pic.getHeight(); y++)
         {
        	
            Color original = pic.getColorAt(x, y);
            int red = 0;
        	if (original.getRed()*1.3 > 255) {
        		red = 255;
        	} else {
        		red = (int)(original.getRed() * 1.3);
        	}
            Color sunset = new Color(	red, 
            							original.getGreen(), 
            							original.getBlue());
            
            pic.setColorAt(x, y, sunset);
         }
      }
   }
}

