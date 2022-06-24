package settimana05.esercizi_array.ES_12;

import java.util.Arrays;
import java.util.Scanner;

public class ZeroCheck {
	public static void main(String[] args) {
		int size = 20;
		Scanner s = new Scanner(System.in);
		int[] array = new int [size];
		initializeArray(array, s);
		replaceWithZeros(array, s);
		s.close();
	}
	
	
	public static void initializeArray(int[] array, Scanner s) {
		int num=0;
		boolean check;
		for (int i=0; i<array.length; i++) {
			check = false;
			while(check==false) {
				System.out.print("Inserisci un numero da 1 a 50 in posizione "+i+":");
				num = s.nextInt();
				if (num<1 || num>50) {
					System.out.println("ATTENZIONE IL NUMERO DEVE ESSERE COMPRESO TRA 1 e 50");
				}
				else {
					check=true;
					array[i]=num;
				}
			}
		}
	}
	
	public static boolean checkIfZero(int [] array) {
		for (int i = 0; i<array.length; i++) {
			if (array[i]!=0) {
				return false;
			}
		}
		return true;
	}
	
	public static void replaceWithZeros(int[] array, Scanner s) {
		int num;
		while (checkIfZero(array)==false) {
			System.out.println(Arrays.toString(array));
			System.out.print("Inserisci un divisore: ");
			num = s.nextInt();
			for (int i = 0; i < array.length; i++) {
				if (array[i]%num==0) {
					array[i]=0;
				}
			}
		}
		System.out.println("OTTIMO LAVORO HAI AZZERATO L'ARRAY\n"+Arrays.toString(array));
	}
}
