package Chapter03.E03_26;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;


public class OlympicRing
{
	private int x, y, z;
	public OlympicRing(int x, int y, int z) {

		this.x=x;
		this.y=y;
		this.z = z==0 ? 1:z;
		
	}
   public void draw(Graphics2D g2)
   {
      Ellipse2D Ring = new Ellipse2D.Double(x*z+1*z, y*z+1*z, 100*z, 100*z); 
      g2.draw(Ring);      
   }
}

