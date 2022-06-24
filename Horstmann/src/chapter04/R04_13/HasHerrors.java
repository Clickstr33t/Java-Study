package chapter04.R04_13;

import java.util.Scanner;

public class HasHerrors {
	public static void main(String[] args) {
		int x = 0;
		int y = 0;
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter an integer: ");
		x = Integer.parseInt(in.next());
		System.out.print("Please enter another integer: ");
		y = Integer.parseInt(in.next());
		System.out.println("The sum is " + x + y);
	}

}
