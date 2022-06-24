package it.corso.java.thread.starvation;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;

public class EsempioStarvation {
	private static String risorsaCondivisa = "La risorsa non può essere un tipo primitivo";

	public static void main (String[] args) {
		JFrame frame = new JFrame("Esempio Starvation");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(new Dimension(1024, 300));
		frame.setLayout(new FlowLayout(FlowLayout.LEFT));
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		/* creo 10 thread che contano... */
		for(int i = 1; i <= 10; i++) {
			Avanzamento thread = new Avanzamento(risorsaCondivisa, "Thread " + i);			
			
			frame.add(thread.conta());
			thread.start();
			thread.setName("P"+i);
			thread.setPriority(i);;
		}

		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
}