package it.test.java;

import java.io.File;

import org.apache.commons.logging.Log;


/**
 * Esempio di classe Prova
 * 
 * <a href="...">esempio</a>
 * 
 * @author Paolo
 * 
 */
public class Prova {
	private int id;
	private Log log;
	private String codiceFiscale;
	
	public static final String provaVar = "";
	public static final String PROVA_VAR = "";
	
	public void leggiFile(String path) {
		/*
		 * dfgdfgdfgdfg 
		 * dfg
		 * dfg
		 * dfg
		 * dfgdfgldkgldf kldf
		 * dfgdfgk kf g
		 * 
		 */
		/* testo una linea */
		File f = new File(path);
	}
	
	/*
	 * 
	 */
	String toXmlString() {
		return ""; /* esempio singola linea */
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Log getLog() {
		return log;
	}

	public void setLog(Log log) {
		this.log = log;
	}

	public String getCodiceFiscale() {
		return codiceFiscale;
	}

	public void setCodiceFiscale(String codiceFiscale) {
		this.codiceFiscale = codiceFiscale;
	}

	public static String getProvavar() {
		return provaVar;
	}

	public static String getProvaVar() {
		return PROVA_VAR;
	}
}
