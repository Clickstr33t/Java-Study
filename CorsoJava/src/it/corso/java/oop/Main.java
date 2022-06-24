package it.corso.java.oop;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		
//		Utente paolo = new Utente("Paolo", "Preite");
//		Utente antonio = new Utente("Antonio", "Preite");
//
//		Utente chiara = new Utente();
//		
//		paolo.setEmail("info@paolopreite.it");
//		paolo.setUsername("");
//		antonio.setEmail("a.preite@test.it");
//		
//		
		
		Prodotto p = new Prodotto();
		List<String> s1 = p.getStores();
		
		System.out.println("Negozi PRODOTTO");
		for (String string : s1) {
			System.out.println(string);
		}
		
		Smartphone s = new Smartphone();
		List<String> s2 = s.getStores();
		
		System.out.println("Negozi SMARTPHONE");
		for (String string : s2) {
			System.out.println(string);
		}
		
		Libro l = new Libro();
		List<String> s3 = l.getStores();
		
		System.out.println("Negozi LIBRO");
		for (String string : s3) {
			System.out.println(string);
		}
		
		Televisore tv = new Televisore();
		tv.setNome("SMARTV ETC");
		
		List<String> s4 = tv.getStores();
		
		System.out.println("Negozi TELEVISORE");
		for (String string : s4) {
			System.out.println(string);
		}
		
		
		System.out.println(tv.getNome());

	}

}
