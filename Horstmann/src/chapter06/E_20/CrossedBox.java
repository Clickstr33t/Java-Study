package chapter06.E_20;

public class CrossedBox {
	public static void main(String[] args) {
		int num = 21;
		int center = 0;
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= num; j++) {
				if (i == 1 || j == 1 || j == num || i == num || i ==j || i == num-j+1) {
					System.out.print("* ");				} else {
					System.out.print("  ");
				}
			}
			System.out.print("\n");
		}
	}

}
