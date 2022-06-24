package chapter07.R_03;

import java.util.Arrays;

public class R_03 {
	public static void main(String[] args) {
		int[] values = new int[10];
		
		//esercizio a 1 2 3 4 5 6 7 8 9 10
		for (int i = 0; i < values.length; i++) {
			values[i] = i+1;
		}
		System.out.println("a. " + Arrays.toString(values));
		
		//esercizio b 0 2 4 6 8 10 12 14  16 18
		for (int i = 0; i < values.length; i++) {
			values[i] = i*2;
		}
		System.out.println("b. " + Arrays.toString(values));
		
		//esercizio c 1 4 9 16 25 36 49 64 81 100
		for (int i = 0; i < values.length; i++) {
			values[i] = (int)Math.pow(i+1, 2);
		}
		System.out.println("c. " + Arrays.toString(values));
		
		//esercizio d 0 0 0 0 0 0 0 0 0 0
		values = new int[10];
		System.out.println("d. " + Arrays.toString(values));
		
		//esercizio e 1 4 9 16 9 7 4 9 11
		values[0] = 1;
		values[1] = 4;
		values[2] = 9;
		values[3] = 16;
		values[4] = 9;
		values[5] = 7;
		values[6] = 4;
		values[7] = 9;
		values[8] = 11;;
		System.out.println("e. " + Arrays.toString(values));
		
		//esercizio f 0 1 0 1 0 1 0 1 0 1
		for (int i = 0; i < 10; i++) {
			values[i] = i %2;
		}
		System.out.println("f. " + Arrays.toString(values));
		
		//esercizio g 0 1 2 3 4 0 1 2 3 4
		for (int i = 1,count=0; i < 10; i++) {
			if (i  % 5 == 0) {
				count = count + 5;
			}
			values[i] = i - count;
		}
		System.out.println("g. " + Arrays.toString(values));
		
	}

}
