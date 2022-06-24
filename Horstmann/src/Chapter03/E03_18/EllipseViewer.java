package Chapter03.E03_18;
import javax.swing.JFrame;

public class EllipseViewer {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(300,400);
		frame.setTitle("Ellipse");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		EllipseComponent main = new EllipseComponent();
		frame.add(main);
		
		frame.setVisible(true);
	}

}
