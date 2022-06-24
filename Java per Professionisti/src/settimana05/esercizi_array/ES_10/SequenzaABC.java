package settimana05.esercizi_array.ES_10;

public class SequenzaABC {
	public static void main(String[] args) {
		int [] array = {'?','a','b','a','c','c','x'};
		System.out.print(checkSequenceABC(array));
	}
	
	public static boolean checkSequenceABC(int [] array) {
		for (int i = 2; i < array.length; i++) {
			if (array[i-2]=='a' 
				&& array[i-1] == 'b' 
				&& array[i] == 'c')
			{
				return true;
			}
		}
		return false;
	}

}
