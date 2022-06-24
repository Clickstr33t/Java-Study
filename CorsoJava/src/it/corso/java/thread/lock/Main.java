package it.corso.java.thread.lock;

public class Main {
	public static void main(String[] args) {
		ReentrantLockEsempio counter = new ReentrantLockEsempio();
		
		Contatore c1 = new Contatore(counter, 20, 500);
		c1.setName("Andrea");
		Contatore c2 = new Contatore(counter, 20, 500);
		c2.setName("Cinzia");
		
		c1.start();
		c2.start();
	}
}
