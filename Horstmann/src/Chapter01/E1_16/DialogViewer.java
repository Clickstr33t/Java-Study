package Chapter01.E1_16;

import javax.swing.JOptionPane;

public class DialogViewer {

	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("What is your name");
		JOptionPane.showMessageDialog(null,"Hello, "+name+"!");
	}

}
