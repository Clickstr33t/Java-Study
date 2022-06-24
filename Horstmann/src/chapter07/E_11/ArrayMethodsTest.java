package chapter07.E_11;

import java.util.Arrays;

public class ArrayMethodsTest {
	public static void main(String[] args) {
		int [] array = {1,2,3,4,5,6,7,8,9,10};
		
		System.out.println("-------Array initialize--------");
		ArrayMethods test = new ArrayMethods(array);
		System.out.println(Arrays.toString(test.getValues()));
		System.out.println("-------------------------------\n");
		
		
		System.out.println("-------------a-----------------");
		test.swapFirstAndLast();
		System.out.println(Arrays.toString(test.getValues()));
		System.out.println("-------------------------------\n");
		
		System.out.println("-------------b-----------------");
		test.shiftRight();;
		System.out.println(Arrays.toString(test.getValues()));
		System.out.println("-------------------------------\n");
		
		System.out.println("-------------c-----------------");
		test.evenToZeros();;
		System.out.println(Arrays.toString(test.getValues()));
		System.out.println("-------------------------------\n");
		
		System.out.println("-------------e-----------------");
		test.removeCenter();
		System.out.println(Arrays.toString(test.getValues()));
		System.out.println("-------------------------------\n");
		
		System.out.println("-------------f-----------------");
		test.moveEvenLeft();
		System.out.println(Arrays.toString(test.getValues()));
		System.out.println("-------------------------------\n");
		
		System.out.println("-------------g-----------------");
		System.out.println(test.secondMaxValue());
		System.out.println("-------------------------------\n");
		
		System.out.println("-------------h-----------------");
		System.out.println(test.crescentOrder());
		System.out.println("-------------------------------\n");
		
		System.out.println("-------------i-----------------");
		System.out.println(test.twoNearElements());
		System.out.println("-------------------------------\n");
		
		System.out.println("-------------i-----------------");
		System.out.println(test.duplicate());
		System.out.println("-------------------------------\n");
		
		
	}
}
