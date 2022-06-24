package singleTon;

public class TestLogger {
	
	public static void main(String[] args) {
		
		
		/*
		 * Un single ton ritorna attraverso un metodo
		 * un'instanza unica di una classe
		 * impendendo la costruzione diretta 
		 * 
		 * SCOPO: AVERE SOLO UN'INSTANZA DI UNA CLASSE
		 */
		
		System.out.println("------ SingleTon --------");
		
		Logger obj1 = Logger.getInstance();
		Logger obj2 = Logger.getInstance();
				
		System.out.println(obj1.hashCode() + " = " + obj2.hashCode());
		
		System.out.println("----- NON SingleTon -----");
		
		TestLogger obj3 = new TestLogger(); 
		TestLogger obj4 = new TestLogger();
		
		System.out.println(obj3.hashCode() + " != " + obj4.hashCode());
	}
}
