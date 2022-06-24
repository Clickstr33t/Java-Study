package chapter06.E_16;

public class TavolaPitagorica {
	public static void main(String[] args) {
		int row = 1;
		int column =1;
		while (row <=10) {
			System.out.printf("%4d", row * column);
			column++;
			if (column % 11 == 0) {
				System.out.print("\n");
				row++;
				column = 1;
			}
		}
	}
}
