package it.corso.java.oop;

import java.util.ArrayList;
import java.util.List;

public class Libro extends Prodotto {
	private String autore;
	
	public String getAutore() {
		return autore;
	}

	public void setAutore(String autore) {
		this.autore = autore;
	}
	
	@Override
	public List<String> getStores() {
		ArrayList<String> tmp = new ArrayList<String>();
		
		tmp.add("Negozio 3");
		tmp.add("Negozio 4");
		
		return tmp;
	}
}
