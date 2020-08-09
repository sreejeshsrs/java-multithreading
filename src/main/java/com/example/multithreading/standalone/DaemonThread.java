package com.example.multithreading.standalone;

public class DaemonThread extends Thread {

	// Daemon thread is a service provider thread will exist only if the user threads are available.
	
	@Override
	public void run() {
		if(Thread.currentThread().isDaemon()) {
			System.out.println("****** "+Thread.currentThread().getName()+" is a daemon thread *******");
		} else {
			System.out.println("****** "+Thread.currentThread().getName()+" is NOT a daemon thread *******");
		}
	}

	
	
}
