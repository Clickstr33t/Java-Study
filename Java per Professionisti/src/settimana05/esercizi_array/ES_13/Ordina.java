package settimana05.esercizi_array.ES_13;

import java.util.Arrays;

public class Ordina {
	public static void main(String[] args) {
		int [] array ={3, 7, -2, 5, 8, 1, 2, 5, 6, -4};
		System.out.println(Arrays.toString(array));
		orderDesc(array);
		System.out.println(Arrays.toString(array));
		orderCresc(array);
		System.out.println(Arrays.toString(array));
	}
	
	public static void  orderDesc(int[] array) {
		int tmp;
		for (int j=1; j<array.length;j++) {
			for (int i=1; i < (array.length); i++) {
				if (array[i]>array[i-1]) {
					tmp=array[i];
					array[i]=array[i-1];
					array[i-1]=tmp;
				}
			}
		}
		
	}
	
	public static void  orderCresc(int[] array) {
		int tmp;
		for (int j=1; j<array.length;j++) {
			for (int i=1; i < (array.length); i++) {
				if (array[i]<array[i-1]) {
					tmp=array[i];
					array[i]=array[i-1];
					array[i-1]=tmp;
				}
			}
		}
		
	}

}
