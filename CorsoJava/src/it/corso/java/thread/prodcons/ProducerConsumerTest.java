package it.corso.java.thread.prodcons;

import java.util.LinkedList;
import java.util.List;

public class ProducerConsumerTest {
	public static void main(String args[]) {
        List<Integer> bufferCondiviso = new LinkedList<Integer>();
        int size = 4;
        
        Thread prodThread1 = new Thread(new Producer(bufferCondiviso, size), "Producer1");
        Thread prodThread2 = new Thread(new Producer(bufferCondiviso, size), "Producer2");
        Thread consThread = new Thread(new Consumer(bufferCondiviso, size), "Consumer");
        
        
        prodThread1.start();
        prodThread2.start();
        consThread.start();
    }
}
