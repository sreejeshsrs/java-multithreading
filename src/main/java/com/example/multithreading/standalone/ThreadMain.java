package com.example.multithreading.standalone;

public class ThreadMain {

	public static void main(String[] args) throws Exception {

		Thread t1 = new StandaloneMultiThread();
		t1.setPriority(Thread.MIN_PRIORITY);
		
		Thread t2 = new StandaloneMultiThread();
		t2.setPriority(Thread.MAX_PRIORITY);
		// Even if we set priority, its up to JVM
		
		t1.start();
		
		t1.join(); // This will make sure that thread t2 will join only after thread 1 is completed
		
		t2.start();
		
		DaemonThread d1 = new DaemonThread();
		d1.setDaemon(Boolean.TRUE);
		d1.start();
		
		DaemonThread d2 = new DaemonThread();
		d2.start();
	}

}
