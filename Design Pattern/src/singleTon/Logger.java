package singleTon;

/*
 * SCOPO: AVERE SOLO UN OGGETTO DI UNA CLASSE
 * 
 * SI REALIZZA: 
 * 1- METTENDO UN COSTRUTTORE PRIVATE
 * 2- CREANDO UN METODO CHE RESTIUSCE L'ISTANZA
 * 	  DOPO AVER VERIFICATO SE ESISTE GIA ALTRIMENTI LA CREA
 */

public class Logger {
	
	private static Logger logger;
	
	private Logger() {
		
	}
	
	public static Logger getInstance() {
		
		if(logger == null) {
			logger = new Logger();
		}
		return logger;
	}
}
