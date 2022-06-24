package chapter06.E_17;

public class Square {
	public static void main(String[] args) {
		String patternA="";
		String patternB="";
		int num = 10;
		for (int i = 1; i <= num; i++) {
			patternA += "*";
			if (i == 1 || i == num) {
				patternB += "*";
			} else {
				patternB += " ";
			}
		}
		for (int i = 1; i <= num ; i++) {
			if (i == 1 || i == num) {
				System.out.println(patternA + "   " + patternA);
			} else {
				System.out.println(patternA + "   " + patternB);
			}
		}
	
	}
}
