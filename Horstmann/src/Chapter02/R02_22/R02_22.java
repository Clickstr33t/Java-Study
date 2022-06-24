package Chapter02.R02_22;

import java.awt.Rectangle;

public class R02_22 {
	public static void main(String[] args) {
		String a = "       Mannaggia ";
		String b = "il papa!!!";
		
		// metodo per concatenare due stringhe >>> .concat(String var/"stringa")
		System.out.println(a.concat(b));
		
		// eliminare da una stringa gli eventuali spazi iniziali e finali >>> .strip()
		System.out.println(a.strip().concat(b));
		
		// convertire un rettangolo in una stringa
		Rectangle box = new Rectangle(10,10,40,40);
		String conversione = box.toString();
		System.out.println(box);
		System.out.println(conversione);
		
		// individuare il più piccolo rettangolo che contiene due rettangoli dati
		Rectangle box1 = new Rectangle(10,10,40,40);
		Rectangle box2 = new Rectangle(5,5,40,40);
		Rectangle box3 = new Rectangle(1,1,100,110);
		System.out.println(box3.contains(box1) && box3.contains(box2));
		System.out.println(box3.getWidth()*box3.getHeight());
		
		//restituire un numero casuale in virgola mobile
		double randomNumber = Math.random();
		System.out.println(randomNumber*100);
		

		
		
	}
}
