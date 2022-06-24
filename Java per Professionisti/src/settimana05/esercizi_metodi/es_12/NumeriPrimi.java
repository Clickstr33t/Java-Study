package settimana05.esercizi_metodi.es_12;

public class NumeriPrimi {
	public static void main(String[] arg) {
		System.out.println(isPrimeNumber(2));
		int test = findNPrimeNumber(1000);
		System.out.println(test);
		
	}
	
	public static boolean isPrimeNumber(int num) {
		if (num <=1) {
			return false;
		}		
		for (int i=2; i<num; i++) {
			if (num%i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static int findNPrimeNumber(int n) {
		int i = 0;
		int num = 1;
		while (i < n) {
			if (isPrimeNumber(num)) {
				System.out.println(num);
				num++;
				i++;
			}else {
				num++;
			}
		}
		return num-1;
	}
}
