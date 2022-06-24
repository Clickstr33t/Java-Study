package settimana05.esercizi_metodi.es_13;

public class Palindroma {
	public static void main(String[] args) {
		String text = "i topi non avevano nipoti";
		System.out.println(isPalindroma(text));
	}
	
	public static boolean isPalindroma(String input) {
		input = input.toUpperCase().replace("\\W", "").replace(" ", "");
		for (int i=0; i<input.length()/2;i++) {
			if(input.charAt(i)!=input.charAt(input.length()-1-i)) {
				return false;
			}
		}
		return true;
	}
}
