package settimana05.esercizi_array.ES_07;

import java.util.Arrays;

public class ABCinArray {
	public static void main(String[] args) {
		char [] array1 = {'?','a','b','a','b','c','x'};
		char [] array2 = {'?','a','b','z','y','c','x'};
		char [] array3 = {'?','a','b','z','y','a','x'};
		
		System.out.println(Arrays.toString(array1) + " >>> "+checkArray(array1));
		System.out.println(Arrays.toString(array2) + " >>> "+checkArray(array2));
		System.out.println(Arrays.toString(array3) + " >>> "+checkArray(array3));
				
		
		
	}
	
	public static String checkArray(char[] array) {
		boolean a = false;
		boolean b = false;
		boolean c = false;
		for (int i=0; i<array.length; i++) {
			if (array[i]=='a') {
				a = true;
			}
			if (array[i]=='b') {
				b = true;
			}
			if (array[i]=='c') {
				c = true;
			}
		}
		if (a && b && c) {
			return "OK";
		}else {
			return "NO";
		}
	}

}
