package chapter06.E_07;

import java.util.Random;
import java.util.Scanner;

public class Permuta {
	public static void main(String[] args) {
		String word;
		Scanner s = new Scanner(System.in);
		System.out.print("Inserisci stringa: ");
		word = s.next();
		Random gen = new Random();
		System.out.println(word);
		for (int z = 0; z < word.length(); z++) {
			int i = gen.nextInt(word.length()-1);
			System.out.print("Scambia " + (i+1));
			int j = 1+i+gen.nextInt(word.length()-i-1);
			System.out.println(" con " + (j+1));
			word =  word.substring(0, i)   + 
					word.substring(j, j+1) + 
					word.substring(i+1, j) +
					word.substring(i, i+1) +
					word.substring(j+1);
			System.out.println(word);
		}
		s.close();
	}

}
