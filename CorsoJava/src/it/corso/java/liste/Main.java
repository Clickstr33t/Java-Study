package it.corso.java.liste;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import it.corso.java.oop.gestionale.Smartphone;

public class Main {

	public static void main(String[] args) {
		Main m = new Main();
		
//		m.creaArray();
//		m.arrayMultidimensionale();
		
//		m.esempioArrayList();
		
//		m.esempioHashMap();
		
//		m.getConfig();
		
		m.esempioItearazione();
	}
	
	public void esempioItearazione() {
		List<String> lista = new ArrayList<String>();
		
		lista.add("Paolo");
		lista.add("Mario");
		lista.add("Chiara");
		lista.add("Marta");
		
		/* for */
		for(int i = 0; i < lista.size(); i++) {
			String nome = lista.get(i);
			
			System.out.println(nome);
		}
		
		System.out.println("-------");
		
		/* for each */
		for(String nome : lista) {
			System.out.println(nome);
		}
		
		System.out.println("-------");
		
		/* iterator */
		Iterator<String> it = lista.iterator();
		
		while(it.hasNext()) {
			String nome = it.next();
			
			System.out.println(nome);
		}
		
		/****************/
		
		Map<String, Smartphone> mappa = new HashMap<String, Smartphone>();
		
		Smartphone sm = new Smartphone();
		sm.setMarca("Apple");
		sm.setModello("iPhone");
		
		mappa.put(sm.getModello(), sm);
		
		Smartphone sm2 = new Smartphone();
		sm2.setMarca("Samsung");
		sm2.setModello("Galaxy");
		
		mappa.put(sm2.getModello(), sm2);
		
		
		Set<String> chiavi = mappa.keySet();
		
		System.out.println("-------");
		/* for each */
		for (String string : chiavi) {
			System.out.println(string);
		}
		
		System.out.println("-------");
		/* iterator */
		
		Iterator<String> it2 = chiavi.iterator();
		
		while(it2.hasNext()) {
			String chiave = it2.next();
			
			System.out.println(chiave);
		}
	}
	
