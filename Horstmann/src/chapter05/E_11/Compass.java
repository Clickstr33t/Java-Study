package chapter05.E_11;

import java.util.Scanner;

public class Compass {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("I gradi visualizzati nella bussola:");
		int degree = Math.abs(s.nextInt());

		System.out.println(query(degree));
		query(degree);
		s.close();
	}
	public static String query(int a) {
		if ((a>360)){
			return "Out of range";
		}
		else if (a>337){
			return "N";
		}
		else if (a>293){
			return "NW";
		}
		else if (a>247){
			return "W";
		}
		else if (a>203){
			return "SW";
		}
		else if (a>157){
			return "S";
		}
		else if (a>113){
			return "SE";
		}
		else if (a>67){
			return "E";
		}
		else if (a>23){
			return "NE";
		}
		else {
			return "N";
		}
	}
}

