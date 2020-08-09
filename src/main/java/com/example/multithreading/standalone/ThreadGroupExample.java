package com.example.multithreading.standalone;

public class ThreadGroupExample implements Runnable {

	public void run() {

		System.out.println("Running thread group class for thread "+Thread.currentThread().getName());
		
	}

	
	public static void main(String[] args) {
		
		ThreadGroupExample tge = new ThreadGroupExample();
		
		ThreadGroup threadGroup = new ThreadGroup("TG1");
		
		Thread t1 = new Thread(threadGroup, tge, "Thread1");
		t1.start();
		
		Thread t2 = new Thread(threadGroup, tge, "Thread2");
		t2.start();
		
		Thread t3 = new Thread(threadGroup, tge, "Thread3");
		t3.start();
		
		System.out.println("Thread Group Name :: "+threadGroup.getName());
		threadGroup.list();
	}
	
}
