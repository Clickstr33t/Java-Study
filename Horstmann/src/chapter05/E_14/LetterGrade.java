package chapter05.E_14;

import java.util.Scanner;

public class LetterGrade {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Inserisci il voto in numero: ");
		double grade = s.nextDouble();
		System.out.println(getLetterGrade(grade));
		s.close();
	}
	
	public static String getLetterGrade(double grade) {
		if (grade>4 || grade<0) {
			return "Inserisci un valore valido";
		}else if(grade==4) {
			return "A";
		}else if(grade>=3.7) {
			return "A-";
		}else if(grade>=3.3) {
			return "B+";
		}else if(grade>=3) {
			return "B";
		}else if(grade>=2.7) {
			return "B-";
		}else if(grade>=2.3) {
			return "C+";
		}else if(grade>=2) {
			return "C";
		}else if(grade>=1.7) {
			return "C-";
		}else if(grade>=1.3) {
			return "D+";
		}else if(grade>=1) {
			return "D";
		}else if(grade>=0.7) {
			return "D-";
		}else {
			return "F";
		}
	}

}
