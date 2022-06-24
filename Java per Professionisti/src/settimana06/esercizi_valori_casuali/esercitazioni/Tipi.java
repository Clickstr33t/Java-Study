package settimana06.esercizi_valori_casuali.esercitazioni;

public class Tipi {
	public static void main(String[] args) {
		String a = "-2";
		String b = "True";
		String c = "i";
		String d = "0.5f";
		String e = "3.14D";
		
		//Integer aInt = new Integer(a);
		Integer aInt = Integer.parseInt(a);
		Boolean bBool = Boolean.parseBoolean(b);
		Character cChar = c.charAt(0);
		Float dFloat = Float.parseFloat(d);
		Double eDouble = Double.parseDouble(e);
	}

}
