package com.java.interface_test;

import java.util.Random;

public class ThreadTest extends Thread {
	private static final Random random = new Random();
	@Override
	public void run() {
		String threadName = Thread.currentThread().getName();
	    System.out.println("- " + threadName + " has been started");
	    int count = 50 * random.nextInt(40);
	    int delay = random.nextInt(50);
	    
	    System.out.println("t1's count : " + count);
	    System.out.println("t1's delay : " + delay);
	    try {
	    	for (int i =0; i < count; i = i+delay) {
	    		System.out.println( "==>" + threadName + "'s counting..... : "+ i);
	    		Thread.sleep(delay);
	    	}
	      
	    } catch (InterruptedException e) {
	    	e.printStackTrace();
	    }
	    System.out.println("- " + threadName + " has been ended (" + delay + "ms)");
	}
}
