package Chapter03.E03_19;
import javax.swing.JFrame;

public class TargetViewer {
	public static void main(String[] args) 
	{
		JFrame frame = new JFrame();
		
		frame.setSize(100,100);
		frame.setTitle("Target");
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		TargetComponent component = new TargetComponent();
		frame.add(component);
		frame.setVisible(true);
	}
	

}
