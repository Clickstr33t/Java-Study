package chapter06.E_15;
import java.awt.Color;
import java.awt.geom.Ellipse2D;

public class Telescope
{
   public static void main(String[] args)
   {
      Picture pic = new Picture();
      pic.load("img\\queen-mary.png");
      for (int x = 0; x < pic.getWidth(); x++)
      {
         for (int y = 0; y < pic.getHeight(); y++)
         {
        	
            int centerX = pic.getWidth()/2;
            int centerY = pic.getHeight()/2;
            int ray = (int)(0.4*Math.min(pic.getHeight(), pic.getWidth()));
        	
            Ellipse2D.Double ellipse = new Ellipse2D.Double (centerX-ray,centerY-ray,ray*2,ray*2);
            
        	Color original = pic.getColorAt(x, y);
            
        	if (ellipse.contains(x, y)) {
        		Color circle = new Color(	original.getRed(), 
											original.getGreen(), 
											original.getBlue());
        		pic.setColorAt(x, y, circle);
        	} else {
        		 pic.setColorAt(x, y, Color.BLACK);
        	}
            
           
         }
      }
   }
}

