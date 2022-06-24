package chapter04.E04_11;

import java.util.Scanner;

public class Path {
	public static void main(String[] args) {
				
		Scanner input = new Scanner(System.in);
		System.out.print("Inserisci la lettera del drive (es.: C o D etc..): ");
		String path = input.next()+":\\";
		System.out.print("Inserisci il percorso separato da \"\\\" (es.:\\Windows\\System):");
		path += input.next()+"\\";
		System.out.print("Inserisci il nome del file senza estensione (es.: Readme): ");
		path += input.next()+".";
		System.out.print("Inserisci l'estensinone del file senza il punto (es.:txt): ");
		path += input.next();
		
		System.out.print("\n\nHai inserito il seguente percorso:\n"+path);		
	}
}
