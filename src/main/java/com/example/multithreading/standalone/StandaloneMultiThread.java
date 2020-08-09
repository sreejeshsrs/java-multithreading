package com.example.multithreading.standalone;

public class StandaloneMultiThread extends Thread {

	@Override
	public void run() {
		for(int i=1; i<=5; i++) {
			System.out.println("Thread "+Thread.currentThread().getName()+" is running for "+i+" times");
			System.out.println("Thread priority for "+Thread.currentThread().
					getName()+" is "+Thread.currentThread().getPriority());
			try {
				Thread.sleep(500l);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}