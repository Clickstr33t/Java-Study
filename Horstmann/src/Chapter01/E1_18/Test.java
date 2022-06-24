package Chapter01.E1_18;

import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Test {
	public static void main(String[] args) throws Exception {
		URL imageLocation = new URL("https://th.bing.com/th/id/R.0441ea5619b979bde781aa040943c208?rik=M9RJvIjMIkiIHQ&pid=ImgRaw&r=0");
		JOptionPane.showMessageDialog(null, "To The moon", "XRP",
			JOptionPane.PLAIN_MESSAGE,new ImageIcon(imageLocation));
	}
}
