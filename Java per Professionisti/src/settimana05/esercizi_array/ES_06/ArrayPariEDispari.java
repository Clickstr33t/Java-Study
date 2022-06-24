package settimana05.esercizi_array.ES_06;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPariEDispari {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Inserisci la lunghezza: ");
		int size = s.nextInt();
		int[] array = new int [size];
		int sizeEven = initializeArray(array);
		int[] arrayEven = new int [sizeEven];
		int[] arrayOdd = new int [size-sizeEven];
		createEvenAndOdd(array, arrayEven, arrayOdd);
		System.out.println(Arrays.toString(array));
		System.out.println(Arrays.toString(arrayEven));
		System.out.println(Arrays.toString(arrayOdd));
		
		s.close();
	}
	
	public static int initializeArray(int [] array) {
		int countEven = 0;
		Scanner s = new Scanner(System.in);
		for (int i = 0; i < array.length; i++) {
			System.out.print("Inserisci il numero in posizione "+i+":");
			array[i] = s.nextInt();
			if (array[i]%2 == 0) {
				countEven++;
			}
		}
		s.close();
		return countEven;
	}
	
	public static void createEvenAndOdd(int[] array, int[] arrayEven, int[] arrayOdd) {
		int even = 0;
		int odd = 0;
		
		for (int i=0; i<array.length; i++) {
			if (array[i]%2==0) {
				arrayEven[even]=array[i];
				even++;
			}else {
				arrayOdd[odd]=array[i];
				odd++;
			}
		}
	}

}
