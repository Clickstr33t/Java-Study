package Chapter02.E02_12;

import java.awt.Color;
import javax.swing.JFrame;

public class E02_12 {
	public static void main(String[] args) {
		/*Esercizio E02_10*/
		Color test = Color.RED; /*COME RICHIAMARE COLORI PREDEFINITI invece di new Color(255,0,0);*/
		System.out.println(test);
		test = test.darker().darker();
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
