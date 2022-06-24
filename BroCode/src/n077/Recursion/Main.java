package n077.Recursion;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// Recursion = the process in which a method calls itself continuously
		// A method that calls itself is called a recursive method

		Scanner scan = new Scanner(System.in);
		System.out.println("Say hello how many times?: ");
		int number = scan.nextInt();
		
		HelloWorld(number);
	}
	
	static void HelloWorld(int i) {
		if(i>0) {
			System.out.println("Hello World!"+i);
			i--;
			HelloWorld(i);
		}
	}
}
