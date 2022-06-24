package Chapter02.E02_19;

import javax.swing.JFrame;

public class TwoSquareViewer {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		
		frame.setSize(300,300);
		frame.setTitle("Two Squares");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		TwoSquareComponent component = new TwoSquareComponent();
		frame.add(component);
		
		frame.setVisible(true);
		
		
	}
}
