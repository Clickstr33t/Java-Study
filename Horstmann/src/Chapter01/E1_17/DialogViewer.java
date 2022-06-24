package Chapter01.E1_17;

import javax.swing.JOptionPane;

public class DialogViewer {

	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("What is your name");
		JOptionPane.showMessageDialog(null,"Hello, "+name+"!");
		JOptionPane.showInputDialog("My name is Hal! What would you like me to do?");
		JOptionPane.showMessageDialog(null,"I'm sorry, "+name+". I'm afraid I can't do that");
	}

}