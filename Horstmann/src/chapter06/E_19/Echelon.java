package chapter06.E_19;

public class Echelon {
	public static void main (String[] args) {
		int n = 20;
		
		/* TOP */
		for (int i = 1; i <= n ; i++) {
			for (int j = 1; j <= n*2-1; j++){
				if (j >= n-i+1 && j <=n+i-1 && j!=n && i != n) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.print("\n");
		}
		/* BOTTOM */
		for (int i = n-1; i >= 0 ; i--) {
			for (int j = n*2-1; j >= 0; j--){
				if (j >= n-i+1 && j <=n+i-1 && j != n) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.print("\n");
		}
	}
}
