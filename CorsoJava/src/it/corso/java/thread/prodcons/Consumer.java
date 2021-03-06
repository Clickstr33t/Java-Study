package it.corso.java.thread.prodcons;

import java.util.List;

public class Consumer implements Runnable {
	private final List<Integer> bufferCondiviso;
	
    public Consumer(List<Integer> bufferCondiviso, int size) {
        this.bufferCondiviso = bufferCondiviso;
    }

    @Override
    public void run() {
        while (true) {
            try {
                System.out.println(Thread.currentThread().getName()+" sta leggendo il buffer... ");
                consume();
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }

    private void consume() throws InterruptedException {
        // il thread resta in stato wait se il buffer ? vuoto
    	
        while (bufferCondiviso.isEmpty()) {
            synchronized (bufferCondiviso) {
                System.out.println("Il buffer ? vuoto, "+Thread.currentThread().getName()+" resta in attesa... la dimensione del buffer adesso ?: " + bufferCondiviso.size());

                bufferCondiviso.wait();
            }
        }

        // il buffer contiene elementi, quindi il thread pu? eliminarne uno e notificarlo al producer
        synchronized (bufferCondiviso) {
        	System.out.println(Thread.currentThread().getName()+" sta leggendo il buffer ed eliminando il seguente elemento: " + bufferCondiviso.remove(0) + " la dimensione del buffer adesso ?: " + bufferCondiviso.size());
        	
        	bufferCondiviso.notifyAll();
        }
    }
}
