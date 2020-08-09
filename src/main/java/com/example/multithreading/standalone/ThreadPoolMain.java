package com.example.multithreading.standalone;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolMain {

	public static void main(String[] args) {

		ExecutorService executor = Executors.newFixedThreadPool(20);
		
		for(int i=1; i<=10; i++) {
			PoolThread threadPool = new PoolThread();
			executor.execute(threadPool);
		}
		executor.shutdown();
		
		while(executor.isTerminated()) {
			System.out.println("Thread terminated !!!");
		}
		
		System.out.println("Finished executing threads !!!");
	}

}
