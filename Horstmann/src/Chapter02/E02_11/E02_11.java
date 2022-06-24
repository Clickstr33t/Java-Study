package Chapter02.E02_11;

import java.awt.Color;
import javax.swing.JFrame;

public class E02_11 {
	public static void main(String[] args) {
		/*Esercizio E02_10*/
		Color test = new Color(50, 100, 150);
		System.out.println(test);
		test = test.brighter();
		System.out.println(test);
		/*Creazione del frame*/
		JFrame frame = new JFrame();
		frame.setSize(200, 200);
		Color myColor = test;
		frame.getContentPane().setBackground(myColor);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);			
	}
}