	public void getConfig() {
		Properties p = new Properties();
		
		InputStream is;
		try {
			is = new FileInputStream(new File("E:\\corso_java\\config.properties"));
			
			p.load(is);
			
			/*
			 * db-name=corso
				db-address=127.0.0.1
				db-user=root
				db-password=test
			 */
			System.out.println(p.getProperty("db-name"));
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	
	public void esempioHashMap() {

		Map<String, Smartphone> mappa = new HashMap<String, Smartphone>();
		
		Smartphone sm = new Smartphone();
		sm.setMarca("Apple");
		sm.setModello("iPhone");
		
		mappa.put(sm.getModello(), sm);
		
		Smartphone sm2 = new Smartphone();
		sm2.setMarca("Samsung");
		sm2.setModello("Galaxy");
		
		mappa.put(sm2.getModello(), sm2);
		
		
		Set<String> chiavi = mappa.keySet();
		
		System.out.println("---");
		for (String string : chiavi) {
			System.out.println(string);
		}
		System.out.println("---");
		
		Smartphone sm3 = mappa.get("iPhone");
		System.out.println(sm3.getMarca() + " " + sm3.getModello());
		
		
		System.out.println(mappa.size());

		System.out.println(mappa.containsKey("Galaxy"));
		mappa.remove("Galaxy");
		System.out.println(mappa.containsKey("Galaxy"));
		
		System.out.println(mappa.size());
		
		
		/* andrà in errore perché mappa.get("Galaxy") ritorna null!!! */
		Smartphone sm4 = mappa.get("Galaxy");
		System.out.println(sm4.getMarca() + " " + sm4.getModello());
		
		
		
		HashMap<String, Smartphone> mappa2 = new HashMap<String, Smartphone>();
		
	}

	public void esempioArrayList() {
		
		List<String> lista = new ArrayList<String>();
		
		lista.add("Paolo");
		lista.add("Mario");
		lista.add("Chiara");
		lista.add("Marta");
		
		lista.add(2, "Valerio");
		
		for (String string : lista) {
			System.out.println(string);
		}
		
		lista.remove(2);
		
		System.out.println("--------");
		for (String string : lista) {
			System.out.println(string);
		}
		
		lista.set(2, "Claudia");
		
		System.out.println("--------");
		for (String string : lista) {
			System.out.println(string);
		}
		
		System.out.println(lista.size());
		System.out.println(lista.isEmpty());
		
		lista.clear();
		
		System.out.println(lista.size());
		System.out.println(lista.isEmpty());
		
		lista.add("Paolo");
		lista.add("Mario");
		lista.add("Chiara");
		lista.add("Marta");
		
		System.out.println("--------");
		System.out.println("Mario si trova alla posizione " + lista.indexOf("Mario"));
		
		System.out.println("--------");
		System.out.println(lista.toString());
		
		String[] listaArray1 = (String[])lista.toArray();
		
		String[] listaArray2 = lista.toArray(new String[lista.size()]);
		
		List<Smartphone> lista2 = new ArrayList<Smartphone>();
		
		Smartphone sm = new Smartphone();
		sm.setMarca("Apple");
		sm.setModello("iPhone");
		
		lista2.add(sm);
		
		Smartphone sm2 = new Smartphone();
		sm2.setMarca("Samsung");
		sm2.setModello("Galaxy");
		
		lista2.add(sm2);
		System.out.println(lista2.toString());
	}
	
	/**
	 *  le righe sono iterate con il primo for(i=0; i...)
	 *  data la riga i, prendo gli elementi di una riga con il secondo for(j=0; j...)
	 *  
	 *  l'elemento di una matrice sarà matrice[i][j]
	 *  
	 * 	1 2 3 4 5 6 7 8 9 10
	 *  2 2 3 4 5 6 7 8 9 10  
	 *  3 2 3 4 5 6 7 8 9 10
	 *  4 2 3 4 5 6 7 8 9 10
	 *  5 2 3 4 5 6 7 8 9 10
	 *  6 2 3 4 5 6 7 8 9 10
	 *  7 2 3 4 5 6 7 8 9 10
	 *  8 2 3 4 5 6 7 8 9 10
	 *  9 2 3 4 5 6 7 8 9 10
	 *  10 2 3 4 5 6 7 8 9 10
	 */
	public void arrayMultidimensionale() {
		int[][] matrice = new int[10][10];
		
		for(int i = 0; i < matrice.length; i++) {
			for(int j = 0; j < matrice[i].length; j++) {
				matrice[i][j] = i+j; 
			}
		}
		
		for(int i = 0; i < matrice.length; i++) {
			for(int j = 0; j < matrice[i].length; j++) {
				System.out.println(matrice[i][j]);
			}
		}
	}
	
	
	public void creaArray() {
		int[] test; /* definizione */
		test = new int[5]; /* inizializzazione */
		
		
		
		int[] numeri = new int[10]; /* definizione ed inizializzazione */
		
		numeri[0] = 10;
		numeri[1] = 11;
		numeri[2] = 12;
		numeri[3] = 13;
		numeri[4] = 14;
		numeri[5] = 15;
		numeri[6] = 16;
		numeri[7] = 17;
		numeri[8] = 18;
		numeri[9] = 19;
		
		for(int i = 0; i < numeri.length; i++) {
			numeri[i] = 10+i;
		}
		
		Smartphone[] prodotti = new Smartphone[3];
		
		prodotti[0] = new Smartphone();
		prodotti[0].setMarca("Apple");
		prodotti[0].setNome("iPhone");
		
		prodotti[1] = new Smartphone();
		prodotti[1].setMarca("Samsung");
		prodotti[1].setNome("Note");
		
		prodotti[2] = new Smartphone();
		prodotti[2].setMarca("Huawei");
		prodotti[2].setNome("P8Lite");
		
		for(int i = 0; i < prodotti.length; i++) {
			Smartphone sm = prodotti[i];
			
			System.out.println(sm.getMarca() + " " + sm.getNome());
		}
		
		for (Smartphone sm : prodotti) {
			System.out.println(sm.getMarca() + " " + sm.getNome());
		}
	}
}
