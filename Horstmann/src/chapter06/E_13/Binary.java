package chapter06.E_13;

public class Binary {
	public static void main(String[] args) {
		int num = 13;
		while (num !=0) {
			System.out.println(num%2);
			num = (num - num%2)/2;
		}
	}

}
