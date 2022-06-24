package chapter05.E_13;

import java.util.Scanner;

public class NumericGrade {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Inserisci il voto in lettere: ");
		String grade = s.next();
		System.out.println(getNumericGrade(grade));
		s.close();
	}
	
	public static double getNumericGrade(String grade) {
		double total = 0;
		switch (grade.charAt(0)) {
		case 'A': total = 4;
		break;
		case 'B': total = 3;
		break;
		case 'C': total = 2;
		break;
		case 'D': total = 1;
		break;
		case 'F': total = 0;
		break;
		default: System.out.println("Inserisci un voto valido.");
		}
		if (grade.length()>1) {
			if ((grade.charAt(1)=='+' && (grade.charAt(0)!='A'&& grade.charAt(0)!='F'))) {
				total += 0.3;
			}else if ((grade.charAt(1)=='-' && grade.charAt(0)!='F')) {
				total -= 0.3;
			}else {
				System.out.println("Inserisci un voto valido.");
			}
		}else if (grade.length()>2) {
			System.out.println("Inserisci un voto valido.");
		}
		return total;
	}

}
