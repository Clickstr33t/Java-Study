package Chapter02.E02_17;

public class HalfSizePicture 
{
	public static void main(String[] args) 
	{
		Picture imagine = new Picture();
		imagine.load("queen-mary.png");
		int newHeight = imagine.getHeight()/2;
		int newWidth = imagine.getWidth()/2;
		imagine.scale(newWidth, newHeight);
		imagine.move(newWidth/2, newHeight/2);
		
	}
}
