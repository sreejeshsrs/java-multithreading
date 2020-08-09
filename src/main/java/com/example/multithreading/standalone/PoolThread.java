package com.example.multithreading.standalone;

public class PoolThread implements Runnable {

	public void run() {
		System.out.println("Executing "+Thread.currentThread().getName());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
